fun main(){
    val arr = mutableListOf<String>()
    arr.add("666")

    for(i in 1666..2666799){
        if("666" in "$i"){
            arr.add("$i")
        }
    }

    print(arr[readln().toInt()-1])
}