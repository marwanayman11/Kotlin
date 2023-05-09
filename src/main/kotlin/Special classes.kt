fun main(){
    val pluto1 = DogN("Pluto")
    val pluto2 = DogN("Pluto")
    println(pluto1 == pluto2) //false
    println(pluto1 == pluto1) //true
    println(pluto1) //DogN@2f4d3709
    println(pluto2) //DogN@4e50df2e
    val pluto3 = DogData("Pluto",1)
    val pluto4 = DogData("Pluto",2)
    val rex = DogData("Rex",3)
    println(pluto3 == pluto4) //true
    println(pluto3 == pluto3) //true
    println(pluto3 == rex) //false
    println(pluto3) //DogData(name=Pluto)
    println(pluto4) //DogData(name=Pluto)
    println(rex) //DogData(name=Rex)
    val (name,age) = pluto3
    println(name)
    println(age)
    println(pluto3.copy()) //DogData(name=Pluto, age=1)
    println(pluto3.copy(name= "Neptune")) //DogData(name=Neptune, age=1)
    println(pluto3.copy(age= 4)) //DogData(name=Pluto, age=4)
    val pair = Pair(1.0,"A")
    println(pair.first) //1.0
    println(pair.second) //A
    val (number,letter) = pair
    println(number) //1.0
    println(letter) //A
    // There is also another way to create a pair: by placing the to function between two values. The result is a pair of those two values.
    val pair1 = 1.0 to "A"
    val triple = Triple(1.0,"A",true)
    println(triple.first) //1.0
    println(triple.second) //A
    println(triple.third)  //true
    val (num,char,boolean) = triple
    println(num) //1.0
    println(char) //A
    println(boolean) //true
}
class DogN(val name: String)
data class DogData(val name: String, val age: Int)