fun main(edadesL: Array<String>) {
    val edades: MutableList<Int> = mutableListOf(23, 67, 12, 35, 12, 10, 7, 11)
    println("Lista de edades")
    println(edades)
    println("Promedio de edades")
    println(edades.average())
    print("Cantidad de personas por encima del promedio:")
    val cant = edades.count { it > edades.average() }
    println(cant)
    print("Cantidad de personas por debajo del promedio:")
    val cantd = edades.count { it < edades.average() }
    println(cantd)
    println("La edad mayor ingresada:")
    println(edades[1])
    println("La edad menor ingresada:")
    println(edades[7])
}