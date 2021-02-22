package uz.najottalim.counterlive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countBtn = findViewById<Button>(R.id.btn_count)
        val txtCount = findViewById<TextView>(R.id.tv_count)




    }
}