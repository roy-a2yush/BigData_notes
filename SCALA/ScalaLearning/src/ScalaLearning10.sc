object ScalaLearning10 {
 class Animal {
 	def eat = println("Animals eat a lot.") //make it private and protected and check
 	//private cant be inherited or called from outside the class, protected can be inherited and thus called from the child class only
 }
 class Cat extends Animal {
 		eat
 		def preferredMeal = println("Milk")
 	}
 val cat = new Cat                                //> Animals eat a lot.
                                                  //| cat  : ScalaLearning10.Cat = ScalaLearning10$Cat@b684286
 cat.eat                                          //> Animals eat a lot.
 cat.preferredMeal                                //> Milk
 
 abstract class Mammals {
 val creatureType: String
 def eat
 def sleep = println("Animals sleep a lot")
 }
 
 class Dog extends Mammals {
 val creatureType: String = "canine"
 def eat = println("I eat a lot")
 }
 
 val dog = new Dog                                //> dog  : ScalaLearning10.Dog = ScalaLearning10$Dog$1@880ec60
 dog.eat                                          //> I eat a lot
 dog.sleep                                        //> Animals sleep a lot
 println(dog.creatureType)                        //> canine
 
 trait Carnivore {
 	def preferredMeal = println("I eat Flesh");
 	val cooked: Boolean
 }
 
 trait  ColdBlooded {
 	def bloodTemp = println("I am cold Blodded")
 }
 
 class Crocodile extends Animal with Carnivore with ColdBlooded {
 	val cooked: Boolean = false
 	val creatureType = "canine"
 }
 
 val croc = new Crocodile                         //> croc  : ScalaLearning10.Crocodile = ScalaLearning10$Crocodile$1@3f3afe78
 println(croc.cooked)                             //> false
 croc.preferredMeal                               //> I eat Flesh
 croc.bloodTemp                                   //> I am cold Blodded
 println(croc.creatureType)                       //> canine
 
 
 object Person{
 val alive: Boolean = true
 }
 
 
 
 
 
 
 
 
 
}