package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import android.view.View
import android.widget.TextView
import com.example.myapplication.databinding.ActivityPetshopBinding

class Petshop : AppCompatActivity() {//latenit değişkenleri tannımladıktan  sonra   kullanmak için yazılır
    lateinit var binding:ActivityPetshopBinding //java da Kullanıcı bilgi almak için kullanılır
    override fun onCreate(savedInstanceState: Bundle?) {//int main(){}
        super.onCreate(savedInstanceState)
        binding= ActivityPetshopBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
    }
    fun giris(view:View){
        var k_adi=binding.isim.text.toString()//string değeri var değişkeni olan k_adi ne atama
        var k_sifre=binding.sifre.text.toString()
        if(k_adi=="Akif"&&k_sifre=="123"||k_adi=="Sinan"&&k_sifre=="123"){
            val intent = Intent(applicationContext,Costemers::class.java)//formlar arası geçiş
            startActivity(intent)
        }else if(k_adi==""&&k_sifre==""){
            binding.txtHataliGiris.setText("Kullanıcı Adı Veya Şifre Boş Geçilmez")
        }else if(k_adi==""){
            binding.txtHataliGiris.setText("Kullanıcı Adı Boş Geçilmez")
        }else if(k_sifre==""){
            binding.txtHataliGiris.setText("Şifre Boş Geçilmez")
        }
        else{
            binding.txtHataliGiris.setText("Kullanıcı Adı Veya Şifre Hatalıdır")
        }
    }
    fun kayit(view: View){
        val intent=Intent(applicationContext,musteriKayita::class.java)
        startActivity(intent)
    }
}
