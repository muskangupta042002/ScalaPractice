object ErrorHandling {
  val magicChar = try{
    val scala: String = "Scala"
    scala.charAt(20)
  }
  catch {
    case e: NullPointerException => 'z'
    case r: RuntimeException => 'p'
  }finally {

  }
  import scala.util.Try
  def main(args: Array[String]): Unit ={

  }
}
