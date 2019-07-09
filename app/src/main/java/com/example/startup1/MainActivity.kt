package com.example.startup1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    //Method 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*buFindMyAge.setOnClickListener{
            //Runs when button is clicked
            val yearOfBirth = YOB.text.toString().toInt()
            val curYear = Calendar.getInstance().get(Calendar.YEAR)
            val myAge = curYear - yearOfBirth
            output.text = "You are $myAge years old"
        }*/
    }

    //Method 2
    fun click(view:View){
        val yearOfBirth = YOB.text.toString().toInt()
        if (yearOfBirth<=0){
            output.text = "invalid input"
            return
        }
        val curYear = Calendar.getInstance().get(Calendar.YEAR)
        if (yearOfBirth>=curYear){
            output.text = "You can not be younger than the current year"
            return
        }
        val myAge = curYear - yearOfBirth
        output.text = "You are $myAge years old"

    }

}


