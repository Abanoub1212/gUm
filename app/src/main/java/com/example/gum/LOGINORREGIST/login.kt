package com.example.gum.LOGINORREGIST

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.gum.Choose2
import com.example.gum.ModelDB.AppDatabase
import com.example.gum.ModelDB.User
import com.example.gum.databinding.ActivityLoginBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class login : AppCompatActivity() {
    /**
     *
     */
    lateinit var binding: ActivityLoginBinding

    /**
     *
     */
    lateinit var appdb: AppDatabase

    /**
     *
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        appdb = AppDatabase.getDatabase(this)
        binding.buttonLogin.setOnClickListener {
            check()
        }
        binding.Rtext.setOnClickListener {
            val intent = Intent(this, Regist::class.java)
            startActivity(intent)
        }
    }

    private fun valid(user: User) {
        val thread: Thread = object : Thread() {
            override fun run() {
                runOnUiThread {
                    if (user != null) {
                        Toast.makeText(this@login, "login done", Toast.LENGTH_LONG).show()
                        val intent = Intent(this@login, Choose2::class.java)
                        startActivity(intent)
                        binding.emailL.text.clear()
                        binding.password.text.clear()
                    } else {
                        toast()
                    }
                }
            }
        }
        thread.start()
    }


    private fun check() {
        val email = binding.emailL.text.toString()
        val password = binding.password.text.toString()
        if (email.isNotEmpty() && password.isNotEmpty()) {
            GlobalScope.launch {
                val user: User = appdb.UserDao().login(email, password)
                valid(user)
            }
        } else {
            Toast.makeText(this, "Please Enter All fields", Toast.LENGTH_LONG).show()
        }
    }

    private fun toast(){
        Toast.makeText(this, "Wrong user name oe password", Toast.LENGTH_LONG).show()
    }
}
