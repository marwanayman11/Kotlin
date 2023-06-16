data class Student(
    val fullName: String,
    val grade: Double,
    val id: Int
)
    val student: List<Student> = listOf(
        Student("John",140.0,223),
        Student("Mark",120.0,548),
        Student("Natali",150.0,342),
        Student("Sara",130.0,781),
    )
fun getStudentById(id: Int): Student {
    return student.find { it.id == id }!!
}
fun searchInStudents(name: String):Student?{
    return student.find { it.fullName.lowercase() == name.lowercase()  }
}
fun main(){
    println("Please, enter the ID of the student")
    val id = readln().toInt()
    println(getStudentById(id))
    println("Please, Enter the student's name")
    val name = readln()
    println(searchInStudents(name)?: "The student is not found")

}
