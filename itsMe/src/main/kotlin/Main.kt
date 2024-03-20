fun main() {
    val firstName: String = "Daniil"
    val secondName: String = "Khomutov"

    var height: Double = 1.80
    var weight: Float = 83.3f

    val childHeight: Double = 1.50
    val childWeight: Float = 40f

    var iAmChildHeight: Boolean = (height < childHeight)
    var iAmChildWeight: Boolean = (weight < childWeight)

    val iAmChild: Boolean = iAmChildWeight && iAmChildHeight

    println("I am a child? - $iAmChild")

}