package org.example
import java.time.LocalDate

fun main() {
    println("¡Hola, Kotlin!")
    primerafuncion()

}

fun primerafuncion () {
    val nombre = "Valentino"
    val apellido = "Dilello"
    val fechaActual = LocalDate.now ()
    println ("Nombre: $nombre $apellido")
    println ("Fecha: $fechaActual")
}


