object LearningScala4 {
  // Data structures
  
  // Tuples (Also really common with Spark!!)
  // Immutable lists
  // Often thought of as database fields, or columns.
  // Useful for passing around entire rows of data.
  
  val captainStuff = ("Picard", "Enterprise-D", "NCC-1701-D")
                                                  //> captainStuff  : (String, String, String) = (Picard,Enterprise-D,NCC-1701-D)
  println(captainStuff)                           //> (Picard,Enterprise-D,NCC-1701-D)
  
  // You refer to individual fields with their ONE-BASED index:
  println(captainStuff._1)                        //> Picard
  println(captainStuff._2)                        //> Enterprise-D
  println(captainStuff._3)                        //> NCC-1701-D
 
 // You can create a key/value pair with ->
 val picardsShip = "Picard" -> "Enterprise-D"     //> picardsShip  : (String, String) = (Picard,Enterprise-D)
 ("picard" , "Enterprise-D")                      //> res0: (String, String) = (picard,Enterprise-D)
 
 println(picardsShip._2)                          //> Enterprise-D
 
 // You can mix different types in a tuple
 val aBunchOfStuff = ("Kirk", 1964, true)         //> aBunchOfStuff  : (String, Int, Boolean) = (Kirk,1964,true)
 
 
 
 // Lists
 // Like a tuple, but it's an actual Collection object that has more functionality.
 // It's a singly-linked list under the hood.
 
 val shipList = List("Enterprise", "Defiant", "Voyager", "Deep Space Nine")
                                                  //> shipList  : List[String] = List(Enterprise, Defiant, Voyager, Deep Space Nin
                                                  //| e)
 
 // Access individual members using () with ZERO-BASED index (confused yet?)
 println(shipList(1))                             //> Defiant
 
 // head and tail give you the first item, and the remaining ones.
 println(shipList.head)                           //> Enterprise
 println(shipList.tail)                           //> List(Defiant, Voyager, Deep Space Nine)
 
 
 // Iterating though a list
 for (a <- shipList) {println(a)}                 //> Enterprise
                                                  //| Defiant
                                                  //| Voyager
                                                  //| Deep Space Nine
 
 // Let's apply a function literal to a list! map() can be used to apply any function to every item in a collection.
val backwardShips = shipList.map( (a: String) => {a.reverse})
                                                  //> backwardShips  : List[String] = List(esirpretnE, tnaifeD, regayoV, eniN eca
                                                  //| pS peeD)
 for (a <- backwardShips) {println(a)}            //> esirpretnE
                                                  //| tnaifeD
                                                  //| regayoV
                                                  //| eniN ecapS peeD
                                                  
// reduce() can be used to combine together all the items in a collection using some function.
val numberList = List(1, 2, 3, 4, 5)              //> numberList  : List[Int] = List(1, 2, 3, 4, 5)


val sum = numberList.reduce( (x: Int, y: Int) => x + y)
                                                  //> sum  : Int = 15
println(sum)                                      //> 15

// filter() can remove stuff you don't want. Here we'll introduce wildcard syntax while we're at it.
val iHateFives = numberList.filter(x => x != 5)   //> iHateFives  : List[Int] = List(1, 2, 3, 4)
val iHateThrees = numberList.filter(_ != 5)       //> iHateThrees  : List[Int] = List(1, 2, 3, 4)

}