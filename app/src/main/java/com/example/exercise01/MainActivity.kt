package com.example.exercise01

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

@Suppress("RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS") // メソッド名にnullの可能性がある警告が出るのでその警告が出ないようにしている
class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.text)

        // click_buttonクリック処理
        findViewById<Button>(R.id.click_button).setOnClickListener {
            textView.text = "Button is Clicked!"
        }

        // move_buttonクリック処理
        findViewById<Button>(R.id.move_button).setOnClickListener {
            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        }

        // ログ出力
        outputLog(object{}.javaClass.enclosingMethod.name)
    }

    override fun onStart() {
        super.onStart()
        // ログ出力
        outputLog(object{}.javaClass.enclosingMethod.name)
    }

    override fun onResume() {
        super.onResume()
        // ログ出力
        outputLog(object{}.javaClass.enclosingMethod.name)
    }

    override fun onPause() {
        super.onPause()
        // ログ出力
        outputLog(object{}.javaClass.enclosingMethod.name)
    }

    override fun onStop() {
        super.onStop()
        // ログ出力
        outputLog(object{}.javaClass.enclosingMethod.name)
    }

    override fun onRestart() {
        super.onRestart()
        // ログ出力
        outputLog(object{}.javaClass.enclosingMethod.name)
    }

    override fun onDestroy() {
        super.onDestroy()
        // ログ出力
        outputLog(object{}.javaClass.enclosingMethod.name)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        // 状態の保存
        outState.putString(KEY, textView.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        // 状態の復元
        textView.text = savedInstanceState.getString(KEY).orEmpty()
    }

    /**
     * Logcatにログを出力する。
     *
     * @param name ライフサイクル名
     */
    private fun outputLog(name: String) {
        // ログ出力
        Log.d("Test LifeCycle", "$name is Called at MainActivity")
    }

    companion object {
        const val KEY = "screenText"
    }
}