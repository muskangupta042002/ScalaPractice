import scala.io.Source
import scala.io.StdIn.readLine
object Program1  {
  //println("Hello, world")
  def test(x: Int, y: Int): Boolean ={
    List(x,y).forall { m => m>=40 && m<=50} || List(x,y).forall { m => m>=50 && m<=60}
  }
  def main(args: Array[String]): Unit={
    //println("Hello, world")
//    val a=2; val b=3;
//    if(a==b) println(3*(a+b))
//    else println(a+b)

    //3 diff b/w n and 51
//    val n=scala.io.StdIn.readInt()
//    if(n>51){
//      println(3*Math.abs(n-51))
//    }
//    else println(Math.abs(n-51))

//   val str= scala.io.StdIn.readLine()
//    if(str.startsWith("if")) print(str)
//    else print("if"+str)

//    var x = "Hello World".split(" ")
//    for(i <- x){
//      print(i + "/") //output : Hello/World/
//    }
//
//
//    var y: Array[String] = "Hello World".split(" ")
//    print(y) //output: [Ljava.lang.String;@61a52fbd

//    val empId=12334
//    val name="Jack"
//    val res= name + empId
//    print(res.getClass) output: class java.lang.String

    /*
    val index=scala.io.StdIn.readInt()
    val str=scala.io.StdIn.readLine()
    println(str.take(index) + str.drop(index+1))
    5 muskan -> output: muskan
     */

    /*
    Write a Scala program to exchange the first and last characters in a given string and return the new string.
      val str=scala.io.StdIn.readLine()
    val len=str.length
    println(str.substring(len-1) + str.substring(1,len-1) + str.substring(0,1))
    input: msukan
    output: nsukam
    str.substring(len-1)  charAt(n-1) bhi use kar sakti thhi

    val str=scala.io.StdIn.readLine()

    if(str.drop(1).startsWith("yt")) print(str.replaceFirst("yt",""))
    else print(str)
    //sytout -> sout
    //muskan -> muskan
    */
    val s=readLine
//    val a: Array[Int] = s.split(" ").map(_.toInt)
//    for(i <- a){print(i +" ")}

//    val count_char=s.count{n => n=='z'}
//    if(count_char >=2 && count_char<=4) println(true)
//    else println(false)
  //fizzbuzz -> true , muskan -> false

  }

}
