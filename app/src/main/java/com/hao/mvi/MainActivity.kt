package com.hao.mvi

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hao.mvi.R

/**
 * 注意：xml fragment 在未设置configChanges的情况下旋转屏幕Fragment会销毁重建
 * @see MainFragment
 *
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }

    //旋转屏幕时执行
    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
    }
}