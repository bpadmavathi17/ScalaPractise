package lectures.part2OOP

object OOBasics extends App{
  val author = new Writer("Charles", "John", 1812)
  val imposter = new Writer("Charles", "John", 1812)
  val novel = new Novel("Expectation",1830, author)
  println(novel.authorAge)
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(imposter))

  val counter = new Counter
  counter.increment().print
  counter.increment().increment().increment().print
  counter.increment(10).print

}

class Writer(firstName : String, surName: String, val yearOfBirth : Int){
  def fullName( ) : String = firstName + " " + surName
}

class Novel( name : String,  yearOfRelease : Int,  author: Writer ){
  def authorAge : Int = yearOfRelease - author.yearOfBirth
  def isWrittenBy(author:Writer)  = author == this.author
  def copy(newYearRelease : Int): Novel =  new Novel(name, newYearRelease, author)
}

class Counter(val count : Int = 0){
  //def currentCount = n //making it val is same as getter
  def increment() = {
    println("incrementing")
    new Counter(count + 1)
  }// immutability
  def decrement() = new Counter(count - 1)
  def increment(incBy : Int):Counter = {
    if(incBy<=0)  this
    else increment.increment(incBy-1)
  }
  def decrement(decBy : Int) = new Counter(count + decBy)
  def print = println(count)

}