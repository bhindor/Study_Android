package kr.hs.ex12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox one, two, three;
    Button btn, rotation_button;
    EditText text;
    ImageView image;
    int cnt = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = (CheckBox) findViewById(R.id.one);
        two = (CheckBox) findViewById(R.id.two);
        three = (CheckBox) findViewById(R.id.three);
        btn = (Button) findViewById(R.id.btn);
        rotation_button = (Button) findViewById(R.id.rotation_button);
        image = (ImageView) findViewById(R.id.image);
        text = (EditText) findViewById(R.id.text);
        image.setImageResource(R.drawable.aa);
        one.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    btn.setEnabled(true);
                }else{
                    btn.setEnabled(false);
                }
            }
        });
        two.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    btn.setClickable(true);
                }else{
                    btn.setClickable(false);
                }
            }
        });
        three.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    btn.setRotation(45);
                }else{
                    btn.setRotation(0);
                }
            }
        });
        text.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if(keyEvent.getAction()==keyEvent.ACTION_DOWN&& i == keyEvent.KEYCODE_ENTER){
                    Toast.makeText(getApplicationContext(), text.getText(), Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });
        rotation_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnt = cnt+10;
                image.setRotation(cnt);
            }
        });
    }
}