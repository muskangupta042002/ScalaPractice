package curryinfFn

object Project2 {
  def curry[A,B,C](f: (A, B) => C): A => (B => C) = {
    a => b => f(a,b)
  }
//
//  def main(args: Array[String]) = {
//    val c = curry((a:Int, b:Int) => a == b)
//    println("1 == 2? ", c(1)(2))
//    println("2 == 2? ", c(2)(2))
//
//    val c_partial = c(1)
//
//    println("[partial] 1 == 2? ", c_partial(2))
//    println("[partial] 1 == 1? ", c_partial(1))
//  }

  def uncurry[A,B,C](f: A => B => C): (A, B) => C = {
    (a,b) => f(a)(b)
  }

  def compose[A,B,C](f: B => C, g: A => B): A=> C ={
    a => f(g(a))
  }
  def main(args: Array[String]) = {
        val c = curry((a:Int, b:Int) => a == b)
        println("1 == 2? ", c(1)(2))
        println("2 == 2? ", c(2)(2))

        val c_partial = c(1)

        println("[partial] 1 == 2? ", c_partial(2))
        println("[partial] 1 == 1? ", c_partial(1))

    val sum = (a:Int) => (b:Int) => a + b
    val uncurried = uncurry[Int, Int, Int](sum)
    println("sum(1)(2)", sum(1)(2))
    println("uncurry(1,2)", uncurried(1,2))

    val double=(a:Int)=>2*a
    val toString=(a:Int)=>"new value"+a
    val fun=compose(toString,double)
    println("original value of 2 ",fun(2))
  }
}

