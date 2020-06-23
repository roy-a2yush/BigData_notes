object ScalaLearning11 {
  
	class Person(name: String, agr: Int)
	case class PersonCase(name: String, age: Int);import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(196); 
	//1. All class parameters are promoted to fields
	val p1 = new Person("Aayush",21);System.out.println("""p1  : ScalaLearning11.Person = """ + $show(p1 ));$skip(109); 
	//println(p1.name)                        // It will give error
	
	val p1Case = new PersonCase("Aayush",21);System.out.println("""p1Case  : ScalaLearning11.PersonCase = """ + $show(p1Case ));$skip(22); 
	println(p1Case.name);$skip(50); 
	
	
	//2. sensible toString
	println(p1.toString);$skip(13); 
	println(p1);$skip(28); 
	
	println(p1Case.toString);$skip(17); 
	println(p1Case);$skip(88); 


	//3. equals and hashCode method aleady implemented
	val p2 = new Person("Aayush",21);System.out.println("""p2  : ScalaLearning11.Person = """ + $show(p2 ));$skip(19); 
	println(p1 == p2);$skip(44); 
	
	val p2Case = new PersonCase("Aayush",21);System.out.println("""p2Case  : ScalaLearning11.PersonCase = """ + $show(p2Case ));$skip(27); 
	println(p1Case == p2Case);$skip(92); 
	

	//4. Have companion objects created already
	val p3Case = PersonCase.apply("Aayush",21);System.out.println("""p3Case  : ScalaLearning11.PersonCase = """ + $show(p3Case ));$skip(17); 
	println(p3Case);$skip(38); 
	val p4Case = PersonCase("Aayush",21);System.out.println("""p4Case  : ScalaLearning11.PersonCase = """ + $show(p4Case ));$skip(17); 
	println(p4Case);$skip(50); 
	
	
	//5. copy method
	val p5Case = p2Case.copy();System.out.println("""p5Case  : ScalaLearning11.PersonCase = """ + $show(p5Case ));$skip(17); 
	println(p5Case);$skip(34); 
	val p6Case = p3Case.copy(age=22);System.out.println("""p6Case  : ScalaLearning11.PersonCase = """ + $show(p6Case ));$skip(17); 
	println(p6Case)}
	
	//6. serializable


















}
