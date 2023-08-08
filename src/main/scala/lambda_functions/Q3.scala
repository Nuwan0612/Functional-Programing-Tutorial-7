package lambda_functions

object Q3 {

  def prime(n: Int, i: Int = 2): Boolean = i match {
    case y if y >= n => true
    case y if n % y == 0 => false
    case y => prime(n, y + 1)
  }


  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(number => prime(number))
  }

  def main(args: Array[String]): Unit = {
    val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    print(filterPrime(input))
  }
}
