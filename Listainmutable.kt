fun main(Mutable: Array<String>) {
    val lista: MutableList<Int> = MutableList(100) { ((Math.random() * 50) + 1).toInt() }

    val cant25 = lista.count { it == 25 }
    val cant30= lista.count {it > 30}
    val cant20= lista.count {it > 5 && it <20 }
    val cant40= lista.count {it > 30 && it <40 }

    println(lista)
    println("Cantidad de elementos entre 30 y 40: $cant40")
    println("Cantidad de elementos con el valor 25: $cant25")
    println("Cantidad de elementos mayores a 30: $cant30")
    println("Cantidad de elementos entre 5 y 20: $cant20")
}