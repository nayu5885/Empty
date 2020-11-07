package app.asahi.nayu.empty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var str = "Hell"
    var str2 = "Heven"
    var count = 0
    var a = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)


        if(count < 20){
            button.setOnClickListener {
                for (i in 0..20){
                    a++
                    textView.text=(i.toString())
                }
            }
        }
        else{
            button.setOnClickListener {
                textView.text=str2
            }
        }

    }

    }


