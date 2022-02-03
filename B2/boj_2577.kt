fun main(){
    val res = (Array(3){readln().toInt()}.reduce(Int::times)).toString()
    val cnt = Array(10){0}
    res.map{ ++cnt[it - '0'] }
    for(i in 0 until 10){
        print("${cnt[i]}\n")
    }
}