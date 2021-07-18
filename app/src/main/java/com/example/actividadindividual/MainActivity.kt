package com.example.actividadindividual

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar

        actionBar !!.title = "Página principal"

        val nextBtn = findViewById<Button>(R.id.nextButton)
        nextBtn.setOnClickListener{pasarVentana()}
    }

    private fun pasarVentana(){
        val intent = Intent(this,formulario::class.java)
        startActivity(intent)
    }
}