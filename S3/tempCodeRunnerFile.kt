fun main(){
    val (k, n) = readln().split(" ").map{ it.toLong() }
    var lines = Array<Long>(k.toInt()){ readln().toLong() }
    var s: Long = 1
    var e: Long = Int.MAX_VALUE.toLong()+1
    var mid: Long = e/2
    while(s+1 < e){
        var cnt: Long = 0
        mid = (s+e)/2
        for(line in lines){
            cnt += line / mid
        }
        if(cnt >= n){
            s = mid
        } else {
            e = mid
        }
    }
    print(mid)
}

// mid가 MAX_VALUE가 될 수 있으므로
// [s, e) 식으로 운영하는 게 불가능함