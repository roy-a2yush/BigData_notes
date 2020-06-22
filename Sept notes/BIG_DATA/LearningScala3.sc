object LearningScala3 {
 
 
  def squareIt(x: Int) : Int = {
  x * x
  }                                               //> squareIt: (x: Int)Int
  
  println(squareIt(4))                            //> 16
  
  
  def cubeIt(x: Int): Int = {x * x * x}           //> cubeIt: (x: Int)Int
  
  println(cubeIt(2))                              //> 8
  
  def transformInt(x: Int, f: Int => Int) : Int = {
  	f(x)
  }                                               //> transformInt: (x: Int, f: Int => Int)Int
  
  val result = transformInt(2, squareIt)          //> result  : Int = 4
  println (result)                                //> 4
  
  transformInt(3, x => x * x * x)                 //> res0: Int = 27
  
  def divideByTwo(x: Int) = {
  x/2
  }                                               //> divideByTwo: (x: Int)Int
  
  transformInt(10, x => x/2)                      //> res1: Int = 5
  
  transformInt(2, x => {val y = x * 2; y * y })   //> res2: Int = 16
  
  
  
  
  
  
  
  
  
  
  // This is really important!
  
  // EXERCISE
  // Strings have a built-in .toUpperCase method. For example, "foo".toUpperCase gives you back FOO.
  // Write a function that converts a string to upper-case, and use that function of a few test strings.
  // Then, do the same thing using a function literal instead of a separate, named function.
  
}