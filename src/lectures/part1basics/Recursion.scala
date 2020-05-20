package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial (n : Int) : Int = {
      if(n<=1) 1
      else n* factorial(n-1)
  }
  def concatenateTailRec(aString:String, n:Int, accumulator:String) : String =
    if(n<=0) accumulator
    else concatenateTailRec(aString, n-1, aString + accumulator)
  println(concatenateTailRec("hello",3,""))

  def isPrimeRecursive(n:Int) : Boolean = {
    @tailrec
    def isPrimeTailrec(t:Int, isStillPrime:Boolean) : Boolean =
      if (!isStillPrime) false
      else if(t<=1) true
      else isPrimeTailrec(t-1, n%t !=0 && isStillPrime)

    isPrimeTailrec(n/2,true)
  }
  println(isPrimeRecursive(69))
  println(isPrimeRecursive(2003))

  def fibRec (n:Int): Int = {
    def FiboTailRec (i:Int, last:Int, nextLast:Int):Int =
      if(i>=n) last
      else FiboTailRec(i+1, last+nextLast, last)

    if(n<=2) 1
    else FiboTailRec(2, 1, 1)
  }
  println(fibRec(8))
}

