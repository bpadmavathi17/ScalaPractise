package lectures.part1basics

object Functions extends App {
    def greetingFunction(name:String, age:Int) : String =
      "Hi, my name is "+ name + " and I am "+ age + "years old"

    def factorial(n:Int) : Int ={
       if(n == 1) n
       else n * factorial(n-1)

    }

    println(factorial(5))
   def fibonacci(n:Int) : Int = {
     if (n <= 2) 1
     else fibonacci(n-1) + fibonacci(n-2)
   }
   println(fibonacci(8))

  def isEven(n:Int) : Boolean = {
    if(n%2 == 0) true else false
  }
  println(isEven(11))

  def isPrime(n:Int) : Boolean = {
    def isPrimeUntil(t : Int ) : Boolean = {
      if (t<=1) true
      else n%t != 0 && isPrimeUntil(t-1)
    }
    isPrimeUntil(n/2)
  }
  println(isPrime(233))
}
