class Airbone(model: String, type: String) : Transporter(model, type) {
    override val capacity: Int = 170
    override val pilotName: String = "Slavek Vurtz"
    override val placeActivity: String = "Czech"
    override val roadTime: Int = 300

    fun airboneText() {
        println(
            """About airbone: $model, $type
            |Capacity - $capacity
            |Pilot name - $pilotName
            |Road time - $roadTime
            |He will drive at a speed of ${move()} km/h
            |Is its ecological footprint acceptable? ${ecological()}
        """.trimMargin()
        )
    }

    override fun move() {
        fun calculateDistance(initialVelocity: Double, time: Double, acceleration: Double): Double {
            return initialVelocity * time + 0.5 * acceleration * time * time
        }

        fun calculation() {
            val initialVelocities = listOf(10.0, 20.0, 30.0) // различные начальные скорости в м/с
            val times = listOf(5.0, 10.0, 15.0) // различные времена полета в секундах
            val accelerations = listOf(5.0, 10.0, 15.0) // различные ускорения в м/с^2
            for (iv in initialVelocities) {
                for (t in times) {
                    for (a in accelerations) {
                        val distance = calculateDistance(iv, t, a)
                        println("При начальной скорости $iv м/с, времени $t секунд и ускорении $a м/с^2 расстояние будет: $distance метров")
                    }
                }
            }
        }
    }

    override fun ecological() {
        val ecoPermessible: Int = 10
        val ecoAirbone: Float = 10.1f
        val ecoAirbonePermessible: Boolean = (ecoAirbone < ecoPermessible)
        println(ecoAirbonePermessible)
    }
}


