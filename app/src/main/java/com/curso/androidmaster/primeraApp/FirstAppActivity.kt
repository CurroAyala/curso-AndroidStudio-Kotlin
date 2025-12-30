package com.curso.androidmaster.primeraApp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.curso.androidmaster.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_first_app)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val button = findViewById<AppCompatButton>(R.id.button)
        val editName = findViewById<AppCompatEditText>(R.id.editName)

        button.setOnClickListener {
            val nombre:String = editName.text.toString()

            if (nombre.isNotEmpty()) {
                Log.i(nombre,"DEBUG -- Botón pulsado.")

                val intent = Intent(this, ResponseActivity::class.java)
                intent.putExtra("NAME", nombre)
                startActivity(intent)

            } else {
                Log.i("sin-nombre","DEBUG -- Botón pulsado.")
            }


        }

    }
}