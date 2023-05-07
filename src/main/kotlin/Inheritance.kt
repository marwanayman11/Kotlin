open class DogI(open val name: String){
    fun a(){}
}
class Labrador(override val name: String): DogI(name)
//open class DogI(val name: String)
//class Labrador(name: String): DogI(name)
interface X {
    fun b()
}
class XX: X {
    override fun b() {
        TODO("Not yet implemented")
    }
    fun c(){}
}
open class Y {
    fun h(){}
}
class Z: Y(){
    fun k(){}
    internal val n =""
}
abstract class ShapeDrawer {
    fun drawSquare(){
        drawLine()
    }
    fun drawRectangle(){
        drawLine()
    }
    internal abstract fun drawLine()
}
class AndroidShapeDrawer(): ShapeDrawer() {

    override fun drawLine() {
        //code that draw lines for android platform
        println("Test code -Draw line for  android platform")
    }
}
class DesktopShapeDrawer():ShapeDrawer(){
    override fun drawLine() {
        //code that draw lines for android platform
        println("Test code -Draw line for  desktop platform")
    }
}
fun main() {
    val lab = Labrador("Coco")
    println(lab.name)
    val androidDrawer:ShapeDrawer = AndroidShapeDrawer()
    androidDrawer.drawSquare()
    val desktopDrawer:ShapeDrawer = DesktopShapeDrawer()
    desktopDrawer.drawSquare()
}