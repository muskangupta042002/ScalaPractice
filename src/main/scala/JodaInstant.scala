import org.joda.time.Instant
object JDoodle {
  def add(x:Int, y:Int) = x + y;

  def main(args: Array[String]) {


    // Create an Instant representing the current time
    val now: Instant = Instant.now()

    // Create an Instant from a millisecond value since the Unix epoch
    val instantFromMillis: Instant = new Instant(1618416687000L)

    // Create an Instant from a string in ISO 8601 format
    val instantFromString: Instant = Instant.parse("2021-04-14T12:34:56Z")

    // Create an Instant from a java.util.Date
    val javaDate = new java.util.Date()
    val instantFromDate: Instant = new Instant(javaDate.getTime())

    // Create an Instant from a java.time.Instant (Java 8 time)
    val javaInstant = java.time.Instant.now()
    val instantFromJavaInstant: Instant = new Instant(javaInstant.toEpochMilli())


    // Comparing two Instant objects
    val instant1 = Instant.parse("2021-04-14T12:00:00Z")
    val instant2 = Instant.parse("2021-04-15T12:00:00Z")

    // Compare two Instant objects
    val comparisonResult: Int = instant1.compareTo(instant2)

    // Check if instant1 is before instant2
    val isBefore: Boolean = instant1.isBefore(instant2)

    // Check if instant1 is after instant2
    val isAfter: Boolean = instant1.isAfter(instant2)
//
//    import org.joda.time.{Instant, DateTimeFormatter}
//    import org.joda.time.format.ISODateTimeFormat
//
//    val instant = Instant.now()
//
//    // Define a formatter
//    val formatter: DateTimeFormatter = ISODateTimeFormat.dateTime()
//
//    // Format the instant
//    val instantAsString = formatter.print(instant)
//
//    println("Instant as String: " + instantAsString)


    // Get the current instant
    val currentInstant: Instant = Instant.now()

    // Print the current instant
    println("Current instant: " + currentInstant)

    println(comparisonResult)
    println(isBefore)
    println(isAfter)
  }
}
