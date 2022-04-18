package com.example.bankme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.bankme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {

            if (binding.etAccountPassword.toString().isBlank()){
                val toast = Toast.makeText(this,
                    "Password is not correct",
                Toast.LENGTH_LONG)
                toast.show()
            }
            else {
                val intent = Intent(this,SecondActivity::class.java)
                startActivity(intent)
            }
        }
    }
}