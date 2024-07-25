package de.syntax_institut.readme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import de.syntax_institut.readme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {



    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // new changes


    }
}