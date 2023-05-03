package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilinput1:TextInputLayout
    lateinit var etinput1:TextInputEditText
    lateinit var tilinput2:TextInputLayout
    lateinit var etinput2:TextInputEditText
    lateinit var btnadd:Button
    lateinit var btnsubtract:Button
    lateinit var btnmultiply:Button
    lateinit var btndivision:Button
    lateinit var tvanswer: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     castView()
    }

    fun castView(){
        tilinput1=findViewById(R.id.tilinput1)
        tilinput2=findViewById(R.id.tilinput2)
        etinput1=findViewById(R.id.etinput1)
        etinput2=findViewById(R.id.etinput2)
        btnadd=findViewById(R.id.btnadd)
        btnsubtract=findViewById(R.id.btnsubtract)
        btnmultiply=findViewById(R.id.btnmultiply)
        btndivision=findViewById(R.id.btndivision)
        tvanswer=findViewById(R.id.tvanswer)

        btnadd.setOnClickListener { calculateResult('+') }
        btnsubtract.setOnClickListener { calculateResult('-') }
        btnmultiply.setOnClickListener { calculateResult('*') }
        btndivision.setOnClickListener { calculateResult('/') }
    }

    fun calculateResult(operator: Char) {
        val num1 = etinput1.text.toString().toDouble()
        val num2 = etinput2.text.toString().toDouble()
        val result = when (operator) {
            '+' -> num1 + num2
            '-' -> num1 - num2
            '*' -> num1 * num2
            '/' -> num1 / num2
            else -> throw IllegalArgumentException("Invalid operator: $operator")
        }

        tvanswer.text = result.toString()
    }
}

