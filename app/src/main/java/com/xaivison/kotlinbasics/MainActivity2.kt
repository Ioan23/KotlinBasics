package com.xaivison.kotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.coroutines.*


val TAGG = "MainActivity2"
class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        GlobalScope.launch (Dispatchers.IO ){
            Log.d(TAGG, "Start coroutine thread ${Thread.currentThread().name}")
            val answer = doNetCall()
            withContext(Dispatchers.Main){
                    val textForCorutines = findViewById<TextView>(R.id.text_For_Coroutines)
                textForCorutines.text = answer
                Log.d(TAGG, "Setting text in thread ${Thread.currentThread().name}")


            }

        }
    }

    suspend fun doNetCall(): String{
        delay(3000L)
        return "This is the answer"
    }
}