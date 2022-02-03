package kr.hs.ex10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox android, iphone, window;
    Switch one, two;
    EditText text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android = (CheckBox) findViewById(R.id.android);
        iphone = (CheckBox) findViewById(R.id.iphone);
        window = (CheckBox) findViewById(R.id.window);
        one = (Switch) findViewById(R.id.one);
        two = (Switch) findViewById(R.id.two);
        text1 = (EditText) findViewById(R.id.text1);
        text2 = (EditText) findViewById(R.id.text2);

        android.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Toast.makeText(getApplicationContext(), "안드 체크", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "안드 해제", Toast.LENGTH_SHORT).show();
                }
            }
        });
        iphone.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Toast.makeText(getApplicationContext(), "아이폰 체크", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "아이폰 해제", Toast.LENGTH_SHORT).show();
                }
            }
        });
        window.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Toast.makeText(getApplicationContext(), "윈도우 체크", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "윈도우 해제", Toast.LENGTH_SHORT).show();
                }
            }
        });
        one.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    text1.setText("스위치1 : on");
                }else{
                    text1.setText("스위치1 : off");
                }
            }
        });
        two.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    text2.setText("스위치2 : on");
                }else{
                    text2.setText("스위치2 : off");
                }
            }
        });

    }
}