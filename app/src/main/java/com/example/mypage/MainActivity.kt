package com.example.mypage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.View
import android.widget.Button
import com.google.android.material.switchmaterial.SwitchMaterial
import kotlin.String
import kotlin.Unit


class MainActivity : AppCompatActivity() {

    val TAG: String = "로그"
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

    }

    fun onDialogBtnClicked(view: View){
        Log.d(TAG, "MainActivity - onDialogBtnClicked() called")

        val myCustomDialog = MyCustomDialog(context = this)
        myCustomDialog.show()
    }

    fun onDialogBtn2Clicked(view: View){
        Log.d(TAG, "MainActivity - onDialogBtnClicked() called")
        val myCustomDialog2 = MyCustomDialog2(context = this)
        myCustomDialog2.show()
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