fun main(){
    val (n, x) = readln().split(" ").map{ it.toInt() }
    val inp = readln().split(" ").map{ it.toInt() }
    inp.forEach{
        if(it < x){
            print("$it ")
        }
    }
}