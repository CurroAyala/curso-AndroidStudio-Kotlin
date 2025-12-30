package com.curso.androidmaster.sintaxis

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

// NULAS (variables que aun no tienen valor)
// Este tipo de variables son peligrosas, si se intenta acceder a ellas, el programa se romperá.
val nula1:String? = null
val nula2:Int? = null
/*
Para acceder a las varibales nullables se pueden utilizar dos condicionales:
    - name!!: sirve para acceder si o si, "prometiendo" que la variable no es null.
    Si efectivamente es null, saltará una excepción.
    - name?: sirve para acceder al valor de la varible no es null.
    Si se desea hacer algo en el caso de que la variable sea null: name? ?: <instrucción>
 */


/**
 * CONVERSIONES DE TIPOS
 *  nombreVariable.toInt()
 *  nombreVariable.toFloat()
 *  nombreVariable.toDouble()
 *  nombreVariable.toLong()
 *  nombreVariable.toString()
 */