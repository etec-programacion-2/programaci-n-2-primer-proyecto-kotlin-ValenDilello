# Proyecto de Aprendizaje de Kotlin

## Información del Alumno
- Nombre: [Valentino]
- Apellido: [Dilello]

Este proyecto está diseñado para aprender Kotlin de manera progresiva, implementando funcionalidades paso a paso. Cada paso debe ser subido al repositorio antes de continuar con el siguiente.

**Importante**: No es necesario implementar ingreso de valores por teclado. Los valores pueden ser definidos directamente en el código para simplificar el aprendizaje de los conceptos básicos.

## Paso 1: Configuración Inicial
- Crear un proyecto Kotlin básico
- Implementar una función `main()` que imprima "¡Hola, Kotlin!"
- Subir los cambios al repositorio con el mensaje "Paso 1: Configuración inicial"

Ejemplo:
```kotlin
fun main() {
    println("¡Hola, Kotlin!")
}
```

Tarea adicional:
- Crear una función que imprima tu nombre y la fecha actual

## Paso 2: Variables y Tipos de Datos
- Crear variables de diferentes tipos (String, Int, Double, Boolean)
- Implementar una función que muestre los diferentes tipos de datos
- Subir los cambios al repositorio con el mensaje "Paso 2: Variables y tipos de datos"

Ejemplo:
```kotlin
fun mostrarTiposDeDatos() {
    val nombre: String = "Juan"
    val edad: Int = 25
    val altura: Double = 1.75
    val esEstudiante: Boolean = true
    
    println("Nombre: $nombre")
    println("Edad: $edad")
    println("Altura: $altura")
    println("Es estudiante: $esEstudiante")
}
```

Tarea adicional:
- Crear una función que calcule y muestre el área de un rectángulo usando variables de tipo Double

## Paso 3: Control de Flujo
- Implementar estructuras de control (if-else, when)
- Crear una función que determine si un número es par o impar
- Subir los cambios al repositorio con el mensaje "Paso 3: Control de flujo"

Ejemplo:
```kotlin
fun esParOImpar(numero: Int): String {
    return when {
        numero % 2 == 0 -> "Par"
        else -> "Impar"
    }
}
```

Tarea adicional:
- Crear una función que determine si un número es positivo, negativo o cero

## Paso 4: Loops
- Implementar diferentes tipos de loops (for, while, do-while)
- Crear una función que muestre los números del 1 al 10 usando diferentes tipos de loops
- Subir los cambios al repositorio con el mensaje "Paso 4: Loops"

Ejemplo:
```kotlin
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
```

Tarea adicional:
- Crear una función que muestre los números pares del 2 al 20 usando los tres tipos de loops

## Paso 5: Funciones
- Crear funciones con diferentes tipos de parámetros
- Implementar una función que calcule el factorial de un número
- Subir los cambios al repositorio con el mensaje "Paso 5: Funciones"

Ejemplo:
```kotlin
fun factorial(n: Int): Int {
    return if (n <= 1) 1 else n * factorial(n - 1)
}

fun saludar(nombre: String, edad: Int = 0) {
    println("Hola $nombre, tienes $edad años")
}
```

Tarea adicional:
- Crear una función que calcule la potencia de un número (base elevada a exponente)

## Paso 6: Variables Locales y Alcance
- Implementar funciones que demuestren el uso de variables locales
- Crear ejemplos que muestren el alcance de las variables en diferentes bloques de código
- Subir los cambios al repositorio con el mensaje "Paso 6: Variables locales y alcance"

Ejemplo:
```kotlin
fun demostrarAlcanceVariables() {
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
```

Tarea adicional:
- Crear una función que encuentre el número más grande y el más pequeño en una lista de números, usando variables locales para almacenar estos valores durante el proceso

## Instrucciones para cada paso:
1. Implementar los requerimientos del paso actual
2. Asegurarse de que el código compile y funcione correctamente
3. Hacer commit de los cambios con el mensaje especificado
4. Subir los cambios al repositorio
5. Continuar con el siguiente paso

## Criterios de Evaluación:
- Correcta implementación de los requerimientos
- Código limpio y bien organizado
- Uso apropiado de las características de Kotlin
- Commits descriptivos y regulares