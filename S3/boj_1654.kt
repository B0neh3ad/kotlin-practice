fun main(){
    val (k, n) = readln().split(" ").map{ it.toLong() }
    var lines = Array<Long>(k.toInt()){ readln().toLong() }
    var s: Long = 1
    var e: Long = Int.MAX_VALUE.toLong()+1
    var mid: Long = (s+e)/2
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
    print(s)
}

// 1. 자료형 문제
// 2. 범위 문제