 fun main() {
     val weight1 = 20
     val volume1 = 80
     val weight2 = 50
     val volume2 = 100
     //var comparisonResult: Boolean = (weight1 >= AVEREGE_WEIGHT_MIN) && (volume1 < VOLUME_MAX)
     //var comparisonResult2: Boolean = (weight2 >= AVEREGE_WEIGHT_MIN) && (volume2 < VOLUME_MAX)
     var comparisonResult: Boolean = (weight1 in AVEREGE_WEIGHT_MIN .. AVEREGE_WEIGHT_MAX) && (volume1 in VOLUME_MAX .. VOLUME_MAX)
     var comparisonResult2: Boolean = (weight2 in AVEREGE_WEIGHT_MIN.. AVEREGE_WEIGHT_MAX) && (volume2 in VOLUME_MAX.. VOLUME_MAX)

        println("Груз с весом $weight1 и объемом $volume1: $comparisonResult")
        println("Груз с весом $weight2 и объемом $volume2: $comparisonResult2")
}
 const val AVEREGE_WEIGHT_MIN = 35
 const val AVEREGE_WEIGHT_MAX = 100
 const val VOLUME_MAX = 100