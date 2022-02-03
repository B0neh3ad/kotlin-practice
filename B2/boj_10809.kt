fun main(){
    var cnt = MutableList(26){-1}
    val inp = readln()
    for(i in 0 until inp.length){
        if(cnt[inp[i] - 'a'] == -1){
            cnt[inp[i] - 'a'] = i
        }
    }
    cnt.forEach{print("$it ")}
}