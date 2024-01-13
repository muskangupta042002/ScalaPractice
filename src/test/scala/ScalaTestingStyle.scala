import org.scalatest.funspec.AnyFunSpec
import org.scalatest.funsuite.AnyFunSuite
object ScalaTestingStyle

class CalculatorSuite extends AnyFunSuite{
  val calci=new Calculator
  test("multiplication by 0 should always be 0"){
    assert(calci.multiply(8,0)==0)
  }

  test("divide by 0 should throw error"){
    assertThrows[ArithmeticException](calci.divide(8,0))
  }
}

class CalculatorSpec extends  AnyFunSpec{ //BDD
  val calci=new Calculator
  describe("multiplication"){
    it("should give back 0 if multiplying by 0"){
      assert(calci.multiply(8,0)==0)
    }
  }
  describe("division"){
    it("should give back error "){
      assertThrows[ArithmeticException](calci.divide(8,0))
    }
  }
}



class Calculator{
  def add(a:Int, b:Int): Int = a+b
  def subtract(a:Int, b:Int): Int = a-b
  def multiply(a:Int, b:Int): Int = a*b

  def divide(a:Int, b:Int): Int = a/b
}