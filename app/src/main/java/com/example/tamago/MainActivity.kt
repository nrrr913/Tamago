package com.example.tamago

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var changeButton = findViewById<Button>(R.id.change)
        var eggImage = findViewById<ImageView>(R.id.egg)
        var remainNum = findViewById<TextView>(R.id.remain)
        var num = 100

        remainNum.setText(num.toString())

        eggImage.setOnClickListener{

            if(num>0){
                num--
                remainNum.setText(num.toString())

                if(num==80){eggImage.setImageResource(R.drawable.egg2)}
                if(num==65){eggImage.setImageResource(R.drawable.egg3)}
                if(num==45){eggImage.setImageResource(R.drawable.egg4)}
                if(num==30){eggImage.setImageResource(R.drawable.egg5)}
                if(num==10){eggImage.setImageResource(R.drawable.egg6)}
                if(num==0){eggImage.setImageResource(R.drawable.egg7)}

            }

        }

        changeButton.setOnClickListener {
            num = 100
            remainNum.setText(num.toString())
            eggImage.setImageResource(R.drawable.egg1)
        }


    }
}