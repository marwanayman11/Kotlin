fun main(){
    var a = 10
    var b = a
    a = 20
    // changing a doesn't change b
    println(b)
    // Any type
    var x : Any = "A"
    println(x)
    x = 10
    println(x)
    x = true
    println(x)
    val million = 1_000_000 // long type
    println(million)
    val i = 10
    val l : Long = i.toLong()
    val d1 : Double = i.toDouble()
    val d2 : Double = l.toDouble()
    println(d1)
    println(d2)
    println(10%3)
    // The sign of the result is always the same as the sign of the left side
    println(-1%3)
    println(-2%3)
    val e = 1 + 2L // the type of e is Long
    val f = 1 + 2.0 // the type of f is Double
    val c = 1.0F + 2 // the type of c is Float
    val d = 1.0F + 2.0 // the type of c is Double
    val myChar = 'a'
    println(myChar.code)
    val myString = "Hello"
    val myString2 = """Hello
        |this is a string.
        |It is on multiple lines.
    """.trimMargin()
    println(myString2)
    val age = 26
    val myAge = "My age is $age"
    println(myAge)
    val myString3 = myChar.toString()
    val myLongString = myString + "World"
    val myStringLength = myString.length
    println(myStringLength)
    val startsWithHel = myString.startsWith("Hel")
    val endsWithLo = myString.endsWith("lo")
    val firstChar = myString.first()
    val lastChar = myString.last()
    val equalsHello = myString.equals("Hello")
    val myUpperString = myString.uppercase()
    val myLowerString = myString.lowercase()
    val subString = myString.substring(1)
    println(subString)
    val finishedHomework = false // or true
    val cleanedRoom = true // or false
    val canPlayGames = finishedHomework && cleanedRoom
    println(canPlayGames)
    val carCleaned = false // or true
    val grassCut = true // or false
    val canGoToCinema = carCleaned || grassCut
    println(canGoToCinema)
    println(!true) // false
    println(!!true) // true
    println(!!!true) // false
    println(!!!!true) // true
    println(!!!!!true) // false
    if(carCleaned){
        println("Go")
    }
    else{
        println("Don't go")
    }
    val haveSomeExtraMoney = true
    val tip: Double =
        if (haveSomeExtraMoney) {
            println("Here you go") // Here you go
            1.0 // this value is ignored, because it is not the last one
            5.0 // this value is ignored, because it is not the last one
            10.0
        } else {
            println("Sorry, I am broke")
            0.0
        }
    println(tip) // 10.0
    println("Is it going to rain?")
    val probability = 70
    val text = when{
        probability < 40 -> "Unlikely"
        probability <= 80 -> "Likely"
        probability < 100 -> "Yes"
        else ->"What?"
    }
    println(text)
    val number = 1
    when(number){
        1 -> println("Missed hit")
        2,3,4,5 -> println("Hit with value $number")
        6 -> println("Critical hit")
    }
    val text2 = when(number){
        1 -> println("Missed hit")
        in 2..5 -> println("Hit with value $number")
        6 -> println("Critical hit")
        else -> "Unsupported value"
    }
    println(text2)
    val value: Any = "ABC"
    println(value is Int)
    println(value is String)
    println(value is Any)
    when(value){
        is String -> println("This is String")
        is Int -> println("This is Int")
        is Double -> println("This is Double")
        is Boolean -> println("This is Boolean")
    }
    var k = 1
    while (k*k <100){
        println(k*k)
        k++
    }
    f2()
    printName()
    ascendingTriangle(5)
    println("------------------------")
    descendingTriangle(5)
    println("------------------------")
    isoscelesTriangle(5)
    println(triangleArea(10.0,5.0))
    println(biggerOf(10,6))
    val teacher : Teacher = Teacher(
        id = 1,
        name = "Marwan",
        surname = "Ayman",
        birthday = "19.10.96",
        status = "Active"
    )
    val subject: Subject = Subject(
        name= "Cs",
        teacher = teacher,
        isObligatory = true
    )
    println(subject.isObligatory)
    println(subject.teacher.name)
    val user : User = User("Marwan")
    user.changeName("Ayman")
    println(user.name)
    play(Dog("Rex")) // Retrieving stick
    play(Cat("Garfield")) // Mrr
    val ii: Int = 120
    val ll: Long = 1234567890L
    val dd: Double = 10.0
    consumeAny(ii) // upcasting Int to Any
    consumeAny(ll) // upcasting Long to Any
    consumeAny(dd) // upcasting Double to Any
    consumeNumber(ii) // upcasting Int to Number
    consumeNumber(ll) // upcasting Long to Number
    consumeNumber(dd) // upcasting Double to Number
}
fun f1(){
    val a = "Text 1"
    println(a)
}
fun f2(){
    val b = "Text 2"
    f1()
    println(b)
}
var name = ""
fun setName(){
    name = "Mike"
}
fun printName(){
    setName()
    println(name)
}
fun printStars(num:Int){
    for (i in 1..num){
        print("*")
    }
    println()
}
fun ascendingTriangle(height: Int ){
    for (i in 1..height){
        printStars(i)
    }
}
fun descendingTriangle(height: Int){
    for (i in height downTo 1){
        printStars(i)
    }
}
fun isoscelesTriangle(height: Int){
    ascendingTriangle(height)
    descendingTriangle(height-1)

}
fun triangleArea(width: Double, height: Double):Double{
    return width * height / 2
    println("Will never be called")
}
fun biggerOf(a: Int , b: Int) : Int {
    return when{
        a > b -> a
        else -> b
    }
}
fun triangleAreaSingleExpression(width: Double, height: Double):Double = width * height / 2
fun biggerOfSingleExpression(a: Int, b: Int) : Int = if(a>b) a else b
class Teacher(
    val id : Int,
    val name: String,
    val surname: String,
    val birthday: String,
    val status: String
)
class Subject(
    val name: String,
    val teacher: Teacher,
    val isObligatory: Boolean
)
class User(var name: String){
    fun changeName(name: String){
        println("Changed name from ${this.name} to $name")
        this.name = name
    }
}
interface Animal

class Dog(val name: String) : Animal {
    fun retrieve(item: String) {
        println("Retrieving $item")
    }
}

class Cat(val name: String) : Animal{
    fun pet() {
        println("Mrr")
    }
}

fun play(animal: Animal) {
//    val dog: Dog =
//        animal as Dog // Do that ONLY when you know an object is of the type you are casting to
//    dog.retrieve("stick")
    when(animal){
        is Dog -> animal.retrieve("stick")
        is Cat -> animal.pet()
    }
}
fun consumeAny(any: Any) {}

fun consumeNumber(number: Number) {}
