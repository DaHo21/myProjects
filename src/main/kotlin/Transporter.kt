abstract class Transporter(
    val model: String,
    val type: String
) {
    abstract val capacity: Int
    abstract val pilotName: String
    abstract val placeActivity: String
    abstract val roadTime: Int

    abstract fun move()
    abstract fun ecological()
}