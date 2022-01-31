fun main(){
    val inp = readln().trim()
    println( if (inp == "") 0 else inp.split(" ").size )
}

// string.trim