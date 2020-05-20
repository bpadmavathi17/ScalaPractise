package lectures.part1basics

object CallBy extends App {

  def callByValue(x:Long) = {
    println("by value "+ x) // 132542632
    println("by value "+ x) //132542632
  }
  def callByName(x: => Long) = {
    println("by name "+ x) //System.nanoTime()
    println("by name "+ x) //System.nanoTime() computed every time used in function
  }
  callByValue(System.nanoTime()) //132542632
  callByName(System.nanoTime())

  def infinite() : Int = 1+ infinite()
  def callByNam(x:Int, y : =>Int) = println(x)
  //println(callByNam(infinite(),34)) // stackoverflow since inifinte is executed
  callByNam(34,infinite()) // prints 34 as the infinte() is never executed in callbyNam method definition
}
