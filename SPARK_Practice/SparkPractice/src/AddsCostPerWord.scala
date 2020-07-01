
import org.apache.spark.SparkContext
import org.apache.log4j.Level
import org.apache.log4j.Logger

object AddsCostPerWord extends App{
  
  Logger.getLogger("org").setLevel(Level.ERROR)
  val sc = new SparkContext("local[*]","sparkPractice7")
  
  val input = sc.textFile("/home/roya2yush/Downloads/bigdata-campaign-data.csv")
  val splittedInput = input.map(_.split(","))
  val mappedInput = splittedInput.map(x=>(x(10).toFloat,x(0).toLowerCase()))
  val flatInput = mappedInput.flatMapValues(x=>(x.split(" ")))
  val invertedMap = flatInput.map(x=>(x._2,x._1))
  val reducedMap = invertedMap.reduceByKey(_ + _)
  val sortedResult = reducedMap.sortBy(x=>x._2, false)
  
  sortedResult.take(10).foreach(println)

}