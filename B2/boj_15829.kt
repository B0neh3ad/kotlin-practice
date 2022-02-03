fun main(){
    val m: Long = 1234567891
    val r: Long = 31

    readln()
    val inp = readln().toList()
    var res: Long = 0
    var ri: Long = 1
    for(i in inp.indices){
        res += (inp[i]-'a'+1).toLong()*ri
        res %= m
        ri *= r
        ri %= m
    }
    print(res)
}

// 일단 더한 뒤에 나머지를 구하자