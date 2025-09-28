package com.curso.androidmaster

/**
 * EXPRESIONES CONDICIONALES
 *
 * Notas:
 *  - Para poner varias condiciones en un if se utiliza <&&> entre ellas.
 */

// IF-ELSE BÁSICO
fun ifBasico(nombre:String) {
    val usuario:String = "curro"

    if (nombre.lowercase() == usuario) {
        println("Usuario correcto.")
    } else {
        println("Usuario incorrecto.")
    }
}

// IF ANIDADO - Abusar de ellos se considera una mala práctica
fun ifAnidado() {
    println("Escribe tu nombre: ")
    val nombre:String? = readLine() // readLine() devuelve un String?, es decir, puede ser null si no se recibe nada.
    val usuario:String = "curro"

    if (!nombre.isNullOrBlank()){
        if (nombre.lowercase() == usuario) {
            println("Usuario correcto.")
        } else {
            println("Usuario incorrecto.")
        }

    } else {
        println("Error. El nombre no puede estar vacío.")
    }
}

// ELSE IF

fun elseIf(nombre:String) {
    val usuario1:String = "curro"
    val usuario2:String = "juan"
    val usuario3:String = "pedro"

    if (nombre.lowercase() == usuario1) {
        println("Bienvenido $usuario1.")
    } else if (nombre.lowercase() == usuario2) {
        println("Bienvenido $usuario2.")
    } else if (nombre.lowercase() == usuario3) {
        println("Bienvenido $usuario3.")
    } else {
        println("Usuario incorrecto.")
    }
}


fun main() {

    ifBasico("Curro") // ejecuta el <if>
    //ifBasico("Juan") // ejecuta el <else>

    println("___________________")

    ifAnidado()

    println("___________________")

    elseIf("Curro")
    elseIf("Pedro")
    elseIf("Manuel")

}