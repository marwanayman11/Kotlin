fun main(){
    val weekDay = "Monday"
    val hour = 20
    println("On $weekDay, the opening hours are:")
    when (weekDay) {
        "Monday" -> {
            println("8 AM to 12 PM")
        }
        "Tuesday" -> {
            println("8 AM to 6 PM")
        }
        "Wednesday" -> {
            println("8 AM to 6 PM")
        }
        "Thursday" -> {
            println("8 AM to 6 PM")
        }
        "Friday" -> {
            println("8 AM to 9 PM")
        }
        "Saturday" -> {
            println("9 AM to 4 PM")
        }
        "Sunday" -> {
            println("8 AM to 4 PM")
        }
    }
    val isOpen = when (weekDay) {
        "Monday" -> hour in 8..12
        "Tuesday" -> hour in 8..18
        "Wednesday" -> hour in 8..18
        "Thursday" -> hour in 8..18
        "Friday" -> hour in 8..21
        "Saturday" -> hour in 9..16
        "Sunday" -> hour in 8..16
        else -> false
    }
    if(isOpen) {
        println("Little Lemon is open now")
    }
    else { println("Little Lemon is closed now")
    }
}