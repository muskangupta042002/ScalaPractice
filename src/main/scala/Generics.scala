object Generics {

  trait MyList{
    def head: Int
    def tail: MyList
  }

  object Empty extends MyList{
    override def head: Int = throw  new NoSuchElementException()
    override def tail: MyList = throw  new NoSuchElementException()
  }

  case class NonEmpty(h: Int, t: MyList) extends MyList{
    override def head: Int = h

    override def tail: MyList = t
  }

  val someNumbers: MyList=NonEmpty(1, NonEmpty(2, NonEmpty(3, Empty)))

  trait GoodList[A]{
    def head: A
    def tail: GoodList[A]

  }

  case class GoodEmpty[A]() extends  GoodList[A]{
    override def head = throw  new NoSuchElementException()
    override def tail = throw  new NoSuchElementException()
  }

  case class GoodNEmpty[A](h: A, t: GoodList[A]) extends  GoodList[A]{
    override def head: A = h

    override def tail: GoodList[A] = t
  }

  val goodNumbers: GoodList[Int] = GoodNEmpty(1, GoodNEmpty(2, GoodNEmpty(3, GoodEmpty())))
  val firstNumber: Int = goodNumbers.head

  //we cannot use object here because type argument doesnt make its unique which violate singleton rule
  def main(args: Array[String]): Unit={

  }
}
