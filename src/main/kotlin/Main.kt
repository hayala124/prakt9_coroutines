import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main() = coroutineScope {
    print("Будильник click прозвенит через 5 секунд, chick через 7 секунд и tick через 10 секунд: ")

    launch {
        for (i in 0 .. (maxOf(5,7,10))){
            delay(500L)
            println()
        }
    }

    launch {
        for (i in 0 .. 4){
            delay(500L)
            print("click\t")
        }
        println("=\tBoom")
    }

    launch {
        for (i in 0 .. 6){
            delay(500L)
            print("chick\t")
        }
        println("=\tBoom")
    }

    launch {
        for (i in 0 .. 9){
            delay(500L)
            print("tick\t")
        }
        println("=\tBoom")
    }
    println("Начало работы будильников: ")
}