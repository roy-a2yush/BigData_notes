import org.apache.log4j.Logger
import org.apache.log4j.Level
import org.apache.spark.SparkContext


object averageConnctions extends App{
  Logger.getLogger("org").setLevel(Level.ERROR)
  val sc = new SparkContext("local[*]","averageConnections")
  
  val input = sc.textFile("/home/roya2yush/Downloads/friends-data.csv")
  val arrayRdd = input.map(_.split(","))
  val pairRdd = arrayRdd.map(x=>(x(2),x(3).toFloat))
  //val hybridPaidRdd = pairRdd.mapValues(x=>(x,1))
  val hybridPairRdd = pairRdd.map(x=>(x._1,(x._2,1)))
  val sumRdd = hybridPairRdd.reduceByKey((x,y)=>(x._1+y._1,x._2+y._2))
  //val avgRdd = sumRdd.mapValues(x=>x._1/x._2)
  val avgRdd = sumRdd.map(x=>(x._1,x._2._1/x._2._2))
  val sortedRdd = avgRdd.sortByKey()
  sortedRdd.collect.foreach(println)
}