
fun main() {
    println(checkSealedBox())
}

fun checkSealedBox() = if (Math.random() > 0.5) "Meow!" else "..."