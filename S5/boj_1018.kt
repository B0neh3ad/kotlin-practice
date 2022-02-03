import kotlin.math.*

fun main(){
    val (n, m) = readln().split(" ").map{ it.toInt() }
    var board = mutableListOf<String>()
    for(i in 1..n){
        board.add(readln())
    }

    var ans = 64
    for(i in 0..n-8){
        for(j in 0..m-8){
            var cnt = 0
            for(y in 0 until 8){
                for(x in 0 until 8){
                    if(board[i+y][j+x] !=
                        when((x+y)%2){
                            0 -> 'B'
                            else -> 'W'
                        }
                    ){ ++cnt }
                }
            }
            ans = min(ans, min(cnt, 64-cnt))
        }
    }
    print(ans)
}