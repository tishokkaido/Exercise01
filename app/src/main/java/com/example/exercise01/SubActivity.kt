package com.example.exercise01

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

@Suppress("RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
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

    /**
     * Logcatにログを出力する。
     *
     * @param name ライフサイクル名
     */
    private fun outputLog(name: String) {
        // ログ出力
        Log.d("Exercise1", "$name is Called at SubActivity")
    }
}