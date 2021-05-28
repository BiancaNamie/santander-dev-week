package com.example.santanderdevweek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate = menuInflater
        inflate.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.item_1 -> {
                Log.d("CLICK", "CLICK NO ITEM 1 DO OPTIONS MENU")
                true
            }
            R.id.item_2 -> {
                Log.d("CLICK", "CLICK NO ITEM 2 DO OPTIONS MENU")
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}