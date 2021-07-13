package one.digitalinnovation.collections

fun main() {
    val pair: Pair<String, Double> = Pair("Joao", 1000.0)
    val map1= mapOf(pair)

    map1.forEach { (R, V) -> println("Chave: $R - Valor: $V") }

    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3000.0
    )

    map2.forEach { (R, V) -> println("Chave: $R - Valor: $V") }
}