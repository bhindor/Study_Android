package kr.hs.ex09;

import static kr.hs.ex09.R.drawable.aa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4;
    EditText number1, number2;
    TextView textView;
    int a = 0,b = 0;
    int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setTitle("계산기");
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        number1 = (EditText) findViewById(R.id.number1);
        number2 = (EditText) findViewById(R.id.number2);
        textView = (TextView) findViewById(R.id.result);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(number1.getText().toString());
                b = Integer.parseInt(number2.getText().toString());
                result = a+b;
                textView.setText("계산 결과: " + result);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(number1.getText().toString());
                b = Integer.parseInt(number2.getText().toString());
                result = a-b;
                textView.setText("계산 결과: " + result);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(number1.getText().toString());
                b = Integer.parseInt(number2.getText().toString());
                result = a*b;
                textView.setText("계산 결과: " + result);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(number1.getText().toString());
                b = Integer.parseInt(number2.getText().toString());
                result = a/b;
                textView.setText("계산 결과: " + result);
            }
        });
    }
}