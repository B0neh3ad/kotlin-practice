fun main(){
    var inp = Array<String>(readln().toInt()) { readln() }
    val res = inp.sortedWith(compareBy(
        {it.length},
        {it}
    )).distinct()
    for(word in res){ print("$word\n") }
}