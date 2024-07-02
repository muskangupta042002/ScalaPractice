package curryinfFn

object Program1 {
  def add(x: Int, y: Int) = x+y

  def addUsingCurrying(x: Int)=(y:Int) => x+y

  def addUsingCurryingAnotherWay(x:Int)(y:Int)=x+y

  def main(args: Array[String]): Unit = {
    println(add(20,19))
    println(addUsingCurrying(20)(19))

    val sum40=addUsingCurrying(40)
    println(sum40(56))

    val sum50=addUsingCurryingAnotherWay(30)(20)
    println(sum50)

    val sum21=addUsingCurryingAnotherWay(21)_
    println(sum21(21))
  }
}
