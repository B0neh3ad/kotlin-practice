fun main(){
    val flag = MutableList<Boolean>(42){false}
    repeat(10){
        flag[readln().toInt() % 42] = true
    }
    var res = 0
    flag.forEach{ if(it){ ++res } }
    print(res)
}