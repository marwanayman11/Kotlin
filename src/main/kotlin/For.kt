fun main(){
    for (i in 1..5){
        println(i)//1,2,3,4,5
    }
    println("************************")
    for (i in 1 until 5){
        println(i)//1,2,3,4
    }
    println("************************")
    for (i in 5 downTo  1){
        println(i)//5,4,3,2,1
    }
    println("************************")
    for (i in 1..5 step 2){
        println(i)//1,3,5
    }
    println("************************")
    for (i in 1 until 5 step 2){
        println(i)//1,3
    }
    println("************************")
    for (i in 5 downTo 1 step 2){
        println(i)//5,3,1
    }
    println("************************")
    for (num in 5 downTo 1) {
        println("$num lemonades are left")
        println("Glupglupglup")
    }
    println("That is it")
    println("Now I have to go")
}