package com.example.gum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import com.example.gum.LOGINORREGIST.login

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"Guide For U Material", Toast.LENGTH_SHORT).show()
        Handler(getMainLooper()).postDelayed(
            { val intent = Intent(this, login::class.java)
                startActivity(intent);finish() }, 4000)

    }


}