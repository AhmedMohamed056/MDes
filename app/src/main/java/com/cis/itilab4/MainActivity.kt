package com.cis.itilab4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main,menu)
        return super.onCreateOptionsMenu(menu)
    }
    private var i=0
    fun unheart0(view: View) {
        val unheart=findViewById<ImageView>(R.id.unheart)
        i++
        if (i%2==0){
            unheart.setImageResource(R.drawable.heart)
        }else{unheart.setImageResource(R.drawable.favorite)}

    }
    private var j=0
    fun unheart2(view: View) {
        val unheart2=findViewById<ImageView>(R.id.unheart2)
        j++
        if (j%2==0){
            unheart2.setImageResource(R.drawable.heart)
        }else{unheart2.setImageResource(R.drawable.favorite)}
    }
    private var a=0
    fun unheart3(view: View) {
        val unheart3=findViewById<ImageView>(R.id.unheart3)
        a++
        if (a%2==0){
            unheart3.setImageResource(R.drawable.heart)
        }else{unheart3.setImageResource(R.drawable.favorite)}
    }
    private var b=0
    fun unheart1(view: View) {
        b++
        val unheart1=findViewById<ImageView>(R.id.unheart1)
        if (b%2==0){
            unheart1.setImageResource(R.drawable.heart)
        }else{unheart1.setImageResource(R.drawable.favorite)}

    }
}