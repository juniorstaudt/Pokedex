package com.example.pokedex.view.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pokedex.R
import com.example.pokedex.view.list.ListPokemonsActivity
import com.example.pokedex.view.scan.ScanActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btPokedex.setOnClickListener {
            startActivity(Intent(this, ScanActivity::class.java))
        }
        btPokemonList.setOnClickListener {
            startActivity(Intent(this, ListPokemonsActivity::class.java))
        }
        btClose.setOnClickListener {
            finish()
        }
    }
}
