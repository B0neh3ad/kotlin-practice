fun main(){
    val inp = Array(9) { readln().toInt() }
    println(inp.maxOf{it})
    println(1+(inp.indices.maxByOrNull{inp[it]}?:-1))
}