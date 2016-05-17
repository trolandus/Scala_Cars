package models

case class Car(
    manufacturer:String, model:String,
    price:Int, year:Int, mileage:Int, fuel:String)
    
object Car
{
    var cars = Set(
        Car("Fiat", "Seicento",
        1000, 2000, 150000, "Benzyna")
        )
        
    def findAll = cars.toList.sortBy(_.price)
}