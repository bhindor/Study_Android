package kr.hs.ex13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton btn1, btn2, btn3, btn4, btn5, btn6;
    EditText text;
    Button result, reset, finish;
    int cnt1=0, cnt2=0, cnt3=0, cnt4=0, cnt5=0, cnt6=0;
    int n = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("투표앱");
        btn1 = (ImageButton) findViewById(R.id.btn1);
        btn2 = (ImageButton) findViewById(R.id.btn2);
        btn3 = (ImageButton) findViewById(R.id.btn3);
        btn4 = (ImageButton) findViewById(R.id.btn4);
        btn5 = (ImageButton) findViewById(R.id.btn5);
        btn6 = (ImageButton) findViewById(R.id.btn6);
        text = (EditText) findViewById(R.id.text);
        result = (Button) findViewById(R.id.result);
        reset = (Button) findViewById(R.id.reset);
        finish = (Button) findViewById(R.id.finish);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnt1++;
                Toast.makeText(getApplicationContext(), "1번 후보에게 투표했습니다", Toast.LENGTH_SHORT).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnt2++;
                Toast.makeText(getApplicationContext(), "2번 후보에게 투표했습니다", Toast.LENGTH_SHORT).show();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnt3++;
                Toast.makeText(getApplicationContext(), "3번 후보에게 투표했습니다", Toast.LENGTH_SHORT).show();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnt4++;
                Toast.makeText(getApplicationContext(), "4번 후보에게 투표했습니다", Toast.LENGTH_SHORT).show();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnt5++;
                Toast.makeText(getApplicationContext(), "5번 후보에게 투표했습니다", Toast.LENGTH_SHORT).show();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnt6++;
                Toast.makeText(getApplicationContext(), "6번 후보에게 투표했습니다", Toast.LENGTH_SHORT).show();
            }
        });
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cnt1>=cnt2&&cnt1>=cnt3&&cnt1>=cnt4&&cnt1>=cnt5&&cnt1>=cnt6){
                    text.setText("당선: 기호1번 "+cnt1+"표");
                }else if(cnt2>=cnt1&&cnt2>=cnt3&&cnt2>=cnt4&&cnt2>=cnt5&&cnt2>=cnt6){
                    text.setText("당선: 기호2번"+cnt2+"표");
                }else if(cnt3>=cnt1&&cnt3>=cnt2&&cnt3>=cnt4&&cnt3>=cnt4&&cnt3>=cnt6){
                    text.setText("당선: 기호3번"+cnt3+"표");
                }else if(cnt4>=cnt1&&cnt4>=cnt2&&cnt4>=cnt3&&cnt4>=cnt5&&cnt4>=cnt6){
                    text.setText("당선: 기호4번"+cnt4+"표");
                }else if(cnt5>=cnt1&&cnt5>=cnt2&&cnt5>=cnt3&&cnt5>=cnt4&&cnt5>=cnt6){
                    text.setText("당선: 기호5번"+cnt5+"표");
                }else if(cnt6>=cnt1&&cnt6>=cnt2&&cnt6>=cnt3&&cnt6>=cnt4&&cnt6>=cnt5){
                    text.setText("당선: 기호6번"+cnt6+"표");
                }
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText("");
                cnt1=0;
                cnt2=0;
                cnt3=0;
                cnt4=0;
                cnt5=0;
                cnt6=0;
            }
        });
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}