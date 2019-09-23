package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || r == 0 || c == r) 1
    else
      pascal((c - 1), (r - 1)) + pascal(c, (r - 1))
  }

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    def balanceInter(chars: List[Char], numberOfParentheseOpen: Int): Boolean =
      chars match {
        case Nil => numberOfParentheseOpen == 0
        case '(' :: tail => balanceInter(tail, numberOfParentheseOpen + 1)
        case ')' :: tail => numberOfParentheseOpen > 0 && balanceInter(tail, numberOfParentheseOpen - 1)
        case _ :: tail => balanceInter(tail, numberOfParentheseOpen)
      }

    balanceInter(chars, 0)
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = {
    coins match {
      case _ if money == 0 => 1
      case h :: t if money > 0 => countChange(money - h, h :: t) + countChange(money, t)
      case _ => 0
    }
  }

}
