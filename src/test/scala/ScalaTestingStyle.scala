import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.propspec.AnyPropSpec
import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.Expectations._
import org.scalatest.matchers.should.Matchers._
object ScalaTestingStyle

class CalculatorSuite extends AnyFunSuite{
  val calci=new Calculator
  test("multiplication by 0 should always be 0"){
    assert(calci.multiply(8,0)===0)
    expect(1){

    }
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

//use when large codebase..aliging team with same methodology
class CalculatorWordSpec extends  AnyWordSpec{
  val calci=new Calculator
  "A calculator" should{
    "give back 0 if multiplying by 0" in{
      assert(calci.multiply(8,0)==0)
    }

    "throw a math error while dvifing by 0" in {
      assertThrows[ArithmeticException](calci.divide(8,0))
    }
  }
}

class CalculatorFreeSpec extends  AnyFreeSpec{
  //most flexible style
  val calci=new Calculator
  "A calculator" - {
    "give back 0 if multiplying by 0" in{
      assert(calci.multiply(8,0)==0)
    }

    "throw a math error while dvifing by 0" in {
      assertThrows[ArithmeticException](calci.divide(8,0))
    }
  }
}

//property-style checking
class CalculatorPropSpec extends AnyPropSpec{
  val calci=new Calculator
  val multiplyByZeroExamples = List((65,0),(8,0),(0,0))

  property("calculator multiply by zero should be 0"){
    assert(multiplyByZeroExamples.forall{
      case(a,b) => calci.multiply(a,b)==0
    })
  }

  property("divide by zero shows error"){
    assertThrows[ArithmeticException](calci.divide(8,0))
  }
}

class Calculator{
  def add(a:Int, b:Int): Int = a+b
  def subtract(a:Int, b:Int): Int = a-b
  def multiply(a:Int, b:Int): Int = a*b

  def divide(a:Int, b:Int): Int = a/b
}