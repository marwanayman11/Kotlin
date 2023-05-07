fun main() {
    println(factorial(4))
    println(factorialRecursion(4))
}
fun factorial (number : Int) : Int {
    var accumulator = 1
    for(i in 1..number){
        accumulator *= i
    }
    return accumulator
}
fun factorialRecursion (number: Int) : Int {
    if(number <= 1){
        return 1
    }
    return factorialRecursion(number -1) * number

}