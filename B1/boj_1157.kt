fun main(){
    var cnt = MutableList(26) {0}
    readln().trim().uppercase().map { cnt[it - 'A'] += 1 }
    val firstIdx = cnt.indices.maxByOrNull { cnt[it] }
    val lastIdx = cnt.lastIndexOf(cnt[firstIdx ?: 0])
    println(if(firstIdx == lastIdx) 'A' + firstIdx else "?")
}