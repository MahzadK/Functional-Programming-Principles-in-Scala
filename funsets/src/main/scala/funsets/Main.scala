package funsets

object Main extends App {
  import FunSets._
  val s1 = singletonSet(1)
  println(s1(2))

  println(contains(singletonSet(1), 1))



}
