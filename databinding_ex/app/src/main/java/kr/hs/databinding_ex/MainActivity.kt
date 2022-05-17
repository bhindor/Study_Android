package kr.hs.databinding_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import kr.hs.databinding_ex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding  : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //1번 방식 - findViewByID
        val btn: Button = findViewById(R.id.testBtnId)
        btn.setOnClickListener {
            Toast.makeText(this, "test", Toast.LENGTH_SHORT).show()
        }

        // Databinding
        binding.testBtnId.setOnClickListener {
            Toast.makeText(this, "click", Toast.LENGTH_SHORT).show()
        }


    }
}