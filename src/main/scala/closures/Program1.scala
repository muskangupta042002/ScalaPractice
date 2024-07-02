package closures

/* a closure is a function which uses one or more
variables declared outside this function

It consider more recent changes
impure closure - datatypes is var
*/

object Program1 {
var number=10
  val add=(x:Int)=> {
    x+number
  }
  def main(args: Array[String]): Unit = {
     number=19
    println(add(20))
    println(number)
  }
}
