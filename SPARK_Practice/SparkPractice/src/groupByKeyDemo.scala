
import org.apache.spark.SparkContext
import org.apache.log4j.Level
import org.apache.log4j.Logger

object groupByKeyExample extends App{
  
  Logger.getLogger("org").setLevel(Level.ERROR)
  val sc = new SparkContext("local[*]","groupByKeyExample")

  val input = sc.textFile("/home/roya2yush/Downloads/bigLog.txt")

  val mappedRdd = input.map(x=>{
  	val line = x.split(":")
  	(line(0),1)
  })

  val grouped = mappedRdd.groupByKey()

  grouped.collect().foreach(x => println(s"$x._1 -> $x._2.size"))

  scala.io.StdIn.readLine()

}