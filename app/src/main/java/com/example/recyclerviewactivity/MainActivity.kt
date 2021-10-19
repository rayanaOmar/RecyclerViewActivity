package com.example.recyclerviewactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val editText3 = findViewById<EditText>(R.id.editText3)
        val editText4 = findViewById<EditText>(R.id.editText4)

        val saveBtn = findViewById<Button>(R.id.button)

        saveBtn.setOnClickListener {

            val ed1 = editText1.getText().toString()
            val ed2 = editText2.getText().toString()
            val ed3 = editText3.getText().toString()
            val ed4 = editText4.getText().toString()

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("name" , ed1)
            intent.putExtra("location", ed2)
            intent.putExtra("mobile", ed3)
            intent.putExtra("email",ed4)
            startActivity(intent)
        }
    }
}

