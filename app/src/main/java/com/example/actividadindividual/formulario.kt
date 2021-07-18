package com.example.actividadindividual

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class formulario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario2)

        val actionBar = supportActionBar

        actionBar !!.title = "Formulario"

        val nameET = findViewById<EditText>(R.id.nameEditText)
        val emailET = findViewById<EditText>(R.id.emailEditText)
        val phoneET = findViewById<EditText>(R.id.phoneEditText)
        val regBtn = findViewById<Button>(R.id.registerButton)



        regBtn.setOnClickListener{
            var nameET1 = nameET.text.toString()
            var emailET1 = emailET.text.toString()
            var phoneET1 = phoneET.text.toString()

            val intent = Intent(this@formulario,ShowDataActivity::class.java)
            intent.putExtra("Name",nameET1)
            intent.putExtra("Email",emailET1)
            intent.putExtra("Phone",phoneET1)
            startActivity(intent)
        }
    }
    private fun pasarVentana1(na:String,em:String,ph:String){

        val intent = Intent(this@formulario,ShowDataActivity::class.java)
        intent.putExtra("Name",na)
        intent.putExtra("Email",em)
        intent.putExtra("Phone",ph)
        startActivity(intent)
    }
}