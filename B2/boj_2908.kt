fun main(){
    val (a, b) = readln().split(" ").map{ it.reversed().toInt() }
    print(maxOf(a, b))
}