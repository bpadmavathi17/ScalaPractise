package exercises

abstract class MyList {
  def head : Int
  def tail : MyList
  def isEmpty : Boolean
  def add(element:Int) : MyList // will return a new list every time we modify it
  def printElements : String
  override def toString : String = "[" +  printElements + "]"
}

object Empty extends MyList{
  def head : Int = throw new NoSuchElementException //???, throw expression  return nothing
  def tail : MyList = throw new NoSuchElementException
  def isEmpty : Boolean = true
  def add(element:Int) : MyList = new Cons(element, Empty)
  override def printElements: String = " "
}

class Cons(h : Int, t: MyList) extends MyList{
  def head : Int = h
  def tail : MyList = t
  def isEmpty : Boolean = false
  def add(element:Int) = new Cons(element, this)
  override def printElements: String =
    if (tail.isEmpty) "" + h
    else
      h+ " " + tail.printElements

}

object ListTest extends App{
  val list = new Cons(1,new Cons(2, new Cons(3, Empty)))
  println(list.tail.tail.head)
  println(list.add(4).head)
  println(list.tail.tail.isEmpty)
  println(list.toString)

}