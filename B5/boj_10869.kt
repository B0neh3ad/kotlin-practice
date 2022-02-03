fun main(){
    val (a, b) = readln().split(" ").map{ it.toInt() }
    print("${a+b}\n${a-b}\n${a*b}\n${a/b}\n${a%b}")
}