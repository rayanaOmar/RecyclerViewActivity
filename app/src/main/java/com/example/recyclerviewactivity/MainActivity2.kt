package com.example.recyclerviewactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity2 : AppCompatActivity() {

    lateinit var messages: ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val rvMessages = findViewById<RecyclerView>(R.id.rvM)

        val edit1 = getIntent().getExtras()?.getString("name");
        val edit2 = getIntent().getExtras()?.getString("location");
        val edit3 = getIntent().getExtras()?.getString("mobile");
        val edit4 = getIntent().getExtras()?.getString("email");

        messages = ArrayList()

        messages.add("${edit1.toString()}")
        messages.add("${edit2.toString()}")
        messages.add("${edit3.toString()}")
        messages.add("${edit4.toString()}")

        rvMessages.adapter?.notifyDataSetChanged()

        rvMessages.adapter = MessageAdapter(this, messages)
        rvMessages.layoutManager = LinearLayoutManager(this)

    }

}