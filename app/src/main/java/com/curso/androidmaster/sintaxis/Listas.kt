package com.curso.androidmaster.sintaxis

val listaInmutable:List<String> = listOf("Huevos", "Leche", "Tomates", "Cebolla")
val listaMutable:MutableList<String> = mutableListOf("Huevos", "Leche", "Tomates", "Cebolla")

/**
OPERACIONES CON LISTAS
 */

// ACCEDER A UNA POSICIÓN
val primerElementoLista:String = listaInmutable.first() // También se puede usar: lista[0]
val segundoElementoLista:String = listaInmutable[1]
val últimoElementoLista:String = listaInmutable.last()

// OBTENER TAMAÑO
val tamañoLista:Int = listaInmutable.size

// CAMBIAR VALOR DE UNA POSICIÓN
fun cambiarValorLista() {  }

// FILTRAR LISTA
val filtrada1 = listaInmutable.filter { it.contains("a") }
val filtrada2 = listaInmutable.filter { elemento -> elemento.contains("a") }

// RECORRER LISTA
fun recorrerLista1() { listaInmutable.forEach { println(it) } }
fun recorrerLista2() { listaInmutable.forEach { elemento -> println(elemento) } }
//      Nota: también se pueden recorrer con bucles for clásicos.

// AÑADIR UN ELEMENTO AL FINAL
fun añadirElemento() { listaMutable.add("Galletas") }

// AÑADIR UN ELEMENTO EN UNA POSICIÓN CONCRETA
fun añadirElementoPosicion() { listaMutable.add(2, "Pan") }

// ELIMINAR UN ELEMENTO
fun eleminarElemento() { listaMutable.remove("Leche") }

// VERIFICAR SI UNA LISTA ESTÁ VACÍA
fun verificarListaVacía() { if (listaMutable.isEmpty()) { println("La lista está vacía." ) } }

// VERIFICAR SI UNA LISTA TIENE ELEMENTOS
fun verifcarListaConElementos() { if (listaMutable.isNotEmpty()) { println("La lista tiene elementos.") } }

