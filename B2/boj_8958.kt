fun main(){
    repeat(readln().toInt()){
        val inp = readln()
        var score = 0
        var res = 0
        for(state in inp){
            when(state){
                'O' -> res += ++score
                else -> score = 0
            }
        }
        print("$res\n")
    }
}