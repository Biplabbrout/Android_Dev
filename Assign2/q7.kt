interface Drawable {
    fun drawInfo()
}


class Square(val sideLength: Double) : Drawable {
    override fun drawInfo() {
        println("Drawing a square with side length $sideLength")
        println("Area: ${sideLength * sideLength}")
        println("Perimeter: ${4 * sideLength}")
    }
}


class Triangle(val base: Double, val height: Double) : Drawable {
    override fun drawInfo() {
        println("Drawing a triangle with base $base and height $height")
        println("Area: ${0.5 * base * height}")
        println("Perimeter: unknown (need more information)")
    }
}

fun main() {
    val square = Square(6.0)
    val triangle = Triangle(6.0, 4.0)

    println("Drawing a square:")
    square.drawInfo()

    println("\nDrawing a triangle:")
    triangle.drawInfo()
}
