fun main(){
    val N = readln().toInt()
    repeat(N){
        print(
            " ".repeat(N-1-it)
            + "*".repeat(it+1)
            + '\n'
        )
    }
}