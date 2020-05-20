package lectures.part2OOP

object Inheritance extends App {

  class Animal {
    def eat = println("nom nom")
    //default access specifier is public
    //private cannot be accessed in child class as well
    //protected can be accessed only in child class and parent class
    val creature = "wild"
  }
  class Cat extends Animal
  val cat = new Cat
  cat.eat
  class person(name:String, age:Int){
    def this(name:String) = this(name,0) //auxiliary constructor that takes one input
  }
  class Adult(name:String, age:Int, idCard:String) extends person(name,age) //using original constructor
  class AdultOne(name:String, age:Int, idCard:String) extends person(name) //using auxiliary constructor

  class Dog extends Animal{
    override def eat = println("crunch crunch")

    override val creature: String = "domestic"
  }
  val dog = new Dog
  dog.eat
  println(dog.creature)



}
