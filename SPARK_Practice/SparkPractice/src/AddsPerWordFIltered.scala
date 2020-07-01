import org.apache.log4j.Level
import org.apache.log4j.Logger
import org.apache.spark.SparkContext
import scala.io.Source


object AddsPerWordFIltered extends App{
  
  def loadBoringWords(): Set[String] = {
    var boringWords: Set[String] = Set()
    val boringFile = Source.fromFile("/home/roya2yush/Downloads/boringwords.txt").getLines()
    for( line <- boringFile)
      boringWords += line
    boringWords
  }
  
  Logger.getLogger("org").setLevel(Level.ERROR)
  val sc = new SparkContext("local[*]","AddsPerWordFiltered")
  
  var boringSet = sc.broadcast(loadBoringWords)
  
  val input = sc.textFile("/home/roya2yush/Downloads/bigdata-campaign-data.csv")
  val splittedInput = input.map(_.split(","))
  val mappedInput = splittedInput.map(x=>(x(10).toFloat,x(0).toLowerCase()))
  val flatInput = mappedInput.flatMapValues(x=>(x.split(" ")))
  val filteredFlatInput = flatInput.filter(x => !boringSet.value(x._2))
  val invertedMap = flatInput.map(x=>(x._2,x._1))
  val reducedMap = invertedMap.reduceByKey(_ + _)
  val sortedResult = reducedMap.sortBy(x=>x._2, false)
  
  sortedResult.take(10).foreach(println)
}