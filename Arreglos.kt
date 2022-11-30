fun main(Arreglo: Array<String>) {
    val arreglo = IntArray(8)
    for(i in arreglo.indices) {
        print("Ingrese elemento:")
        arreglo[i] = readln().toInt()
    }
    var suma = 0
    var cantMayor50 = 0
    for(f in arreglo) {
        suma += f
        if (f > 50)
            cantMayor50++
    }
    println("Suma de todos los elementos ingresados: $suma")
    println("Elementos superiores a 50: $cantMayor50")
    println(arreglo.average())
}

