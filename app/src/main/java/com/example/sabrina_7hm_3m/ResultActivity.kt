package com.example.sabrina_7hm_3m

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sabrina_7hm_3m.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvTextResult.text = intent.getStringExtra("name").toString()
        binding.tvTextResult2.text = intent.getStringExtra("singer").toString()
    }
}