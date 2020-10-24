package com.example.myintentapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity : Button = findViewById(R.id.btn_move)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveActivityWithData : Button = findViewById(R.id.btn_move_with_data)
        btnMoveActivityWithData.setOnClickListener(this)

        val btnDialNumber : Button = findViewById(R.id.btn_dialNumber)
        btnDialNumber.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_move->{
                val moveIntent = Intent(this@MainActivity , MoveActivity::class.java)
                startActivity(moveIntent)
            }//Move

            R.id.btn_move_with_data->{
                val moveDataIntent = Intent(this@MainActivity , MoveWithDataActivity::class.java)
                moveDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Faiz Rofi Hencya")
                moveDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 19)
                startActivity(moveDataIntent)
            }//moveWithData

            R.id.btn_dialNumber->{
                val phoneNumber = "081278486869"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)

            }
        }//when
    }//onClick


}