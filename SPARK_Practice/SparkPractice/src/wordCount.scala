import org.apache.spark.SparkContext
import org.apache.log4j.Level
import org.apache.log4j.Logger

object wordCount extends App {
  
    Logger.getLogger("org").setLevel(Level.ERROR)
    val sc = new SparkContext("local[*]","wordCount")
    val rdd1 = sc.textFile("/home/roya2yush/Desktop/shared/input2.txt")
    val rdd2 = rdd1.flatMap(_.split(" "))
    val intermediateRdd = rdd2.map(_.toLowerCase())
    val rdd3 = intermediateRdd.map((_,1))
    val rdd4 = rdd3.reduceByKey(_+_)
    //instead of sortByKey we can also use sortBy
    val alternateSort = rdd4.sortBy(_._2, false)
    val rdd5 = rdd4.map(x=>(x._2,x._1))
    val rdd6 = rdd5.sortByKey(false)
    val result = rdd6.collect
    alternateSort.collect.foreach(println)
    for(i<-result) {
      var f = i._2
      var l = i._1
      println(s"$f -> $l")
    }
    scala.io.StdIn.readLine()
  
}