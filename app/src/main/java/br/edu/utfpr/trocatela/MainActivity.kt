package br.edu.utfpr.trocatela

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btLancamentoOnClick(view: View){
        val intent = Intent(this, LancamentoActivity::class.java)
        startActivity(intent)
    }
}