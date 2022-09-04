package com.dag.odev2fmss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.dag.odev2fmss.databinding.ActivityCreateAccountBinding

class CreateAccountActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCreateAccountBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val returnWBIntent = Intent(this, WelcomeBackActivity::class.java)

        val eMail = findViewById<EditText>(R.id.enter_email)
        val mail = eMail.editableText.toString()
        val cUser = findViewById<EditText>(R.id.create_user)
        val user = cUser.editableText.toString()
        val cPass = findViewById<EditText>(R.id.create_pass)
        val pass = cPass.editableText.toString()

        binding.returnButton1.setOnClickListener{
            startActivity(returnWBIntent)
        }
        binding.signUpButton.setOnClickListener {
            Toast.makeText(this@CreateAccountActivity, "Email: $mail \nUsername: $user \nPassword: $pass", Toast.LENGTH_SHORT).show()
        }
    }
}