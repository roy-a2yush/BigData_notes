object ScalaLearning10 {
 class Animal {
 	def eat = println("Animals eat a lot.") //make it private and protected and check
 	//private cant be inherited or called from outside the class, protected can be inherited and thus called from the child class only
 }
 class Cat extends Animal {
 		eat
 		def preferredMeal = println("Milk")
 	};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(357); 
 val cat = new Cat;System.out.println("""cat  : ScalaLearning10.Cat = """ + $show(cat ));$skip(9); 
 cat.eat;$skip(19); 
 cat.preferredMeal
 
 abstract class Mammals {
 val creatureType: String
 def eat
 def sleep = println("Animals sleep a lot")
 }
 
 class Dog extends Mammals {
 val creatureType: String = "canine"
 def eat = println("I eat a lot")
 };$skip(236); 
 
 val dog = new Dog;System.out.println("""dog  : ScalaLearning10.Dog = """ + $show(dog ));$skip(9); 
 dog.eat;$skip(11); 
 dog.sleep;$skip(27); 
 println(dog.creatureType)
 
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
 };$skip(325); 
 
 val croc = new Crocodile;System.out.println("""croc  : ScalaLearning10.Crocodile = """ + $show(croc ));$skip(22); 
 println(croc.cooked);$skip(20); 
 croc.preferredMeal;$skip(16); 
 croc.bloodTemp;$skip(28); 
 println(croc.creatureType)}
 
 
 object Person{
 val alive: Boolean = true
 }
 
 
 
 
 
 
 
 
 
}
