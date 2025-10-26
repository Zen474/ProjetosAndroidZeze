package com.example.calculadorasimples

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editNum1 = findViewById<EditText>(R.id.edit_num1)
        val editNum2 = findViewById<EditText>(R.id.edit_num2)
        val buttonSomar = findViewById<Button>(R.id.button_somar)
        val buttonSubtrair = findViewById<Button>(R.id.button_subtrair)
        val textResultado = findViewById<TextView>(R.id.text_resultado)

        buttonSomar.setOnClickListener {
            val num1 = editNum1.text.toString().toDoubleOrNull()
            val num2 = editNum2.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                val resultado = num1 + num2
                textResultado.text = "Resultado: $resultado"
            } else {
                textResultado.text = "Digite números válidos"
            }
        }

        buttonSubtrair.setOnClickListener {
            val num1 = editNum1.text.toString().toDoubleOrNull()
            val num2 = editNum2.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                val resultado = num1 - num2
                textResultado.text = "Resultado: $resultado"
            } else {
                textResultado.text = "Digite números válidos"
            }
        }
    }
}
