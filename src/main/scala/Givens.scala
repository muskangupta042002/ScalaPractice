import scala.{Ordering, math}

object Givens {
  case class Person(surname: String, name: String, age: Int)

  val personOrdering: Ordering[Person] = new Ordering[Person] {
    override def compare(x: Person, y: Person): Int = {
      x.surname.compareTo(y.surname)
    }
  }

  def listPeople(persons: Seq[Person])(ordering: Ordering[Person]): Int = ???
  def someOtherMethodRequiringOrdering(alice: Person, bob: Person)(ordering: Ordering[Person]): List[Person]=  ???

  given standardPersonOrdering : Ordering[Person] with{
    override def compare(x: Person, y: Person): Int = {
      x.surname.compareTo(y.surname)
    }
  }

}
