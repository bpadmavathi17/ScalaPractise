package lectures.part2OOP
import  scala.language.postfixOps

object MethodNotations extends App{

  class Person(val name:String, favMovie:String, val age:Int = 10) {
    def likes(movie:String):Boolean = movie == favMovie
    def hangoutWith(person:Person):String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"$name what the heck"
    def isAlive : Boolean = true
    def apply() = s"Hi! $name "


    def +(nickName:String) : Person = new Person(name+nickName, favMovie)
    def unary_+ : Person = new Person(name,favMovie, age+1)
    def learns(sub:String) : String = s"$name learns $sub"
    def learnsScala  = this learns "Scala"
    def apply(times:Int):String = s"$name watched $favMovie $times times"




  }
  val mary  = new Person("Mary","Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") //infix notation or operation notation

  val tom = new Person("Tom","FightClub")
  println(mary hangoutWith tom)
  println(!mary)
  println(mary.unary_!)
  println(mary.isAlive)
  println(mary isAlive)
  println(mary())
  println(mary.apply())


  println((mary + ("the rockstar")).name)

  val incMary = +mary
  println(incMary.age)

  println(mary learnsScala)

  println(mary(3))







}
