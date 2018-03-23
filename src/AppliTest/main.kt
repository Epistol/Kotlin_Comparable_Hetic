package AppliTest


// J'ai une liste avec pleins de valeurs numériques, non triées.
// Sont-ils dans un tableau ?

class Arbre : Comparable<Arbre> {


    var valeur: Int = 0
    // 10 elements aléatoires dans un tableau
    var table = IntArray(10)



    fun init_tableau_valeurs() {
        val n = table.size - 1
        for (i in 1..n)
            table[i] = (Math.random() * 100).toInt()
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
    if(Arbre().find(42)){
        println("Yay")
    }
    else {
        println("Nay")
    }
}





