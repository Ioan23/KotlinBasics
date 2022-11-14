//package com.xaivison.kotlinbasics
//
//import android.content.SharedPreferences
//
//inline fun SharedPreferences.edit(
//    commit: Boolean = false,
//    action: SharedPreferences.Editor.() ->Unit
//) {
//    val editor:SharedPreferences.Editor! = edit()
//    action(editor)
//    if(commit){
//        editor.commit()
//    }else {
//        editor.apply()
//    }
//}
//
//
//
//private const val KEY_TOKEN = "token"
//
//class PreferencesManager(private val preferences: SharedPreferences)
//{
//    fun saveToken(token: String){
//        preferences.edit {
//            putString(KEY_TOKEN,token)
//        }
//    }
//
//}