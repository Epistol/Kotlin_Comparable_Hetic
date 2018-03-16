package AppliTest


fun incrementer(v: Int): Int {
    val c = 1
    if (v == null) return c
    else return v + c
}

fun fibo(n: Int?): Int? {
/*  fib(n) = fib(n - 1) + fib(n - 2)
    fib(<0) = null
    fib(0) = fib(1) = 1
    fib(null) = null */


    if (v == null || v < 0) {
        return null
    }
    if (v <= 1) {
        return null
    }

    var acc = mutablelistof(1, 1)
    for (i in 2..v) {
        acc.add(acc[i - 2] + acc[i - 1])
    }

    return acc.last()

}


//Ancienne version
/*
        if (n == null) return null

        else if (n == 0 || n == 1) return 1
        else if (n < 0) return null
        else {
            return (fibo(n - 1) ?: 0) + fibo(n - 2)!!
        }*/




fun main(args: Array<String>) {
    var a = fibo(12)
    println("Hello $a")
}

fun fibonacci(n: Int, a: Long, b: Long): Long {
    return if (n > 0) fibonacci(n - 1, b, a + b) else a
}

