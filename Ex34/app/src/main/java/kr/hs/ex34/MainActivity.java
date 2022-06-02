package kr.hs.ex34;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.utils.widget.ImageFilterButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageButton[] imagebuttons = new ImageButton[9];
    Integer[] imagebuttonIds = {R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9};
    final String imgName[] = {"독서하는 소녀", "꽃장식 모자 소녀", "부채를 든 소녀", "이레느깡 단 베르양",
            "잠자는 소녀", "테라스의 두 자매", "피아노 레슨", "피아노 앞의 소녀들", "해변에서"};
    Button btn_result, reset_btn;

    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_result = (Button) findViewById(R.id.btn_result);
        reset_btn = (Button) findViewById(R.id.reset_btn);
        setTitle("명화 선호도 투표");
        final int[] cnt = new int[9];
        for(i=0; i<9; i++)
            cnt[i] = 0;

        for(i=0; i<imagebuttonIds.length; i++){
            final int index;
            index = i;

            imagebuttons[index] = (ImageButton) findViewById(imagebuttonIds[i]);
            imagebuttons[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    cnt[index]++;
                    Toast.makeText(getApplicationContext(), imgName[index] + ": 총 " + cnt[index] + " 표", Toast.LENGTH_SHORT).show();
                }
            });
        }
//        reset_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                for(i=0; i<9; i++)
//                    cnt[i] = 0;
//            }
//        });
        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("VoteCount", cnt);
                intent.putExtra("ImageName", imgName);
                startActivity(intent);
            }
        });


    }
}