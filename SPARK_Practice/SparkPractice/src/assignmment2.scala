import org.apache.spark.SparkContext
import org.apache.log4j.Logger
import org.apache.log4j.Level


object assignmment2 extends App{
  def findMin(x: String, y: String): String = {
    if (x.toInt<=y.toInt)
      x
    else
      y
  }
  Logger.getLogger("org").setLevel(Level.ERROR)
  val sc = new SparkContext("local[*]","assignment2");
  
  val inputFile = sc.textFile("/home/roya2yush/Downloads/temp-data.csv");
  val inputFile2Array = inputFile.map(_.split(","))
  val keyValue = inputFile2Array.map(x=>(x(0),x(3)))
  
  //inputFile2Array.collect.foreach(println)
  val minTemp = keyValue.reduceByKey((x,y)=>findMin(x,y))
  minTemp.collect.foreach(println)
  scala.io.StdIn.readLine()
}