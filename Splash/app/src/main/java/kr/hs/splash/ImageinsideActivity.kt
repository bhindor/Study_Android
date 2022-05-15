package kr.hs.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class ImageinsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imageinside)
        val ImgIds : Array<Int> = arrayOf(R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five,
            R.drawable.six, R.drawable.seven, R.drawable.eight, R.drawable.nine)
        val getdata = intent.getStringExtra("data")
        val img = findViewById<ImageView>(R.id.img)

        /*when(getdata){
            "0" -> img.setImageResource(R.drawable.one)
            "1" -> img.setImageResource(R.drawable.two)
            "2" -> img.setImageResource(R.drawable.three)
            "3" -> img.setImageResource(R.drawable.four)
            "4" -> img.setImageResource(R.drawable.five)
            "5" -> img.setImageResource(R.drawable.six)
            "6" -> img.setImageResource(R.drawable.seven)
            "7" -> img.setImageResource(R.drawable.eight)
            "8" -> img.setImageResource(R.drawable.nine)
        }*/
        if (getdata != null) {
            img.setImageResource(ImgIds[getdata.toInt()])
        }
    }
}