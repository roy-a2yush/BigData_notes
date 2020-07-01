import org.apache.log4j.Level
import org.apache.log4j.Logger
import org.apache.spark.SparkContext


object assignment1 extends App{
  Logger.getLogger("org").setLevel(Level.ERROR);
  val sc = new SparkContext("local[*]","assignment1")
  
  def modify(x: Array[String]): Array[String] = {
    if(x(1).toInt>18)
      x ++ Array("Y")
    else
      x ++ Array("N")
  }
  
  val inputFile = sc.textFile("/home/roya2yush/Downloads/dataset1")
  val array = inputFile.map(_.split(","))
  val modifiedArray = array.map(modify(_))
  val modifiedFile = modifiedArray.map(_.mkString(","))
  val result = modifiedFile.collect
  result.foreach(println)
  
}