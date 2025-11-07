class GeometryCalculator {

    fun rectangleInfo(length: Double, width: Double) {
        val perimeter = 2 * (length + width)
        val area = length * width

        println("=== Прямоугольник ===")
        println("Длина: $length")
        println("Ширина: $width")
        println("Периметр: $perimeter")
        println("Площадь: $area")
        println()
    }

    fun triangleInfo(sideA: Double, sideB: Double, sideC: Double) {
        val sides = listOf(sideA, sideB, sideC).sorted()
        val isRightTriangle = sides[2] * sides[2] == sides[0] * sides[0] + sides[1] * sides[1]

        println("=== Треугольник ===")
        println("Сторона A: $sideA")
        println("Сторона B: $sideB")
        println("Сторона C: $sideC")

        if (isRightTriangle) {
            println("Треугольник является прямоугольным")
        } else {
            println("Треугольник НЕ является прямоугольным")
        }
        println()
    }

    fun circleInfo(radius: Double) {
        val circumference = 2 * Math.PI * radius
        val area = Math.PI * radius * radius

        println("=== Круг ===")
        println("Радиус: $radius")
        println("Длина окружности: ${"%.2f".format(circumference)}")
        println("Площадь круга: ${"%.2f".format(area)}")
        println()
    }
}