package com.example.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_make_calc.setOnClickListener()
        {
            val pesoTxt = edt_peso.text.toString()
            val alturaTxt = edt_altura.text.toString()
            val peso = pesoTxt.toFloat()
            val altura = alturaTxt.toFloat()


            val imcResult = getImcResult(pesoTxt, alturaTxt)


            txt_result_imc.text = imcResult.result.label

        }
    }
}


