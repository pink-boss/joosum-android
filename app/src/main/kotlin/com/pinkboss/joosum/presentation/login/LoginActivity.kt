package com.pinkboss.joosum.presentation.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pinkboss.joosum.databinding.ActivityLoginBinding
import com.pinkboss.joosum.presentation.home.HomeActivity

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnLoginGoogle.setOnClickListener { goToHome() }
            btnLoginKakao.setOnClickListener { goToHome() }
            btnLoginNaver.setOnClickListener { goToHome() }
        }
    }

    private fun goToHome() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}