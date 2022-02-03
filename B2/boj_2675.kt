fun main(){
    repeat(readln().toInt()){
        println(
            readln().split(" ").let{ i ->
                i[1].map{"$it".repeat(i[0].toInt())}.joinToString("")
            }
        )
    }
}