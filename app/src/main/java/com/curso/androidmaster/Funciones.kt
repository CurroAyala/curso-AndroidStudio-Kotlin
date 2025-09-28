package com.curso.androidmaster

/**
 * FUNCIONES
 *
 * Notas:
 *  - Las funciones son anidables
 */

// DECLARAR UNA FUNCIÓN - Versión clásica
fun sumar(a:Int, b:Int):Int {
    val suma:Int = a + b
    return suma
}

// DECLARAR UNA FUNCIÓN - Versión compacta (ideal para funciones de una sola instrucción)
fun restar(a:Int, b:Int) = a - b


fun main() {
    println(sumar(3,5))
    println(restar(3,2))
}
