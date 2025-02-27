package com.comunidadedevspace.imc

import android.app.appsearch.StorageInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Recuperar os componentes EditText
        // Criar uma variavel e associar(=) o componente de UI<TextInputEditText>
        // Recuperar o botao da tela
        // Colocar acao no botao setOnClickListener
        // Recuperar o texto digitado no edt peso

        val edtPeso = findViewById<TextInputEditText>(R.id.eddt_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.eddt_altura)

        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener {
            val peso: Float = edtPeso.text.toString().toFloat()
            val altura: Float = edtAltura.text.toString().toFloat()


            val alturaQ2 = altura * altura
            val resultado = peso / alturaQ2
            println("Acao do botao" + resultado)
        }
    }
}