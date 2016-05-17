package database

case class CarsDB()

object CarsDB
{
    val Manufacturers : Map[String, List[String]] = Map(
        "" -> List(""),
        "Fiat" -> List("Seicento"),
        "Hyundai" -> List("Atos"))
}