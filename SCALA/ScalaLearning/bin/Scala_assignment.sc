object Scala_assignment {
  // QUESTION 1
	val result = scala.io.StdIn.readLine().toInt
	val arr: String = scala.io.StdIn.readLine()
	val arr1: Array[String] = arr.split(" ")
	val arr2: Array[Int] = arr1.map(_.toInt)
	val count1: Array[Double] = arr2.map(math.sqrt(_))
	val count2 = count1.map(x=>{math.ceil(x - math.floor(x))})
	val result1 = result - count2.reduce(_+_).toInt
	println(result1)


	//QUESTION 2
	val f: String = scala.io.StdIn.readLine()
	val f1: Array[String] = f.split(" ")
	val f2: Array[Int] = f1.map(_.toInt)
	
	val a: String = scala.io.StdIn.readLine()
	val a1: Array[String] = a.split(" ")
	val a2: Array[Int] = a1.map(_.toInt)
	val re1: Array[Int] = a2.map(x => if(x<f2(1))1 else 0)
	println(re1.reduce(_+_))


	//QUESTION 3
	val str = scala.io.StdIn.readLine()
	println(str.reverse)
	val strArr = str.split(" ")
	var rev: String = ""
	strArr.map(x=>{rev = x.reverse; print(f"$rev ")})
	println("\n")
	val strArrRev = strArr.reverse
	strArrRev.map(x=>{print(f"$x ")})

}