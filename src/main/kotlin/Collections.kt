class User1(val name: String)
data class User2(val name: String)
fun main(){
    val list = listOf("A","B","C")
    println(list+"D")
    println(list+ listOf("D","E"))
    println(listOf("Z")+list)
    println(list.size)
    println(list.isEmpty())
    println(list[0])
    println(list.contains("A"))
    println("A" in list)
    println("Z" !in list)
    for (letter in list){
        println(letter)
    }
    val mutableList = mutableListOf("D","E","F","G")
    mutableList.add("H")
    println(mutableList)
    mutableList.remove("D")
    println(mutableList)
    mutableList[0]= "Z"
    println(mutableList)
    println("------------------Set--------------------")
    val set = setOf("A","B","C")
    println(set)
    println(set+"D")
    println(set+ setOf("D","E"))
    println(setOf("Z")+set)
    println(set.size)
    println(set.isEmpty())
    println(set + "B")//Elements in sets are unique
    val set1 = setOf("A","B","A")
    println(set1)//[A,B]
    val set2 = setOf(User1("A"), User1("A"))
    println(set2 + User1("A"))//[User1@246b179d, User1@7a07c5b4, User1@26a1ab54]
    val set3 = setOf(User2("A"), User2("A"))
    println(set3 + User2("A")) // [User(name=A)]
    println("A" in set)
    println("Z" !in set)
    println(set.contains("A"))
    for (letter in set){
        println(letter)
    }
    val mutableSet = mutableSetOf('A','B','C')
    mutableSet.add('D')
    println(mutableSet)
    mutableSet.remove('B')
    println(mutableSet)
    println("------------------Map--------------------")
    //val capitals = mapOf("USA" to "Washington","Poland" to "Warsaw","Ukraine" to "Kyiv")
    val capitals = mapOf(
        Pair("USA","Washington"),
        Pair("Poland","Warsaw"),
        Pair("Ukraine","Kyiv")
    )
    println(capitals)
    println(capitals["USA"])
    println(capitals["Egypt"])
    val map= capitals + Pair("Egypt","Cairo")
    println(map)
    val map1 = mapOf('A' to "Alex", 'B' to "Bob")
    val map2 = map1 + ('B' to "Barbara")
    println(map1) // {A=Alex, B=Bob}
    println(map2) // {A=Alex, B=Barbara}
    val map3 = map1 - 'B'
    println(map3)
    println('A' in map1)
    println('Z' in map1)
    println(map1.size)
//    for(entry in capitals){
//        println("${entry.value} is capital of ${entry.key}")
//    }
    for ((country,capital) in capitals){
        println("$capital is capital of $country")
    }
    val mutableMap = mutableMapOf(
        'A' to "Alex",
        'B' to  "Barbara",
    )
    mutableMap['C'] = "Celina"
    println(mutableMap)
    mutableMap.remove('B')
    println(mutableMap)
}