package com.cfa.KotlinInit.functions

fun isOldEnough(age: Int): Boolean {
    var test: Boolean = true
    if (age < 10)
        test = false
    return test
}

fun isOldEnoughLight(age: Int): Boolean {
    return age >= 18
}

fun logFullName(nom: String) {
    // Implémentation de la fonction
    println("Nom complet : $nom")
}

fun main() {
    // Créer une MutableList
    val fruits: MutableList<String> = mutableListOf("Apple", "Banana", "Cherry")

    // Ajouter un élément
    fruits.add("Date")
    println(fruits) // [Apple, Banana, Cherry, Date]

    // Supprimer un élément
    fruits.remove("Banana")
    println(fruits) // [Apple, Cherry, Date]

    // Modifier un élément
    fruits[1] = "Blueberry"
    println(fruits) // [Apple, Blueberry, Date]

    // Itérer sur les éléments
    for (fruit in fruits) {
        println(fruit)
    }

    fun positive(n:Int): Boolean = n > 0
}
