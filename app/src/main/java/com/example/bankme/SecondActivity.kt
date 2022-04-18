package com.example.bankme

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.bankme.databinding.ActivitySecondBinding

class SecondActivity:AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.vAddMoney.setOnClickListener {
            val intent = Intent(this,ThirdActivity::class.java)
            startActivity(intent)
        }
        binding.apply {
            Glide.with(this@SecondActivity)
                .load("https://media.glamour.com/photos/61fc57518761df16ad6c6484/1:1/w_354%2Cc_limit/1193219327")
                .into(userAvatar)
        }
    }
}