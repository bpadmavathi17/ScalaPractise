package lectures.part1basics

object Expressions extends App{
  val x = 1+2
  println(x)
  println( 2+3*4)
  var aVariable = 0

  val aWeirdValue = (aVariable = 3) //unit
  val aCodeBlock = {
    val y=2
    val z= y+1

    if(z>2) "hello" else "goodbye"
  }

}
