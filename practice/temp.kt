class Person(name: String){
    var name: String? = name
    var age: Int? = null
    var city: String? = null

    override fun toString(): String {
        return """
        My name is $name.
        I'm $age year(s) old and living in $city.
        """
    }
}

fun main(){
    /*
    inline fun <T, R> with(receiver: T, block: T.() -> R): R {
        return receiver.block()
    }
    
    inline fun <T> T.also(block: (T) -> Unit): T {
        block(this)
        return this
    }
    
    inline fun <T> T.apply(block: T.() -> Unit): T {
        block()
        return this
    }
    
    inline fun <T, R> T.let(block: (T) -> R): R {
        return block(this)
    }
    
    inline fun <T, R> T.run(block: T.() -> R): R {
        return block()
    }
     */
    // apply
    val adam = Person("Adam").apply {
        age = 32
        city = "London"
    } 
    println(adam)

    // also
    val numbersA = mutableListOf("one", "two", "three")
    numbersA
        .also { println("The list elements before adding new one: $it") }
        .add("four")

    // let
    val numbersB = mutableListOf("one", "two", "three", "four", "five")
    numbersB.map { it.length }.filter { it > 3 }.let {
        println(it)
        // and more function calls if needed
    }

    // with
    val numbersC = mutableListOf("one", "two", "three")
    with(numbersC) {
        println("'with' is called with argument $this")
        println("It contains $size elements")
    }

    // 출처: https://jungseob86.tistory.com/entry/Kotlin-apply-with-let-also-run-상황에-맞게-사용하기 [Random Access Memories]
}