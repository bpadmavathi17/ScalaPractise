package lectures.part1basics

object DefaultArgs extends App{
  def tailRec(n:Int, acc:Int) : Int = {
    if (n<=1) acc
    else tailRec(n-1, n*acc)
  }
  println(tailRec(4,1))
}
