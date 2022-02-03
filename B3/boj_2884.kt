fun main(){
    val (h, m) = readln().split(" ").map{ it.toInt() }
    val clock = ((h*60+m) - 45 + 1440) % 1440
    print("${clock/60} ${clock%60}")
}