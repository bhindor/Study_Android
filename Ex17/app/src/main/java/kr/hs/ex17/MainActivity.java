package kr.hs.ex17;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {
    EditText text;
    TextView result;
    Button btn_add, btn_sub, btn_div, btn_mul, btn_dot;
    String num1;
    Button[] numButtons = new Button[10];
    Integer[] numBtnIDs = {R.id.btn0, R.id.btn1, R.id.btn2,R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9};
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText) findViewById(R.id.text);
        result = (TextView) findViewById(R.id.result);
        btn_add = (Button) findViewById(R.id.btn_add);
        btn_mul = (Button) findViewById(R.id.btn_mul);
        btn_div = (Button) findViewById(R.id.btn_div);
        btn_sub = (Button) findViewById(R.id.btn_sub);
        btn_dot = (Button) findViewById(R.id.btn_dot);

        for(i=0;i<numBtnIDs.length; i++){
            numButtons[i] = (Button) findViewById(numBtnIDs[i]);
        }
        for(i=0;i<numBtnIDs.length;i++){
            final int index;
            index = i;

            numButtons[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (text.isFocused() == true) {
                        num1 = text.getText().toString()
                                + numButtons[index].getText().toString();
                        text.setText(num1);
                    } else {
                        Toast.makeText(getApplicationContext(), "먼저 에디트 텍스트를 선택하세요", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text.isFocused() == true){
                    num1 = text.getText().toString() + btn_add.getText().toString();
                    text.setText(num1);
                }
            }
        });
        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text.isFocused() == true){
                    num1 = text.getText().toString() + btn_mul.getText().toString();
                    text.setText(num1);
                }
            }
        });
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text.isFocused() == true){
                    num1 = text.getText().toString() + btn_div.getText().toString();
                    text.setText(num1);
                }
            }
        });
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text.isFocused() == true){
                    num1 = text.getText().toString() + btn_sub.getText().toString();
                    text.setText(num1);
                }
            }
        });
        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text.isFocused() == true){
                    num1 = text.getText().toString() + btn_dot.getText().toString();
                    text.setText(num1);
                }
            }
        });

        Button btn_result = (Button) findViewById(R.id.btn_result);
        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = text.getText().toString();
                StringTokenizer st = new StringTokenizer(str, "+-*/");
                Double left = Double.parseDouble(st.nextToken());
                Double right = Double.parseDouble(st.nextToken());

                Double results=0.0;
                if(str.contains("+")){
                    results = left+right;
                }else if(str.contains("-")){
                    results = left-right;
                }else if(str.contains("*")){
                    results = left*right;
                }else if(str.contains("/")){
                    results = left/right;
                }
                result.setText(results.toString());
            }
        });
    }
}
