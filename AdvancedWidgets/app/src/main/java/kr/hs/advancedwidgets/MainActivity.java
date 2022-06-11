package kr.hs.advancedwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {
    Chronometer chronometer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chronometer = findViewById(R.id.chronometer);

        Button start = findViewById(R.id.start_btn);
        Button end = findViewById(R.id.end_btn);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer.setBase(SystemClock.elapsedRealtime());
                chronometer.start();
                chronometer.setTextColor(Color.RED);
                start.setVisibility(View.INVISIBLE);
                end.setVisibility(View.VISIBLE);
                end.setBackgroundColor(Color.RED);
            }
        });
        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer.stop();
                chronometer.setTextColor(Color.BLUE);
                end.setVisibility(View.INVISIBLE);
                start.setVisibility(View.VISIBLE);
            }
        });
    }
}