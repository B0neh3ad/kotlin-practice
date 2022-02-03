fun main(){
    while(true){
        val inp = readln()
        if(inp == "0 0") break
        println(inp.split(" ").sumBy{ it.toInt() })
    }
}