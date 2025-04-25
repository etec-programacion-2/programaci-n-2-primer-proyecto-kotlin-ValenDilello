package org.example
import java.time.LocalDate

fun main() {
    println("Paso 1: ")
    println("¡Hola, Kotlin!")
    
    println("Paso 2: ")
    primerafuncion()

    CalcRectagleArea()

    println("Paso 3: ")
    val numero = -7
    println("Número: $numero")
    println("¿Par o impar?: ${esParOImpar(numero)}")
    println("Signo: ${evaluarSigno(numero)}")

    println("Paso 4: ")
    mostrarNumerosConLoops()
    mostrarParesConLoops()
}

fun primerafuncion () {
    val nombre = "Valentino"
    val apellido = "Dilello"
    val fechaActual = LocalDate.now ()
    println ("Nombre: $nombre $apellido")
    println ("Fecha: $fechaActual")
}

fun mostrarTiposDeDatos() {
    val nombre: String = "Valentino"
    val edad: Int = 16
    val altura: Double = 1.71
    val esEstudiante: Boolean = true
    
    println("Nombre: $nombre")
    println("Edad: $edad")
    println("Altura: $altura")
    println("Es estudiante: $esEstudiante")
}
fun CalcRectagleArea () {
    val Base: Double = 5.5
    val Heigh: Double = 2.2
    val Area: Double = Base*Heigh
    println ("El area del rectangulo es: $Area")
}

fun esParOImpar(numero: Int): String {
    return when {
        numero % 2 == 0 -> "Par"
        else -> "Impar"
    }
}

fun evaluarSigno(numero: Int): String {
    return if (numero > 0) {
        "Positivo"
    } else if (numero < 0) {
        "Negativo"
    } else {
        "Cero"
    }
}

fun mostrarNumerosConLoops() {
    // Usando for
    println("Usando for:")
    for (i in 1..10) {
        println(i)
    }
    
    // Usando while
    println("\nUsando while:")
    var j = 1
    while (j <= 10) {
        println(j)
        j++
    }
    
    // Usando do-while
    println("\nUsando do-while:")
    var k = 1
    do {
        println(k)
        k++
    } while (k <= 10)
}

fun mostrarParesConLoops() {
    println("Pares del 2 al 20 con for:")
    for (i in 2..20 step 2) {
        println(i)
    }

    println("\nPares del 2 al 20 con while:")
    var j = 2
    while (j <= 20) {
        println(j)
        j += 2
    }

    println("\nPares del 2 al 20 con do-while:")
    var k = 2
    do {
        println(k)
        k += 2
    } while (k <= 20)
}