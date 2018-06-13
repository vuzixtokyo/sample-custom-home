package jp.vuzix.tokyo.customhomeapp

import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    companion object {
        val SETTINGS_PACKAGE_NAME = "com.android.settings"
        val SETTINGS_CLASS_NAME = "com.android.settings.Settings"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_open_setting.setOnClickListener({
            val intent = Intent().apply {
                setClassName(SETTINGS_PACKAGE_NAME, SETTINGS_CLASS_NAME)
            }
            startActivity(intent)
        })

    }
}
