package com.example.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showColorDisplayView=findViewById<TextView>(R.id.textView2)
        val clickRed=findViewById<TextView>(R.id.Red)
        val clickGreen=findViewById<TextView>(R.id.green)
        val clickBlue=findViewById<TextView>(R.id.textView5)

        clickRed.setOnClickListener{


            showColorDisplayView.text="Red was clicked"
        }
        clickGreen.setOnClickListener{


            showColorDisplayView.text="Green was clicked"
        }

        clickBlue.setOnClickListener{


            showColorDisplayView.text="Blue was clicked"
        }

    }
}