//package com.xaivison.kotlinbasics
//
//import android.annotation.SuppressLint
//import android.icu.lang.UCharacter.JoiningGroup.TAH
//import android.os.Bundle
//import android.util.Log
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material.MaterialTheme
//import androidx.compose.material.Surface
//import androidx.compose.material.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import com.xaivison.kotlinbasics.ui.theme.KotlinBasicsTheme
//import kotlinx.coroutines.*
//
//val TAG = "MainActivity"
//
//class MainActivity : ComponentActivity() {
//    @SuppressLint("CoroutineCreationDuringComposition")
//    @OptIn(DelicateCoroutinesApi::class, ObsoleteCoroutinesApi::class)
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            KotlinBasicsTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background
//                ) {
//
//
//                    // ex: complex calculation to not block the main thread
//                    val job = GlobalScope.launch(Dispatchers.Default) {
////                        Log.d(TAG, "Start calculation")
//                        val doNetCall = doNetworkCall()
//                        val doNetCall2 = doNetworkCall2()
//
//                    // used for change UI for main Thread
//                        val job2 = GlobalScope.launch { Dispatchers.Main }
//
//                        // .....
//                        val job3 = GlobalScope.launch { Dispatchers.Unconfined }
//
//                        // make networking, writing in database or reading and writing to files
//                        val job4 = GlobalScope.launch { Dispatchers.IO }
//
//
//
//
//                        val job5 = GlobalScope.launch { newSingleThreadContext("MyThread") }
//
////                        Log.d(TAG, "global scope of coroutines ${Thread.currentThread().name}")
//                        Log.d(TAG, doNetCall)
//                        Log.d(TAG, doNetCall2)
//
//
//
//
//
////                        for (i in 30..50) {
////
////                            if(isActive){
////                                Log.d(TAG, "Result for i=$i:${fib(i)}")
////                            }
////
////                        }
////                        Log.d(TAG, "Ending calculation")
////                        Log.d(TAG, "Helo from thred ${Thread.currentThread().name}")
//                    }
////                    runBlocking {
////
////
////                        delay(2000L)
////                        job.cancel()
////                            Log.d(TAG,"Cancel job")
////
////                    }
//
//
//                    GlobalScope.launch(Dispatchers.IO) {
//                        Log.d(TAG,"Start coroutine ${Thread.currentThread().name}")
//
//                        val doAnswer = doNetworkCall()
//                        withContext(Dispatchers.Main){
//                            Log.d(TAG,"Set Text ${Thread.currentThread().name}")
//
//                        }
//                    }
//
//                    Greeting("Android")
//                }
//            }
//        }
//    }
//
////    private fun fib(n: Int): Long {
////       return if(n==0) 0
////        else if (n==1) 1
////        else fib(n-1)+ fib(n-2)
////    }
////    private fun fib(n: Int): Long {
////        return when (n) {
////            0 -> 0
////            1 -> 1
////            else -> fib(n-1)+ fib(n-2)
////        }
////    }
//
//
//    suspend fun doNetworkCall():String{
//        delay(1000L)
//        return "networkResponse1"
//    }
//
//    suspend fun doNetworkCall2():String{
//        delay(5000L)
//        return "networkResponse2"
//    }
//}
//
//
//
//
//
//
//@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name!")
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    KotlinBasicsTheme {
//        Greeting("Android")
//    }
//}