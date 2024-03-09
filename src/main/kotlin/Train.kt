class Train(model: String, type: String) : Transporter(model, type) {
    override val capacity = 400
    override val pilotName: String = "Marc Abraham"
    override val placeActivity: String = "Germany"
    override val roadTime: Int = 240

    fun trainText() {
        println("""About train: $model, $type
            |Capacity - $capacity
            |Pilot name - $pilotName
            |Road time - $roadTime
            |He will drive at a speed of ${move()} km/h
            |Is its ecological footprint acceptable? ${ecological()}
        """.trimMargin())
    }

    override fun move() {
        val lowestSpeed: Int = 42
        val maxSpeed: Int = 168
        val middleSpeed: Int = (lowestSpeed + maxSpeed) / 2
        println(middleSpeed)
    }

    override fun ecological() {
        val ecoPermessible: Int = 10
        val ecoTrain: Int = 9
        val ecoTrainPermessible: Boolean = (ecoTrain < ecoPermessible)
        println(ecoTrainPermessible)
    }

}