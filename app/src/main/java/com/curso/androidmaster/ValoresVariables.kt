package com.curso.androidmaster

/**
 * VALORES Y VARIABLES
 *
 * Valores = no reasignables, constante (no pueden cambiar)
 * Variables = reasignables (pueden cambiar)
 *
 * Notas:
 * - Kotlin es un lenguaje fuertemente tipado
 * - Kotlin tiene inferencia de tipos, lo que permite, a veces, no tener que declarar el tipo
 * - Para nombrar variables se utiliza camelCase
 *
 */

fun main(){

    // ENTEROS: Int (desde -2.147.483.647 hasta 2.147.483.647)
    val enteroValor:Int = 100
    var enteroVariable:Int = 100

    // ENTEROS GRANDES: Long (desde -9.223.372.036.775.807 hasta 9.223.372.036.775.807)
    val grandeValor:Long = 1000
    var grandeVariable:Long = 1000

    // DECIMALES: Float (hasta 6 decimales)
    val decimalesValor:Float = 10.5f
    var decimalesVariable:Float = 10.5f

    // DECIMALES CON MÁS NÚMEROS: Double (hasta 14 decimales)
    val masDecimalesValor:Double = 10.555555
    var masDecimalesVariable:Double = 10.555555

    // UN SOLO CARACTER: char
    val caracterValor:Char = 'a'
    var caracterVariable:Char = 'a'

    // CADENA DE CARACTERES: String
    val cadenaValor:String = "Hola mundo"
    var cadenaVariable:String = "Hola mundo"

    // BOOLEANOS
    val booleanValor:Boolean = true
    var booleanVariable:Boolean = true


    /**
     * CONVERSIONES DE TIPOS
     *  nombreVariable.toInt()
     *  nombreVariable.toFloat()
     *  nombreVariable.toDouble()
     *  nombreVariable.toLong()
     *  nombreVariable.toString()
     */

}