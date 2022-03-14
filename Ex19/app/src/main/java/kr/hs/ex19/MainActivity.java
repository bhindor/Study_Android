package kr.hs.ex19;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout base;
    Button btn1;
    int cnt = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        base = (LinearLayout) findViewById(R.id.base);
        btn1 = (Button) findViewById(R.id.btn1);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0,1,0, "배경색(빨강)");
        menu.add(0,2,0, "배경색(초록)");
        menu.add(0,3,0, "배경색(노랑)");

        SubMenu sMenu = menu.addSubMenu("버튼 변경 >>");
        sMenu.add(0,4,0, "버튼 45도 변경");
        sMenu.add(0,5,0, "버튼 2배 확대");
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case 1:
                base.setBackgroundColor(Color.RED);
                return true;
            case 2:
                base.setBackgroundColor(Color.GREEN);
                return true;
            case 3:
                base.setBackgroundColor(Color.YELLOW);
                return true;
            case 4:
                btn1.setRotation(45);
                return true;
            case 5:
                cnt = cnt*2;
                btn1.setScaleX(cnt);
                return true;
        }
        return false;
    }
}