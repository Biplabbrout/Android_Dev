abstract class Shape {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}


class Rectangle(private val width: Double, private val height: Double) : Shape() {
    override fun area(): Double {
        return width * height
    }

    override fun perimeter(): Double {
        return 2 * (width + height)
    }
}


class Circle( val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}


fun printShapeDetails(shapes: List<Shape>) {
    for (shape in shapes) {
        println("Area: ${shape.area()}")
        println("Perimeter: ${shape.perimeter()}")
        println()
    }
}

fun main() {
    val rectangle = Rectangle(4.0, 3.0)
    val circle = Circle(7.0)

    val shapes: List<Shape> = listOf(rectangle, circle)
    printShapeDetails(shapes)
}
