package AppliTest

open class Personne(p: String, n: String) {

    constructor():this("Toto","Ce héros")

    var prenom = p
    var nom = n

    open fun direBonjour(){
        println("Bonjour")
    }

}

open class VIP(p:String, n:String) : Personne(p,n){
    override fun direBonjour(){
        println("Wesh")
    }
}


open class Avion{
    open fun faireLePLein(){}
}

interface Bateau{
    open fun faireLePLein(){}
}
class Hydravion : Avion(), Bateau{
    override fun faireLePLein() {
//        On choisi de ne pas choisir quel truc remplir
//        super.faireLePLein()
//        On rempli l'avion puis le bateau
        super<Avion>.faireLePLein()
        super<Bateau>.faireLePLein()
    }
}

fun faire(x:Int, y: Int, f:((Int,Int) -> Int)) : Int){
    return f(x,y)
}

//BERK

faire(1,2){
    a,b -> a+b
}

// VERSION COURTE

class Personne2(var p: String, var n: String)

//Avec des valeurs pré-remplies

class Personne3(var p: String = "Toto", var n: String = "Pas important")
//{}



fun main(args: Array<String>) {
    var a = fibo(12)
    println("Hello $a")
}

fun fibonacci(n: Int, a: Long, b: Long): Long {
    return if (n > 0) fibonacci(n - 1, b, a + b) else a
}

