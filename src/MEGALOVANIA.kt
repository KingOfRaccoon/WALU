import kotlin.random.Random

fun main(){
    var a = 0
    while (a < 3) {
        var b = 0
        while (b < 10) {
            print(Random.nextInt(10))
            print(" ")
            b = b + 1
        }
    a = a + 1
    println()
    }
}