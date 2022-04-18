package com.example.bankme

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.bankme.databinding.ActivityThirdBinding

class ThirdActivity: AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            if (binding.vAmount.toString().isBlank())
            {
                val myToast = Toast.makeText(this,"Type amount", Toast.LENGTH_LONG)
                myToast.show()
            }

        }
    }
}