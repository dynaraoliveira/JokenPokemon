package br.com.dynararico.jokenpokemon

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btSair.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            vaiParaTelaLogin()
        }
    }

    private fun vaiParaTelaLogin() {
        val telaLogin = Intent(this, LoginActivity::class.java)
        startActivity(telaLogin)
        finish()
    }

}

