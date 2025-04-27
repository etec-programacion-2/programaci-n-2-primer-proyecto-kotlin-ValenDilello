package org.example
import java.time.LocalDate

fun main() {
    println("Paso 1: ")
    println("Hola, Kotlin!")
    
    primerafuncion()
    mostrarTiposDeDatos()
    CalcRectagleArea()

    val numero = -7
    println("Número: $numero")
    println("¿Par o impar?: ${esParOImpar(numero)}")
    println("Signo: ${evaluarSigno(numero)}")

    mostrarNumerosConLoops()
    mostrarParesConLoops()

    factorial(3)
    saludar("Valentino")
    potencia(5, 3)

    demostrarAlcanceVariables()
    calcularPromedio(listOf(1,2,3,4,5,6,7,8,9,10))
    encontrarMaximoMinimo(listOf(1,2,3,4,5,6,7,8,9,10))
}
//Paso 2:
fun primerafuncion () {
    println("Paso 2: ")
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
//Paso 3:
fun esParOImpar(numero: Int): String {
    println("Paso 3: ")
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
//Paso 4:
fun mostrarNumerosConLoops() {
    println("Paso 4: ")
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

fun factorial(n: Int): Int {
    println("Paso 5: ")
    return if (n <= 1) 1 else n * factorial(n - 1)
}

fun saludar(nombre: String, edad: Int = 0) {
        val edad: Int = 16
    println("Hola $nombre, tienes $edad años")
}

fun potencia(base: Int, exponente: Int): Double {
    if (exponente == 0) return 1.0
    if (exponente < 0) return 1.0 / potencia(base, -exponente)
    
    var resultado = 1.0
    for (i in 1..exponente) {
        resultado *= base
    }
    println("Resultado: $resultado")
    return resultado
}

fun demostrarAlcanceVariables() {
    println("Paso 6: ")
    // Variable local en el ámbito de la función
    val variableGlobal = "Soy global en esta función"
    
    // Bloque if con su propio ámbito
    if (true) {
        val variableIf = "Soy local del if"
        println("Dentro del if: $variableIf")
        println("Puedo acceder a: $variableGlobal")
    }
    
    // Bloque for con su propio ámbito
    for (i in 1..3) {
        val variableFor = "Soy local del for - iteración $i"
        println("Dentro del for: $variableFor")
        println("Puedo acceder a: $variableGlobal")
    }
    
    // Intentar acceder a variables locales fuera de su ámbito
    // println(variableIf)  // Esto daría error
    // println(variableFor) // Esto daría error
}

fun calcularPromedio(numeros: List<Int>): Double {
    var suma = 0  // Variable local mutable
    var contador = 0  // Variable local mutable
    
    for (numero in numeros) {
        suma += numero
        contador++
    }
    
    return if (contador > 0) suma.toDouble() / contador else 0.0
}

fun encontrarMaximoMinimo(numeros: List<Int>): Pair<Int, Int> {
    // Verificar si la lista está vacía
    if (numeros.isEmpty()) {
        throw IllegalArgumentException("La lista no puede estar vacía")
    }
    
    // Variables locales para almacenar el máximo y mínimo
    var maximo = numeros[0]
    var minimo = numeros[0]
    
    // Iterar sobre la lista para encontrar máximo y mínimo
    for (numero in numeros) {
        if (numero > maximo) {
            maximo = numero
        }
        if (numero < minimo) {
            minimo = numero
        }
    }
    
    // Retornar ambos valores como un par
    println("El número más grande es: $maximo")
    println("El número más pequeño es: $minimo")
    return Pair(maximo, minimo)
}