package com.verifycharacter.ca

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btVerify.setOnClickListener{ verifyIfExists() }
    }


    fun verifyIfExists(){
        var text = edText.text.toString()
        var character = edCharacter.text.toString()

        if(text.contains(character)){
            Log.i("TAG", "YES")
        }else{
            Log.i("TAG", "NO")
        }

        val count = text.filter { character.contains(it) }.length

        Log.i("TAG", "$count")

        tvResult.text = "The character '$character' appears $count times in the phrase"
        tvResult.visibility = View.VISIBLE
    }
}
