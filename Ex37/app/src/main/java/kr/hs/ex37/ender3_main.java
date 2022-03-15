package kr.hs.ex37;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class ender3_main extends AppCompatActivity {
    Switch use, fix;
    Button btn_check;
    int use_cnt = 0, fix_cnt = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ender3_activity);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setTitle("ender-3");

        String[] ender3Idstring = {"R.id.ender_3_1", "R.id.ender_3_2", "R.id.ender_3_3", "R.id.ender_3_4", "R.id.ender_3_5", "R.id.ender_3_6", "R.id.ender_3_7", "R.id.ender_3_8"};
        int i=0, result = 0;

        use = (Switch) findViewById(R.id.use_switch);
        fix = (Switch) findViewById(R.id.break_switch);
        btn_check = (Button) findViewById(R.id.btn_check);
        LinearLayout ender3_background = (LinearLayout) findViewById(R.id.ender3_background);
        TextView text = (TextView) findViewById(R.id.text);
        TextView tv_print = (TextView) findViewById(R.id.tv_print);
        Intent intent = getIntent();
        String n = intent.getStringExtra("name");
        tv_print.setText("Ender3-"+n);//n에 무슨값 넘어오는지 알기위해 적은문장;



        btn_check.setBackgroundColor(Color.RED);


        use.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(use.isChecked()){
                    btn_check.setBackgroundColor(Color.GREEN);
                    Toast.makeText(getApplicationContext(), "사용중", Toast.LENGTH_SHORT).show();
                }else{
                    btn_check.setBackgroundColor(Color.RED);
                    Toast.makeText(getApplicationContext(), "사용끝", Toast.LENGTH_SHORT).show();
                }
            }
        });
        fix.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(fix.isChecked()){
                    ender3_background.setBackgroundColor(Color.RED);
                }else{
                    ender3_background.setBackgroundResource(R.drawable.btn_yellow);
                }
            }
        });

    }
}
