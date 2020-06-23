object Scala_assignment {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(87); 
  // QUESTION 1
	val result = scala.io.StdIn.readLine().toInt;System.out.println("""result  : Int = """ + $show(result ));$skip(45); 
	val arr: String = scala.io.StdIn.readLine();System.out.println("""arr  : String = """ + $show(arr ));$skip(42); 
	val arr1: Array[String] = arr.split(" ");System.out.println("""arr1  : Array[String] = """ + $show(arr1 ));$skip(42); 
	val arr2: Array[Int] = arr1.map(_.toInt);System.out.println("""arr2  : Array[Int] = """ + $show(arr2 ));$skip(52); 
	val count1: Array[Double] = arr2.map(math.sqrt(_));System.out.println("""count1  : Array[Double] = """ + $show(count1 ));$skip(60); 
	val count2 = count1.map(x=>{math.ceil(x - math.floor(x))});System.out.println("""count2  : Array[Double] = """ + $show(count2 ));$skip(49); 
	val result1 = result - count2.reduce(_+_).toInt;System.out.println("""result1  : Int = """ + $show(result1 ));$skip(18); 
	println(result1);$skip(59); 


	//QUESTION 2
	val f: String = scala.io.StdIn.readLine();System.out.println("""f  : String = """ + $show(f ));$skip(38); 
	val f1: Array[String] = f.split(" ");System.out.println("""f1  : Array[String] = """ + $show(f1 ));$skip(38); 
	val f2: Array[Int] = f1.map(_.toInt);System.out.println("""f2  : Array[Int] = """ + $show(f2 ));$skip(45); 
	
	val a: String = scala.io.StdIn.readLine();System.out.println("""a  : String = """ + $show(a ));$skip(38); 
	val a1: Array[String] = a.split(" ");System.out.println("""a1  : Array[String] = """ + $show(a1 ));$skip(38); 
	val a2: Array[Int] = a1.map(_.toInt);System.out.println("""a2  : Array[Int] = """ + $show(a2 ));$skip(56); 
	val re1: Array[Int] = a2.map(x => if(x<f2(1))1 else 0);System.out.println("""re1  : Array[Int] = """ + $show(re1 ));$skip(26); 
	println(re1.reduce(_+_));$skip(53); 


	//QUESTION 3
	val str = scala.io.StdIn.readLine();System.out.println("""str  : String = """ + $show(str ));$skip(22); 
	println(str.reverse);$skip(29); 
	val strArr = str.split(" ");System.out.println("""strArr  : Array[String] = """ + $show(strArr ));$skip(22); 
	var rev: String = "";System.out.println("""rev  : String = """ + $show(rev ));$skip(51); val res$0 = 
	strArr.map(x=>{rev = x.reverse; print(f"$rev ")});System.out.println("""res0: Array[Unit] = """ + $show(res$0));$skip(15); 
	println("\n");$skip(32); 
	val strArrRev = strArr.reverse;System.out.println("""strArrRev  : Array[String] = """ + $show(strArrRev ));$skip(35); val res$1 = 
	strArrRev.map(x=>{print(f"$x ")});System.out.println("""res1: Array[Unit] = """ + $show(res$1))}

}
