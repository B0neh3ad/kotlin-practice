fun main(){
    repeat(readln().toInt()){
        val (n, query) = readln().split(" ").map{ it.toInt() }
        val queue = readln().split(" ").map{ it.toInt() }
        val rank = Array(n){0}
        var cur = 1
        var idx = 0
        var flag = false
        for(pt in 9 downTo 1){
            if(pt in queue){
                var cnt = queue.count{ it == pt }
                while(cnt > 0){
                    if(queue[idx] == pt){
                        rank[idx] = cur++
                        --cnt
                        if(idx == query){
                            print("${rank[idx]}\n")
                            flag = true
                        }
                    }
                    idx = (idx + 1) % n
                }
            }
            if(flag) break
        }
    }
}