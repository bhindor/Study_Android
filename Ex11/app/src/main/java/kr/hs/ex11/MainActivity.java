package kr.hs.ex11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox start;
    TextView textView;
    RadioGroup rg;
    RadioButton dog, cat, rabbit;
    Button checkButton, finish_button, reset_button;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (CheckBox) findViewById(R.id.start_check);
        textView = (TextView) findViewById(R.id.textView);
        rg = (RadioGroup) findViewById(R.id.rg);
        dog = (RadioButton) findViewById(R.id.dog);
        cat = (RadioButton) findViewById(R.id.cat);
        rabbit = (RadioButton) findViewById(R.id.rabbit);
        checkButton = (Button) findViewById(R.id.checkButton);
        finish_button = (Button) findViewById(R.id.finish_button);
        reset_button = (Button) findViewById(R.id.reset_button);
        image = (ImageView) findViewById(R.id.image);

        start.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    textView.setVisibility(View.VISIBLE);
                    dog.setVisibility(View.VISIBLE);
                    cat.setVisibility(View.VISIBLE);
                    rabbit.setVisibility(View.VISIBLE);
                    checkButton.setVisibility(View.VISIBLE);
                    finish_button.setVisibility(View.VISIBLE);
                    reset_button.setVisibility(View.VISIBLE);
                    image.setVisibility(View.VISIBLE);
                }else{
                    textView.setVisibility(View.INVISIBLE);
                    dog.setVisibility(View.INVISIBLE);
                    cat.setVisibility(View.INVISIBLE);
                    rabbit.setVisibility(View.INVISIBLE);
                    checkButton.setVisibility(View.INVISIBLE);
                    finish_button.setVisibility(View.INVISIBLE);
                    reset_button.setVisibility(View.INVISIBLE);
                    image.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dog.isChecked()){
                    image.setImageResource(R.drawable.dog);
                }else if(cat.isChecked()){
                    image.setImageResource(R.drawable.cat);
                }else if(rabbit.isChecked()){
                    image.setImageResource(R.drawable.rabbit);
                }
            }
        });
        finish_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        reset_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start.setChecked(false);
                rg.clearCheck();
                image.setImageResource(0);
            }
        });
    }
}