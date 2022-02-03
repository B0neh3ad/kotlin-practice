fun main(){
    val n = readln().toInt()
    val seq = Array(n){ readln().toInt() }
    var stack = Array(n){0}
    var idx = 0
    var cur = 1

    var ans = mutableListOf<Char>()

    for(elem in seq){
        if(cur <= elem){
            while(cur <= elem){
                stack[idx++] = cur++
                ans.add('+')
            }
            --idx
        } else {
            if(idx == 0 || stack[--idx] != elem){
                print("NO")
                return
            }
        }
        ans.add('-')
    }
    for(elem in ans){ print("$elem\n") }
}