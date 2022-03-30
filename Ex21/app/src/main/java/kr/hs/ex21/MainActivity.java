package kr.hs.ex21;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2;
    LinearLayout base;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        registerForContextMenu(btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        registerForContextMenu(btn2);
        base = (LinearLayout) findViewById(R.id.base);
    }
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);

        if(v == btn1){
            menu.add(0,1,0, "배경색(빨강)");
            menu.add(0,2,0, "배경색(노랑)");
            menu.add(0,3,0, "배경색(초록)");
        }
        if(v == btn2){
            menu.add(0,4,0, "버튼 회전");
            menu.add(0,5,0, "버튼 늘리기");
        }
    }
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                base.setBackgroundColor(Color.RED);
                return true;
            case 2:
                base.setBackgroundColor(Color.YELLOW);
                return true;
            case 3:
                base.setBackgroundColor(Color.GREEN);
                return true;
            case 4:
                btn2.setRotation(45);
                return true;
            case 5:
                btn2.setScaleX(200);
                return true;
        }
        return false;
    }
}