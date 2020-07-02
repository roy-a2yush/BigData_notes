
import org.apache.spark.SparkContext
import org.apache.log4j.Level
import org.apache.log4j.Logger

object ParellelizeDemo extends App{
  
  Logger.getLogger("org").setLevel(Level.ERROR)
  val sc = new SparkContext("local[*]","ParellelizeDemo")

  val myList = List("WARN: November 4 2019,
  					ERROR: November 4 2019,
  					OK: November 4 2019,
  					WARN: November 4 2019,
  					WARN: November 4 2019,
  					OK: November 4 2019,
  					ERROR: November 4 2019,")
  val originalRdd = sc.parallelize(myList)

  val mappedRdd = originalRdd.map(x=> {
  	val columns = x.split(":")
  	(columns(0),1)
  })

  val reducedRdd = mappedRdd.countByValue

  reducedRdd.foreach(println)

  scala.io.StdIn.readLine()

}