fun main(){
    val k = readln().toInt()
    var acc = Array<Int>(k){0}
    var idx = 0
    repeat(k){
        val inp = readln()
        if(inp == "0"){
            --idx
        } else {
            acc[idx++] = inp.toInt()
        }
    }
    var res = 0
    for(i in 0 until idx){ res += acc[i] }
    print(res)
}