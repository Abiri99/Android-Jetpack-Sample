package com.example.jetpacksample.view

import android.app.Activity
import android.os.Build
import android.os.Bundle
import android.util.DisplayMetrics
import androidx.appcompat.app.AppCompatActivity
import com.example.jetpacksample.R


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        getSoftButtonsBarSizePort(this)
    }

//    fun getSoftButtonsBarSizePort(activity: Activity): Int { // getRealMetrics is only available with API 17 and +
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
//            val metrics = DisplayMetrics()
//            activity.windowManager.defaultDisplay.getMetrics(metrics)
//            val usableHeight = metrics.heightPixels
//            activity.windowManager.defaultDisplay.getRealMetrics(metrics)
//            val realHeight = metrics.heightPixels
//            return if (realHeight > usableHeight) realHeight - usableHeight else 0
//        }
//        return 0
//    }
}
