package com.curso.androidmaster

/**
 * WHEN
 *
 * La expresión when es una evolución de la cláusula switch/case de JAVA
 *
 */

// EJEMPLO DE MALA PRÁCTICA: muchos IFs anidados
// Esta función está lejos de ser óptima
fun decirMesIf(mes:Int) {
    if (mes == 1) {
        println("Enero")
    } else if (mes == 2) {
        println("Febrero")
    } else if (mes == 3) {
        println("Marzo")
    } else if (mes == 4) {
        println("Abril")
    } else if (mes == 5) {
        println("Mayo")
    } else if (mes == 6) {
        println("Junio")
    } else if (mes == 7) {
        println("Julio")
    } else if (mes == 8) {
        println("Agosto")
    } else if (mes == 9) {
        println("Septiembre")
    } else if (mes == 10) {
        println("Octubre")
    } else if (mes == 11) {
        println("Noviembre")
    } else if (mes == 12) {
        println("Diciembre")
    } else {
        println("El mes $mes no existe")
    }
}

// USO BÁSICO DEL WHEN
fun decirMesWhen(mes:Int) {
    when(mes) {
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> println("Noviembre")
        12 -> println("Diciembre")
        else -> println("El mes $mes no existe")
    }
}

// USO DEL WHEN EJECUTANDO LO MISMO PARA VARIOS CASOS
fun decirTrimestre(mes:Int) {
    when(mes) {
        1, 2, 3 -> println("Primer trimestre")
        4, 5, 6 -> println("Segundo trimestre")
        7, 8, 9 -> println("Tercer trimestre")
        10, 11, 12 -> println("Cuarto trimestre")
        else -> println("El mes $mes no existe")
    }
}

// USO DEL WHEN CON RANGOS
// Para la negación de rango se coloca un <!> delante del <in>
fun decirSemestre(mes:Int) {
    when (mes) {
        in 1 .. 6 -> println("Primer semestre")
        in 7..12 -> println("Segundo semestre")
        else -> println("El mes $mes no existe")
    }
}

// USO DEL WHEN EJECUTANDO VARIAS INSTRUCCIONES PARA UN CASO
fun decirMesYTemperatura(mes:Int) {
    when(mes) {
        1 -> {
            println("Enero")
            println("Frío")
        }
        2 -> {
            println("Febrero")
            println("Frío")
        }
        3 -> {
            println("Marzo")
            println("Templado")
        }
        4 -> {
            println("Abril")
            println("Templado")
        }
        5 -> {
            println("Mayo")
            println("Calor")
        }
        6 -> {
            println("Junio")
            println("Calor")
        }
        7 -> {
            println("Julio")
            println("Calor")
        }
        8 -> {
            println("Agosto")
            println("Calor")
        }
        9 -> {
            println("Septiembre")
            println("Templado")
        }
        10 -> {
            println("Octubre")
            println("Templado")
        }
        11 -> {
            println("Noviembre")
            println("Frío")
        }
        12 -> {
            println("Diciembre")
            println("Frío")
        }
        else -> println("El mes $mes no existe")
    }
}

// WHEN USADO COMO VARIABLE
// En este caso, los casos del When devuelven un valor
// También se podría almacenar el return del When en una variable
fun decirSemetre2(mes:Int):String {
    return when(mes) {
        in 1..6 -> "Primer semestre"
        in 7..12 -> "Segundo semestre"
        else -> "El mes $mes no existe"
    }
}


fun main() {

}