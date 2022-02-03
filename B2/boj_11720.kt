fun main(){
    val n = readln().toInt()
    print(readln().split("").sumOf{ if(it == "") 0 else it.toInt() })
}