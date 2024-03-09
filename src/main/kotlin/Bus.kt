class Bus(model: String, type: String) : Transporter(model,type) {
    override val capacity: Int = 48
    override val pilotName: String = "John Clark"
    override val placeActivity: String = "USA"
    override val roadTime: Int = 30

    fun busText() {
        println("""About bus: $model, $type
            |Capacity - $capacity
            |Pilot name - $pilotName
            |Road time - $roadTime
            |He will drive at a speed of ${move()} km/h
            |Is its ecological footprint acceptable? ${ecological()}
        """.trimMargin())
    }

    override fun move() {

        val stopTime = mapOf(
            1 to 3.4,
            2 to 7.2,
            3 to 5.6,
            4 to 9.3
        )
        var result = stopTime[1] ?: 0.0
        stopTime.forEach {
            result += it.value
        }
        println("Общая дорога до нужной отсановки займет $result минут")
        }

    override fun ecological() {
        val ecoPermessible: Int = 10
        val ecoBus: Float = 10.1f
        val ecoBusPermessible: Boolean = (ecoBus < ecoPermessible)
        println(ecoBusPermessible)
    }
}

