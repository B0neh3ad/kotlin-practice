fun main(){
    val n = readln().toDouble()
    var score = readln().split(" ").map { it.toDouble() }
    val maxVal = score.maxOf { it }
    print(score.map{ it -> it / maxVal * 100 }.sum() / n)
}