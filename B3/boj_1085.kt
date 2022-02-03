import kotlin.math.*

fun main(){
    val (x, y, w, h) = readln().split(" ").map{ it.toInt() }
    print(min(min(w-x, x),min(h-y, y)))
}