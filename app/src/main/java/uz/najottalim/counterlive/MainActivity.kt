package uz.najottalim.counterlive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val incrementBtn = findViewById<Button>(R.id.btn_increment)
        val decrementBtn = findViewById<Button>(R.id.btn_decrement)
        val txtCount = findViewById<TextView>(R.id.tv_count)


        incrementBtn.setOnClickListener {

            count++

            txtCount.setText(count.toString())

        }

        decrementBtn.setOnClickListener {

            count--

            txtCount.setText(count.toString())


        }


    }
}