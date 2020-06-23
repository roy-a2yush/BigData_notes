object ScalaLearning11 {
  
	class Person(name: String, agr: Int)
	case class PersonCase(name: String, age: Int)
	//1. All class parameters are promoted to fields
	val p1 = new Person("Aayush",21)          //> p1  : ScalaLearning11.Person = ScalaLearning11$Person@46fbb2c1
	//println(p1.name)                        // It will give error
	
	val p1Case = new PersonCase("Aayush",21)  //> p1Case  : ScalaLearning11.PersonCase = PersonCase(Aayush,21)
	println(p1Case.name)                      //> Aayush
	
	
	//2. sensible toString
	println(p1.toString)                      //> ScalaLearning11$Person@46fbb2c1
	println(p1)                               //> ScalaLearning11$Person@46fbb2c1
	
	println(p1Case.toString)                  //> PersonCase(Aayush,21)
	println(p1Case)                           //> PersonCase(Aayush,21)


	//3. equals and hashCode method aleady implemented
	val p2 = new Person("Aayush",21)          //> p2  : ScalaLearning11.Person = ScalaLearning11$Person@2d6e8792
	println(p1 == p2)                         //> false
	
	val p2Case = new PersonCase("Aayush",21)  //> p2Case  : ScalaLearning11.PersonCase = PersonCase(Aayush,21)
	println(p1Case == p2Case)                 //> true
	

	//4. Have companion objects created already
	val p3Case = PersonCase.apply("Aayush",21)//> p3Case  : ScalaLearning11.PersonCase = PersonCase(Aayush,21)
	println(p3Case)                           //> PersonCase(Aayush,21)
	val p4Case = PersonCase("Aayush",21)      //> p4Case  : ScalaLearning11.PersonCase = PersonCase(Aayush,21)
	println(p4Case)                           //> PersonCase(Aayush,21)
	
	
	//5. copy method
	val p5Case = p2Case.copy()                //> p5Case  : ScalaLearning11.PersonCase = PersonCase(Aayush,21)
	println(p5Case)                           //> PersonCase(Aayush,21)
	val p6Case = p3Case.copy(age=22)          //> p6Case  : ScalaLearning11.PersonCase = PersonCase(Aayush,22)
	println(p6Case)                           //> PersonCase(Aayush,22)
	
	//6. serializable


















}