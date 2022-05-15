package kr.hs.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private val ImgIds : Array<Int> = arrayOf(R.id.one, R.id.two, R.id.three, R.id.four, R.id.five, R.id.six, R.id.seven, R.id.eight, R.id.nine)
    private var ImgArray = Array<ImageView?>(9) { null }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        for(i in ImgIds.indices){
            ImgArray[i] = findViewById(ImgIds[i])
        }
        for(i in ImgIds.indices){
            val index = i;

            ImgArray[index]!!.setOnClickListener {
                val intent = Intent(this, ImageinsideActivity::class.java)
                intent.putExtra("data", index.toString())
                startActivity(intent)
            }
        }



    }
}