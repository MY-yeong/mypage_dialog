package com.example.mypage

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log

class MyCustomDialog2(context: Context): Dialog(context) {
    val TAG: String ="로그"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_del_dialog)
        Log.d(TAG, "MyCustomDialog - onCreate() called")
        //배경 투명
        window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    }

}