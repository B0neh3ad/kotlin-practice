fun main(){
    val (a, b) = readln().split(" ").map { it.toInt() }
    print(
        when {
        (a > b) -> ">"
        (a < b) -> "<"
        else -> "=="
        }
    )
}