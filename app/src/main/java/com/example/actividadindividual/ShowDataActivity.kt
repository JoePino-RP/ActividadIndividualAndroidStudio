package com.example.actividadindividual

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ShowDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_data)

        val actionBar = supportActionBar

        actionBar !!.title = "Información"

        var intent = intent
        val name = intent.getStringExtra("Name")
        val email = intent.getStringExtra("Email")
        val phone = intent.getStringExtra("Phone")

        val showNameTV = findViewById<TextView>(R.id.nameTextView)

        showNameTV.text = "Nombre: "+name+"\nE-mail: "+email+"\nCelular: "+phone





    }
}