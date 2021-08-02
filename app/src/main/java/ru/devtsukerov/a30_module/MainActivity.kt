package ru.devtsukerov.a30_module

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edit_text.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            //Проверяем, если текстовый ввод пустой, то кнопка неактивна, если ввод содержит текст,
            //то на кнопку можно нажать, обратите внимание на метод isNotBlank(), он проверяет, не
            //пусто ли поле и не содержит ли только пробелы, то есть, если из символов будут только пробелы,
            //то поле будет считаться пустым
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                button_next.isEnabled = s.isNotBlank()
            }
        })
        //По нажатии на кнопку будет тост
        button_next.setOnClickListener {
            Toast.makeText(this, "Click!", Toast.LENGTH_SHORT).show()
        }
    }
}