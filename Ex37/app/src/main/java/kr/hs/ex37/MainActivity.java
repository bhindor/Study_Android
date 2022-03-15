package kr.hs.ex37;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton ender3[] = new ImageButton[8];
    Integer[] ender3Ids = {R.id.ender_3_1, R.id.ender_3_2, R.id.ender_3_3, R.id.ender_3_4, R.id.ender_3_5, R.id.ender_3_6, R.id.ender_3_7, R.id.ender_3_8};
    String[] ender3Idstring = {"1", "2", "3", "4", "5", "6", "7", "8"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setTitle("삼디 프린터 관리 프로그램");

        int i=0;
        for(i=0; i<ender3Ids.length; i++){
            ender3[i] = (ImageButton) findViewById(ender3Ids[i]);
        }


        for(i=0; i<ender3Ids.length; i++){
            final int index;
            index = i;
            ender3[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), ender3_main.class);
                    intent.putExtra("name", ender3Idstring[index]);
                    startActivity(intent);
                }
            });
        }

    }
}