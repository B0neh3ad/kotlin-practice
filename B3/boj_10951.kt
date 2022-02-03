fun main(){
    val input = generateSequence(::readLine)
    val lines = input.toList()
    for(line in lines){
        val (a, b) = line.split(" ").map{ it.toInt() }
        println(a+b)
    }
}

// EOF 처리
// 여기서는 컴파일 불가...