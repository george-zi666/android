package com.test.myapplication

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_button.setOnClickListener {
            counter++
            main_text.text = counter.toString()
        }

        input_layout.setOnClickListener{ }
     //   input_layout.isErrorEnabled = true
     //   input_layout.error = "ошибка"
        edit_text.setText("Password")

        progress.max = 100
        progress.progress = 150
        progress.isIndeterminate = false

        seek_view.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                Log.i(tag:"Progress")
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

        btn_black.setOnClickListener{main_container.setBackgroundColor(resources.getColor(R.color.black))}
        btn_blue.setOnClickListener{main_container.setBackgroundColor(resources.getColor(R.color.blue))}
        btn_green.setOnClickListener{main_container.setBackgroundColor(resources.getColor(R.color.green))}
        btn_red.setOnClickListener{main_container.setBackgroundColor(resources.getColor(R.color.red))}
        btn_yellow.setOnClickListener{main_container.setBackgroundColor(resources.getColor(R.color.yellow))}
    }
}