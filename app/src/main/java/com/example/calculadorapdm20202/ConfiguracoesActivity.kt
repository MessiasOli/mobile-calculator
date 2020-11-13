package com.example.calculadorapdm20202

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_configuracoes.*

class ConfiguracoesActivity : AppCompatActivity() {
    // Referência para um objeto Configuracoes
    private lateinit var configuracoes: Configuracoes

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuracoes)

        supportActionBar?.subtitle = "Tela de configurações"

        // Recuperar o parâmetro que veio pela Intent da MainActivity
        configuracoes = intent.getParcelableExtra(MainActivity.EXTRA_CONFIGURACOES) ?: Configuracoes(false)
        tipoCalculadoraRg.check(if (configuracoes.avancada) R.id.avancadoRb else R.id.basicaRb)
    }

    fun onClick(view: View) {
        if (view.id == R.id.salvarBt) {
            // Enviar a configuração de volta para a MainActivity
            configuracoes.avancada = avancadoRb.isChecked
            val resultadoIntent = Intent()
            resultadoIntent.putExtra(MainActivity.EXTRA_CONFIGURACOES, configuracoes)
            setResult(RESULT_OK, resultadoIntent)

            Log.v(getString(R.string.app_name), "onClick Save - salvando dados de instância e finalizando")
            finish()
        }
    }
}