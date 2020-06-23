

object ScalaLearning14 extends App {
  val pi = 3.14
  val r = 100
  val area = {
    println("calculating area of the circle")
    pi*r*r
  }
  lazy val circumference = {                          //executed only when called
    println("Calculating circumference")
    2*pi*r
  }
  println(area)
  println(circumference)
  
  trait traitA {
    def name = println("This is trait A")
  }
  
  trait traitB extends traitA{
    override def name = println("This is trait B")
    super.name
  }
  
  trait traitC extends traitA{
    override def name = println("This is trait C")
    super.name
  } 
  
  object grandChild extends traitB with traitC
  
  grandChild.name
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}