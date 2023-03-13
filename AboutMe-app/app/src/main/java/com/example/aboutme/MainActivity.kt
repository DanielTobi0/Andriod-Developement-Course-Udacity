package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.done_button).setOnClickListener {
            addNickName(it)
        }


    }

    private fun addNickName(view: View) {
        val editText = findViewById<EditText>(R.id.nickname_edt)
        val nickNameTextView = findViewById<EditText>(R.id.nickname_text)


        nickNameTextView.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
        editText.visibility = View.VISIBLE

        //To hide keyboard after entering text
        val hideKeyboard = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        hideKeyboard.hideSoftInputFromWindow(view.windowToken, 0)
    }
}

