package kr.hs.val_log

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var value = "여기는 value입니다!"
        val value2 = "여기는 value2입니다!"

        value = "여기는 value가 아닙니다"

        Log.d("test", "testLog")
        Log.d("value2", value2)

//        Log.e("test", "testLog") //오류
//        Log.w("test", "testLog") //경고
//        Log.i("test", "testLog") //정보
//        Log.d("test", "testLog") //디버그
//        Log.v("test", "testLog") //상세

    }
}