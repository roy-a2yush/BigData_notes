

object ScalaLearning13 extends App{
  
  val b = for(i <- 1 to 10) i*i
  
  println(b)                              //prints unit
  
  //use of yield
  val c = for(i <- 1 to 10)yield {
    i*i
  }
  println(c)
  
  //limitation of yield
  val d = for(i <- 1 to 10)yield {
    if(i%2 == 0)
      i*i
  }
  println(d)
  
  //what to do instead
  //use if guard
  
  val e = for(i <- 1 to 10; if i%2 == 0)yield {          //remember to not give brackets in the if
      i*i
  }
  println(e)
  
  // we can also make the syntax more understandable
  
  val f = for{
      i <- 1 to 10
      if i%2 == 0
      }yield i*i              // replace brackets by curly braces and you can remove semicolon and write in different lines   
      
  println(f)
  
  
  //pattern guuard
  
  def checkSign(x: Int): String = {
        x match {
          case a if a > 0 => s"$a is a positive no."
          case b if b < 0 => s"$b is a negative no."
          case c => s"$c is zero"
        }
      }
  
  println(checkSign(10))
  
  
  // Reference comparison in scala
  val a1: String = "Aayush"
  val a2: String = "Aayush"
  println(a1==a2)
  println(a1.equals(a2))
  println(a1.==(a2))
  println(a1 equals a2)
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}