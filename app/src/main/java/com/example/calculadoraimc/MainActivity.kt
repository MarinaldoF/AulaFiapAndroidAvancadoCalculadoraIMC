package com.example.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //É feito a validação do botao
        btn_make_calc.setOnClickListener()
        {
            val pesoTxt = edt_peso.text.toString()
            val alturaTxt = edt_altura.text.toString()
            val peso = pesoTxt.toFloat()
            val altura = alturaTxt.toFloat()

            //Armazena o resultado do calculo IMC
            val imcResult = getImcResult(pesoTxt, alturaTxt)

            //É passado o resultado armazenado para o compo text
            txt_result_imc.text = imcResult.result.label

        }
    }
}


