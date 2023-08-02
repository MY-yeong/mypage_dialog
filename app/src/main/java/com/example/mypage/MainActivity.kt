package com.example.mypage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Context
import android.content.Intent
import android.widget.Button
import com.google.android.material.switchmaterial.SwitchMaterial
import kotlin.String
import kotlin.Unit


class MainActivity : AppCompatActivity() {

//    val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val team : Button = findViewById(R.id.team)
        team.setOnClickListener {
            val intent = Intent(this, sub::class.java)
            startActivity(intent)
        }

        val pay : Button = findViewById(R.id.pay)
        pay.setOnClickListener {
            val intent = Intent(this, pays::class.java)
            startActivity(intent)
        }

        val switch1 : SwitchMaterial = findViewById(R.id.switch1)
        switch1.setOnCheckedChangeListener { buttonView, _ ->
            if(buttonView.id == R.id.switch1){
                //스위치 켜졌을 때
            } else {
                //스위치 꺼졌을 때
            }
        }

        val logout : Button = findViewById(R.id.logout)
        logout.setOnClickListener {
            val intent = Intent(this, sub::class.java)
            startActivity(intent)
        }

        val del : Button = findViewById(R.id.del)
        del.setOnClickListener {
            val intent = Intent(this, pays::class.java)
            startActivity(intent)
        }
    }

    companion object {
        const val TAG: String = "MYPAGE_ACTIVITY"


        fun getIntent(context: Context, bundle: Bundle?): Intent {
            val destIntent = Intent(context, MainActivity::class.java)
            destIntent.putExtra("bundle", bundle)
            return destIntent
        }
    }
}