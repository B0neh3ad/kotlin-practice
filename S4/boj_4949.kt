fun main(){
    while(true){
        val inp = readln()
        if(inp == ".") break

        var stack = Array<Int>(101){0}
        var idx = 0
        var flag = false
        var ans = ""

        for(i in 0 until inp.length){
            when(inp[i]){
                '(' -> {
                    stack[idx++] = 1
                }
                '[' -> {
                    stack[idx++] = 2
                }
                ')' -> {
                    if(idx == 0 || stack[--idx] != 1){
                        ans = "no\n"
                        break
                    }
                }
                ']' -> {
                    if(idx == 0 || stack[--idx] != 2){
                        ans = "no\n"
                        break
                    }
                }
                else -> {}
            }
            if(i+1 == inp.length){
                flag = true
            }
        }

        if(flag && idx == 0){
            ans = "yes\n"
        }
        if (ans == ""){
            ans = "no\n"
        }
        print(ans)
    }
}