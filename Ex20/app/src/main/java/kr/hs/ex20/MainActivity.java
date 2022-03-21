package kr.hs.ex20;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    EditText text;
    ImageView Image;
    String num1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText) findViewById(R.id.text);
        Image = (ImageView) findViewById(R.id.Image);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                num1 = text.getText().toString();
                Image.setRotation(Integer.parseInt(num1));
                return true;
            case R.id.item2:
                Image.setImageResource(R.drawable.a);
                item.setChecked(true);
                return true;
            case R.id.item3:
                Image.setImageResource(R.drawable.b);
                item.setChecked(true);
                return true;
            case R.id.item4:
                Image.setImageResource(R.drawable.c);
                item.setChecked(true);
                return true;
        }
        return false;
    }
}