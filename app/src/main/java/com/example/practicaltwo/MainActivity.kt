package com.example.practicaltwo

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.TextView
import android.widget.ViewAnimator
import androidx.databinding.DataBindingUtil
import com.example.practicaltwo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val myName2: MyName = MyName("BAIT")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //setContentView(R.layout.activity_main)
        binding.myName1 = myName2
        binding.doneButton.setOnClickListener { addNickname(it) }
        binding.nicknameText.setOnClickListener{ updateNickname(it) }

    }

    private fun addNickname(view: View) {

        binding.apply {
            myName1?.nickname = nicknameEdit.text.toString()
            invalidateAll()
            //nicknameText.text = binding.nicknameEdit.text.toString()
            nicknameEdit.visibility = View.GONE
            doneButton.visibility = View.GONE
            nicknameText.visibility = View.VISIBLE
        }
        // Hinde the keyboard
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE)
            as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun updateNickname(view: View) {

        binding.apply {
            nicknameEdit.visibility = View.VISIBLE
            doneButton.visibility = View.VISIBLE
            view.visibility = View.GONE
        }

    }
}