package lectures.part1basics

object SmartStringOperations extends App {

  var aString : String = "Hello I am learning Scala"

  println(aString.charAt(2)) // zero indexed
  println(aString.substring(7,11)) // 7 inclusive 11 exclusive
  //println(aString.split(" ").toList()) //prints words
  println(aString.startsWith("Hello"))
  println(aString.replace(" ","-"))
  println(aString.toLowerCase())
  println(aString.toUpperCase())

  val a ="ghfasgd"
  val b = a :+'c'
  println(b)

  val name = "david"
  val age = 12
  val greeting = s"hi I am $name. I am $age years old"
  val greet = s"hi I will be ${age + 1} years old in a year"

  println(greet)
  println(greeting)


  val x=1.1f
  //val str = f"$x%3d"
  //println(str)

  val speed = 111.2333f
  val test = f"$name%s can eat $speed%2.2f per minute"
  println(test)




}
