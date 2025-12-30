package com.curso.androidmaster.sintaxis

val array = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

/**
 OPERACIONES CON ARRAYS
 */

// ACCEDER A UNA POSICIÓN
val primerElementoArray:String = array[0]
val segundoElementoArray:String = array.get(1)

// OBTENER TAMAÑO
val tamañoArray:Int = array.size

// CAMBIAR EL VALOR DE UNA POSICIÓN
fun cambiarValorArray() { array[0] = "Nuevo valor" }

// BUCLES PARA RECORRER UN ARRAY
fun bucle1() {
    for (valor in array) {
        println(valor)
    }
}

fun bucle2() {
    for (i in array.indices) {
        println(array.get(i))
    }
}

fun bucle3() {
    for (i in 0..array.size) {
        print(array.get(i))
    }
}

fun bucle4() {
    for ((indice,valor) in array.withIndex()) {
        print("El elemento $indice es: $valor")
    }
}


/**
 * NOTAS:
 *      - Los arrays son de tamaño fijo: no se pueden añadir ni elimnar elementos.
 */