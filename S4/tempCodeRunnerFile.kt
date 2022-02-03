fun main(){
    while(true){
        val inp = readln()
        if(inp == "."){
            print("yes\n")
            break
        }

        var stack = Array<Int>(100){0}
        var idx = 0
        var flag = false

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
                        print("no\n")
                        break
                    }
                }
                ']' -> {
                    if(idx == 0 || stack[--idx] != 2){
                        print("no\n")
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
            print("yes\n")
        }
    }
}