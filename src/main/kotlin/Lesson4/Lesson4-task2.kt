 fun main() {
     val weight1 = 20
     val volume1 = 80
     val weight2 = 50
     val volume2 = 100

        println("Груз с весом ${weight1 >= AVEREGE_WEIGHT_MIN} и объемом ${volume1 <= VOLUME_MAX}")
        println("Груз с весом ${weight2 >= AVEREGE_WEIGHT_MIN} и объемом ${volume2 <= VOLUME_MAX}")
}

 const val AVEREGE_WEIGHT_MIN = 35
 const val AVEREGE_WEIGHT_MAX = 100
 const val VOLUME_MAX = 100
