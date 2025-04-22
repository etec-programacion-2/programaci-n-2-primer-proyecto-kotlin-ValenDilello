package org.example
import java.time.LocalDate

fun main() {
    println("¡Hola, Kotlin!")
    primerafuncion()
    CalcRectagleArea()
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