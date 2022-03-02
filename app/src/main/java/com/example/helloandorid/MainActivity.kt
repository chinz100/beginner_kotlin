package com.example.helloandorid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonHello = findViewById(R.id.buttonHello) as Button
        var view = findViewById(R.id.textView2) as TextView
        var name = findViewById(R.id.editTextTextPersonName) as EditText
        var age = findViewById(R.id.editTextNumber) as EditText
//
        buttonHello.setOnClickListener {

            if(name.text.toString() == "" || age.text.toString() == ""){
                Toast.makeText(this,"plase Enter your name and age",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,name.text.toString(),Toast.LENGTH_LONG).show()
                val helloTextView = findViewById<TextView>(R.id.buttonHello)
                helloTextView.text = "Hello BorntoDev"
                view.text = "ttttttt"

            }

        }

//        println("testtt")

    }
}