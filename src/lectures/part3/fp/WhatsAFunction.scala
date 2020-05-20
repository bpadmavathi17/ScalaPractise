package lectures.part3.fp

object WhatsAFunction extends App {

  val concat: ((String, String) => String) = (v1: String, v2: String) => v1 + v2
  val intToInt = new Function1[Int, Int] {
    override def apply(v1: Int): Int = v1 * 2
  }
  val intToFun: Function[Int, Function1[Int, Int]] = new Function1[Int, Function1[Int, Int]] {
    override def apply(v1: Int): Function[Int, Int] = new Function1[Int, Int] {
      override def apply(x: Int): Int = v1 + x
    }
  }

  def curriedFormat(c:Int, x:Int): Int = c + x



  val addre3 = intToFun(3)
  println(concat("hello"," scala"))
  println(curriedFormat(3)(4))

}
