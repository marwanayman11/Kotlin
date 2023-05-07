fun main(){
    for(i in 5 downTo 1){
        for (j in 1 .. 5-i){
            print(" ")
        }
        for (k in 1..i){
            print("*")
        }
        println()
    }
    println("----------------------------------------------------------")
    for (i in 5 downTo 1){
        for (j in 1..5-i){
            print(" ")
        }
        for (k in 1 until i*2){
            print("*")
        }
        println()
    }
    println("----------------------------------------------------------")
    for (i in 1 until 5){
        for (j in 1..5-i){
            print(" ")
        }
        for (k in 1..i){
            print("*")
        }
        println()
    }
    for (i in 5 downTo 1){
        for (j in 1..5-i){
            print(" ")
        }
        for (k in 1..i){
            print("*")
        }
        println()
    }


}