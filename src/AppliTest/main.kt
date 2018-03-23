package AppliTest


// J'ai une liste avec pleins de valeurs numériques, non triées.
// Sont-ils dans un tableau ?

class Arbre : Comparable<Arbre> {


    var valeur: Int = 0
    // 10 elements aléatoires dans un tableau
    var table = IntArray(10)

    fun randomiser(): Int {
        val rand_number = (Math.random() * 100).toInt()
        return rand_number
    }


    fun init_tableau_valeurs() {
        val n = table.size - 1
        for (i in 1..n)
                table[i] = randomiser()
        for (item in table)
            println(item)
    }

    // Trouver si une valeur est présente dans la liste
    // Return a boolean
    fun find(i: Int): Boolean {
        init_tableau_valeurs()
        return table.contains(i)
    }

    override fun compareTo(other: Arbre): Int {
        // Not used
        return 0
    }


}

fun main(args: Array<String>) {
    val chiffre: Int = 42
    if (Arbre().find(chiffre)) {
        println("Nous avons trouvé votre chiffre : " + chiffre)
    } else {
        println("Nous n'avons pas trouvé le chiffre : " + chiffre)
    }
}





