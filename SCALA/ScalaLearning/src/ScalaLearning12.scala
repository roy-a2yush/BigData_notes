

object ScalaLearning12 extends App {
  
  //def main(args: Array[String]) = {
    //println("Hello World")
  //}                                        //Need to write main method in scala if we dont extendApp
  
  //dealing with nulls
  case class Address(city: String, state: String, zip: String)
  class User(email: String, password: String) {
    var firstName: String = _          // should not use nulls
    var lastname: String = _           // should not use nulls
    var address: Address = _           // should not use nulls
  }
  
  class UserNotNull(email: String, password: String) {
    var firstName: Option[String] = Some("Aayush")         // should not use nulls
    var lastName: Option[String] = None          // should not use nulls
    var address: Option[Address] = None          // should not use nulls
  }
  
 // val usr = new User("roy.a2yush@gmail.com","hello1234")
  
  val usrNotNull = new UserNotNull("roy.a2yush@gmail.com","Hello1234")
  
  //println(usr.firstName.length)            //will give null pointer exception
  println(usrNotNull.firstName.getOrElse("<not assigned>"))
  println(usrNotNull.lastName.getOrElse("<not assigned>"))
  
  usrNotNull.lastName = Some("Roy")
  
  println(usrNotNull.lastName.getOrElse("<not assigned>"))
  usrNotNull.address = Some(Address("Jalpaiguri","WB","735101")) 
  
  println(usrNotNull.address.getOrElse("<not assigned>"))
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}