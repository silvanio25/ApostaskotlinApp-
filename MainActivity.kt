
package com.apostas.app

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var resultadoText: TextView
    private lateinit var buscarBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultadoText = findViewById(R.id.resultadoText)
        buscarBtn = findViewById(R.id.buscarBtn)

        buscarBtn.setOnClickListener {
            val apostas = ApostasHelper.gerarApostas()
            val exibicao = apostas.joinToString("\n\n") {
                "\${it.jogo}\nMercado: \${it.mercado}\nOdd: \${it.odd}\nProb: \${it.probabilidade}%\nValue: \${"%.2f".format(it.value())}\nRecomendado: \${if (it.recomendada()) "✅" else "❌"}"
            }
            resultadoText.text = exibicao
        }
    }
}
