package com.dag.odev2fmss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.dag.odev2fmss.databinding.ActivityGetStartedBinding
import com.dag.odev2fmss.databinding.ActivityWelcomeBackBinding

class WelcomeBackActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBackBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBackBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val loginIntent = Intent(this, CreateAccountActivity::class.java)
        val returnGSIntent = Intent(this, GetStartedActivity::class.java)

        val eUser = findViewById<EditText>(R.id.username)
        val user = eUser.editableText.toString()
        val ePass = findViewById<EditText>(R.id.password)
        val pass = ePass.editableText.toString()

        binding.returnButton2.setOnClickListener {
            startActivity(returnGSIntent)
        }
        binding.loginButton.setOnClickListener {
            Toast.makeText(this@WelcomeBackActivity, "Username: $user \nPassword: $pass", Toast.LENGTH_SHORT).show()
        }
        binding.orCreateA.setOnClickListener{
            startActivity(loginIntent)
        }

    }
}