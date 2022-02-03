fun main(){
    val inp = readln().trim().split(" ").map{ it.toInt() }
    var st = 0
    for(i in 1..inp.size-1){
        when{
            (inp[i-1] < inp[i]) -> ++st
            else -> --st
        }
    }
    print(
        when(st){
            7 -> "ascending"
            -7 -> "descending"
            else -> "mixed"
        }
    )
}