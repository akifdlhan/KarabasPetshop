package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding// Bu eklenmez ise aldığımız id ler eklenemez hata alır
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

    }
    fun misafirGiris(view: View){
        val intent=Intent(applicationContext,Petshop::class.java)
        startActivity(intent)
    }
    fun adminGiris(view: View){
        val intent=Intent(applicationContext,Admin::class.java)
        startActivity(intent)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId==R.id.add_petshop_item){
            val intent=Intent(this@MainActivity,Petshop::class.java)
            startActivity(intent)
        }

        return super.onOptionsItemSelected(item)
    }


}