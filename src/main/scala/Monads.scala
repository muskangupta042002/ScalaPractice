object Monads {
 case class SafeValue[+T](private val internalValue: T){
   def get: T = synchronized{
     internalValue
   }

   def transform[S](transformer: T => SafeValue[S]): SafeValue[S] = synchronized{
     transformer(internalValue)
   }
 }
}
