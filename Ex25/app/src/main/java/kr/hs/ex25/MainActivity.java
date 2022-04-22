package kr.hs.ex25;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.database.DatabaseErrorHandler;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSpecImage1 = tabHost.newTabSpec("Image1").setIndicator("사진1");
        tabSpecImage1.setContent(R.id.image1);
        tabHost.addTab(tabSpecImage1);

        TabHost.TabSpec tabSpecImage2 = tabHost.newTabSpec("Image2").setIndicator("사진2");
        tabSpecImage2.setContent(R.id.image2);
        tabHost.addTab(tabSpecImage2);

        TabHost.TabSpec tabSpecImage3 = tabHost.newTabSpec("Image3").setIndicator("사진3");
        tabSpecImage3.setContent(R.id.image3);
        tabHost.addTab(tabSpecImage3);

        TabHost.TabSpec tabSpecImage4 = tabHost.newTabSpec("Image4").setIndicator("사진4");
        tabSpecImage4.setContent(R.id.image4);
        tabHost.addTab(tabSpecImage4);

        tabHost.setCurrentTab(0);

    }
}