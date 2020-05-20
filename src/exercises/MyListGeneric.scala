package exercises

abstract class MyList[+A] {
  def head : A
  def tail : MyList[A]
  def isEmpty : Boolean
  def add[B >: A](element:B) : MyList[B] // will return a new list every time we modify it
  def printElements : String
  override def toString : String = "[" +  printElements + "]"
}

object Empty extends MyList[Nothing]{
  def head : Nothing = throw new NoSuchElementException //???, throw expression  return nothing
  def tail : MyList[Nothing] = throw new NoSuchElementException
  def isEmpty : Boolean = true
  def add[B >: Nothing] (element:B) : MyList[B] = new Cons(element, Empty)
  override def printElements: String = " "
}

class Cons[+A](h : A, t: MyList[A]) extends MyList[A]{
  def head : A = h
  def tail : MyList[A] = t
  def isEmpty : Boolean = false
  def add[B >: A](element:B) = new Cons(element, this)
  override def printElements: String =
    if (tail.isEmpty) "" + h
    else
      h+ " " + tail.printElements

}
trait MyPredicate

object ListTest extends App{
  val listOfInt : MyList[Int] = new Cons(1, new Cons(2, Empty))
  val listOfString : MyList[String] = Empty

}