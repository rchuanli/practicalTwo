package com.example.practicaltwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.ViewAnimator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun addNickname(view: View) {
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val nicknameText = findViewById<TextView>(R.id.nickname_text)

        nicknameText.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
        nicknameText.visibility = View.VISIBLE

        // Hinde the keyboard
        val inputMethodManager = getSystemService()
    }

    fun clickHandleFunction(view: View) {}
}