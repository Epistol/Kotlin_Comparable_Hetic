# Exercice du 23/03/2018 - HETIC - M LEBEAU
  
## Enoncé :

\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*  
Le problème est le suivant.  
J'ai une liste avec pleins de valeurs numériques, non triées. Comment puis-je trouver si une valeur est présente dans la liste?  

    class Arbre {  
    var valeur : Int  
    var gauche : Arbre?  
    var droite : Arbre?  
    fun find(i: Int) : Boolean  
    fun inserer(i: Int)  
    }  

\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*

L'énoncé étant vraiment faible, j'ai commencé à étudier les possibilités de la classe Comparable de Kotlin afin d'envisager une solution en tri à bulle pour palier au manque de puissance d'un tri classique mais les performances n'étant pas concluantes sur mon poste, j'ai préféré garder la fonction "contains" d'un array de int.
La liste est généré automatiquement et nous cherchons toujours le chiffre 42.

## Evolution possible

Avoir une IHM pour demander le chiffre
