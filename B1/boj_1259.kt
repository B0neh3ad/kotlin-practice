fun main(){
    while(true){
        val inp = readln()
        if(inp == "0") break
        println(
            when(inp == inp.reversed()){
                true -> "yes"
                else -> "no"
            }
        )
    }
}