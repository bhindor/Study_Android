package kr.hs.check;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    RadioGroup rg;
    RadioButton male, female;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btn);
        rg = (RadioGroup) findViewById(R.id.rg);
        male = (RadioButton) findViewById(R.id.male);
        female = (RadioButton) findViewById(R.id.female);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(male.isChecked()){
                    Toast.makeText(getApplicationContext(), male.getText(), Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), female.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}