import javax.lang.model.element.Name

fun main() {
    val statement = "My favorite dish is"
    val dish =" chapati"
    println(statement+dish)


    val city = "Nairobi"
    println(city[0])
    println(city[1])
    println(city[2])
    println(city[3])
    println(city[4])
    println(city[5])
    println(city[6])


    val Town = "Nairobi"
    println(city.first())
    println(city.last())




    val destination = "Kampala"
    val fare = 20000
    val currency = "UGX"
    val stmt = "The fare to "+ destination+ " is "+fare+" "+currency
    println(stmt)
    val stmt2 =  "The fare to $destination is $fare $currency"

    val String1 ="Vallary"
    val string2 = "Vallary"
    println(String1.equals(string2))

    var name = "Anna Kamotho"
    println(name.uppercase())
    println(name.lowercase())
    println(name.capitalize())
    println(name.length)
   println(name.replaceFirst('a','A'))
    println(name)

var a= ""
var b = ""
println(a.isEmpty())
    println(a.isBlank())

println(b.isEmpty())
println(b.isBlank())

    val country = " Kigali "
    println(country.trimStart())
    println(country.trimEnd())
    println(country.trim())

    val places = "Nakuru Nairobi Kampala Kibwezi Moyale"
            println(places.split (" , "))

    var speech = "Jane said, \"get out\""
    println(speech)




}

