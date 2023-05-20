package com.example.gum.LOGINORREGIST

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.gum.ModelDB.AppDatabase
import com.example.gum.ModelDB.User
import com.example.gum.R
import com.example.gum.databinding.ActivityLoginBinding
import com.example.gum.databinding.ActivityRegistBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class Regist : AppCompatActivity() {
    private lateinit var binding: ActivityRegistBinding
    private lateinit var appdb: AppDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRegistBinding.inflate(layoutInflater)
        setContentView(binding.root)
        appdb = AppDatabase.getDatabase(this)
        binding.buttonRegistration.setOnClickListener {
            insert()
        }
        }
    private fun insert() {

        val Name = binding.name.text.toString()
        val email = binding.emailR.text.toString()
        val password = binding.password.text.toString()
        val IDNo = binding.id.text.toString()
        val Phone = binding.phone.text.toString()

        if (Name.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty() && IDNo.isNotEmpty() && Phone.isNotEmpty()) {
            val user = User(
                null, Name, email, password, IDNo, Phone
            )
            GlobalScope.launch(Dispatchers.IO) {
                appdb.UserDao().insert(user)
            }
            binding.name.text.clear()
            binding.emailR.text.clear()
            binding.password.text.clear()
            binding.id.text.clear()
            binding.phone.text.clear()
            Toast.makeText(this, "registration done", Toast.LENGTH_LONG).show()
            var intent = Intent(this, login::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Please enter All fields", Toast.LENGTH_LONG).show()
        }
    }

}