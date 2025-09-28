package com.curso.androidmaster

val num1:Int = 1
val num2:Int = 2
val cadena1:String = "aa"
val cadena2:String = "bb"

/**
 * OPERACIONES NUMÉRICAS
 */

// SUMA
val sumaNum:Int = num1 + num2

// RESTA
val restaNum:Int = num1 - num2

// DIVISIÓN (solo da el cociente)
val divisionNum:Int = num2 / num1

// MULTIPLICACIÓN
val multiplicacionNum:Int = num2 * num2

// MÓDULO
val moduloNum:Int = num2 % num1


/**
 * OPERACIONES CON CADENAS
 */

// CONCATENACIÓN
val sumaCadena:String = cadena1 + cadena2

// MULTIPLICACIÓN
val multiplicacionCadena:String = cadena1.repeat(num2)



fun main() {
    println("VARIABLES:")
    println("   - Num 1: $num1")
    println("   - Num 2: $num2")
    println("   - Cadena 1: $cadena1")
    println("   - Cadena 2: $cadena2")
    println("-----")
    println("OPERACIONES NUMÉRICAS:")
    println("   - Suma: $sumaNum")
    println("   - Resta: $restaNum")
    println("   - Multiplicación: $multiplicacionNum")
    println("   - División: $divisionNum")
    println("   - Módulo: $moduloNum")
    println("-----")
    println("OPERACIONES CON CADENAS")
    println("   - Concatenación: $sumaCadena")
    println("   - Multiplicación: $multiplicacionCadena")

    /**
     * NOTAS:
     *  - Para utilizar una variable en una cadena también se puede concatenar de la forma <"Num 1: " + num1>.
     *    Aunque es totalmente válida, esta forma es menos elegante.
     */
}