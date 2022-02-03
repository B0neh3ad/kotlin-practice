fun main(){
    val n = readln().toInt()
    var loc = Array<Pair<Int, Int>>(n){ Pair(0, 0) }
    repeat(n){
        val (x, y) = readln().split(" ").map{ it.toInt() }
        loc[it] = Pair(x, y)
    }
    val res = loc.sortedWith(compareBy({it.second}, {it.first}))
    res.forEach{ print("${it.first} ${it.second}\n") }
}