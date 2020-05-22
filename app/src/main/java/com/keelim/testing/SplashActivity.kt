package com.keelim.testing

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.keelim.testing.main.MainActivity
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        loading()

        Snackbar.make(splash_container, "AOSP(Android Open Source Project) 개선 프로젝트 측정 앱입니다.", Snackbar.LENGTH_SHORT).show()
        // 안내 페이지 표시
        // progress bar 자동으로 표시
    }

    private fun loading() {
        val handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(intent)
            }
            , 3000
        )
    }
}