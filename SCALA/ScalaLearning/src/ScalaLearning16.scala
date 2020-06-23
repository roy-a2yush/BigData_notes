

object ScalaLearning16 extends App {
  
  trait Computer {
    def ram: String
    def hdd: String
    def cpu: String
  }
  
  case class PC(ram: String, hdd: String, cpu: String) extends Computer
  case class Laptop(ram: String, hdd: String, cpu: String) extends Computer
  
  object ComputerFactory {
    def apply(compType: String, ram: String, hdd: String, cpu: String) = compType match {
      case "PC" => PC(ram,hdd,cpu)
      case "Laptop" => Laptop(ram,hdd,cpu)
    }
  }
  
  ComputerFactory("PC","4GB","1TB","2.3gHz")
  ComputerFactory("Laptop","8GB","512GB SSD","2.3gHz")
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}