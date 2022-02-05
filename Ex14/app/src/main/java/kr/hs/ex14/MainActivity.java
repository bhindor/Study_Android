package kr.hs.ex14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button  btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn_add, btn_minus, btn_mult, btn_divide,btn_reset;
    TextView TextResult;
    String num1, num2;
    Integer result;
    Button[] numButtons = new Button[10];
    Integer[] numBtnIDs = {R.id.btn0, R.id.btn1, R.id.btn2,R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9};
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("계산기");
        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);
        btn_add = (Button) findViewById(R.id.btn_add);
        btn_minus = (Button) findViewById(R.id.btn_minus);
        btn_mult = (Button) findViewById(R.id.btn_mult);
        btn_reset = (Button) findViewById(R.id.btn_reset);
        btn_divide = (Button) findViewById(R.id.btn_divide);
        TextResult = (TextView) findViewById(R.id.TextResult);

        btn_add.setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View arg0, MotionEvent arg1){
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Integer.parseInt(num1)+Integer.parseInt(num2);
                    TextResult.setText("계산 결과 : " + result.toString());
                    return false;
                }
        });
        btn_minus.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1){
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Integer.parseInt(num1)-Integer.parseInt(num2);
                TextResult.setText("계산 결과 : " + result.toString());
                return false;
            }
        });
        btn_mult.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1){
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Integer.parseInt(num1)*Integer.parseInt(num2);
                TextResult.setText("계산 결과 : " + result.toString());
                return false;
            }
        });
        btn_divide.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1){
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Integer.parseInt(num1)/Integer.parseInt(num2);
                TextResult.setText("계산 결과 : " + result.toString());
                return false;
            }
        });
        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(" ");
                edit2.setText(" ");
            }
        });
        for(i=0;i<numBtnIDs.length; i++){
            numButtons[i] = (Button) findViewById(numBtnIDs[i]);
        }
        for(i=0;i<numBtnIDs.length;i++){
            final int index;
            index = i;

            numButtons[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(edit1.isFocused() == true){
                        num1 = edit1.getText().toString()
                        + numButtons[index].getText().toString();
                        edit1.setText(num1);
                    }else if(edit2.isFocused() == true){
                        num2 = edit2.getText().toString()
                                + numButtons[index].getText().toString();
                        edit2.setText(num2);
                    }else{
                        Toast.makeText(getApplicationContext(), "먼저 에디트 텍스트를 선택하세요", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

    }
}