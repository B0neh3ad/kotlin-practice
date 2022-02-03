fun main(){
    readln()
    val inp = readln().split(" ").map{ it.toInt() }
    print("${inp.minOf{it}} ${inp.maxOf{it}}")
}