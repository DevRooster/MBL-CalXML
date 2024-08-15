package com.example.calcxml

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var valAnt=0.0
    var valAct=0.0
    var operador=""
    private lateinit var resultado:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        ButtonSetup()
    }
    fun ButtonSetup(){
        var  listaB= arrayOf(R.id.btn9, R.id.btn8, R.id.btn7, R.id.btn6,
            R.id.btn5, R.id.btn4, R.id.btn3, R.id.btn2, R.id.btn1)
        for (Button in listaB){
            val butonx=findViewById<Button>(Button)
            butonx.setOnClickListener { onclickListener(butonx) }
        }
    }
    fun onclickListener(view:View){
        when(view.id){
            R.id.btn9, R.id.btn8, R.id.btn7, R.id.btn6, R.id.btn5, R.id.btn4, R.id.btn3, R.id.btn2, R.id.btn1->{
                var butonx=findViewById<Button>(view.id)
                apenddNum(butonx.text.toString())
            }
        }

    }

    fun apenddNum(valor:String){
        resultado.append(valor)
    }
}