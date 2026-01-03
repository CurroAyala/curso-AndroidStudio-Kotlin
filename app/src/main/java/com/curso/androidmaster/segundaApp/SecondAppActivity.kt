package com.curso.androidmaster.segundaApp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.google.android.material.slider.RangeSlider
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.curso.androidmaster.R
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.text.DecimalFormat

class SecondAppActivity : AppCompatActivity() {

    private var hombreSeleccionado: Boolean = true
    private var altura: Int = 120
    private var peso: Int = 60
    private var edad: Int = 25

    private lateinit var hombre: CardView
    private lateinit var mujer: CardView
    private lateinit var marcadorAltura: TextView
    private lateinit var deslizadorAltura: RangeSlider
    private lateinit var restarPeso: FloatingActionButton
    private lateinit var sumarPeso: FloatingActionButton
    private lateinit var marcadorPeso: TextView
    private lateinit var restarEdad: FloatingActionButton
    private lateinit var sumarEdad: FloatingActionButton
    private lateinit var marcadorEdad: TextView

    private lateinit var btnResultado: Button
    private lateinit var resultado: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_app)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        initComponentes()
        initListeners()
        cambiarColorSexos(hombreSeleccionado)
        pintarPeso()
        pintarEdad()
    }

    private fun initComponentes() {
        hombre = findViewById<CardView>(R.id.hombre)
        mujer = findViewById<CardView>(R.id.mujer)
        marcadorAltura = findViewById<TextView>(R.id.marcadorAltura)
        deslizadorAltura = findViewById<RangeSlider>(R.id.deslizadorAltura)
        restarPeso = findViewById<FloatingActionButton>(R.id.restarPeso)
        sumarPeso = findViewById<FloatingActionButton>(R.id.sumarPeso)
        marcadorPeso = findViewById<TextView>(R.id.marcadorPeso)
        restarEdad = findViewById<FloatingActionButton>(R.id.restarEdad)
        sumarEdad = findViewById<FloatingActionButton>(R.id.sumarEdad)
        marcadorEdad = findViewById<TextView>(R.id.marcadorEdad)

        btnResultado = findViewById<Button>(R.id.btnResultado)
        resultado = findViewById<TextView>(R.id.resultado)
    }

    private fun initListeners() {
        hombre.setOnClickListener {
            if (!hombreSeleccionado) {
                hombreSeleccionado = true
            }
            cambiarColorSexos(hombreSeleccionado)
            Log.i("DEBUG", "Valor de hombreSeleccionado: $hombreSeleccionado")
        }
        mujer.setOnClickListener() {
            if (hombreSeleccionado) {
                hombreSeleccionado = false
            }
            cambiarColorSexos(hombreSeleccionado)
            Log.i("DEBUG", "Valor de hombreSeleccionado: $hombreSeleccionado")
        }
        deslizadorAltura.addOnChangeListener { _, value, _ ->
            val formato = DecimalFormat("#.##")
            val alturaString = formato.format(value)
            altura = alturaString.toInt()
            marcadorAltura.text = "$altura cm" // ignorar warning
        }
        restarPeso.setOnClickListener {
            if (peso > 0) {
                peso -= 1
            }
            pintarPeso()
        }
        sumarPeso.setOnClickListener {
            if (peso < 200) {
                peso += 1
            }
            pintarPeso()
        }
        restarEdad.setOnClickListener {
            if (edad > 0) {
                edad -= 1
            }
            pintarEdad()
        }
        sumarEdad.setOnClickListener {
            if (edad < 99) {
                edad += 1
            }
            pintarEdad()
        }
        btnResultado.setOnClickListener {
            pintarResultado()
        }
    }

    private fun cambiarColorSexos(hombreSeleccionado: Boolean) {

        fun cambiarColor(componente: CardView, estado: Boolean) {
            if (estado) {
                componente.setCardBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        R.color.widget_bg_1_selected
                    )
                )
            } else {
                componente.setCardBackgroundColor(ContextCompat.getColor(this, R.color.widget_bg_1))
            }
        }

        cambiarColor(hombre, hombreSeleccionado)
        cambiarColor(mujer, !hombreSeleccionado)
    }

    private fun pintarPeso() {
        marcadorPeso.text = "$peso kg"
    }

    private fun pintarEdad() {
        marcadorEdad.text = "$edad años"
    }

    private fun calcularIMC(): Double {
        val imc = peso / (altura.toDouble() / 100 * altura.toDouble() / 100)
        return imc
    }

    private fun calcularEstado(imc:Double): Int {
        return when {
            imc < 18.5 -> R.string.infrapeso
            imc < 25.0 -> R.string.normal
            imc < 30.0 -> R.string.sobrepeso
            else -> R.string.obesidad
        }
    }

    private fun pintarResultado() {
        val imc = calcularIMC()
        val formato = DecimalFormat("#.##")
        val res = formato.format(imc).toDouble()
        val estadoId = calcularEstado(imc)
        val estado = getString(estadoId)
        resultado.text = "IMC: $res. Tu estado es de $estado."
    }

}