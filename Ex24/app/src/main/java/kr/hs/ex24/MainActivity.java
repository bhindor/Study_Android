package kr.hs.ex24;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TabHost;

import com.google.android.material.tabs.TabLayout;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    LinearLayout song, artist, album;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        song = (LinearLayout) findViewById(R.id.tabSong);
        artist = (LinearLayout) findViewById(R.id.tabArtist);
        album = (LinearLayout) findViewById(R.id.tabAlbum);

        song.setBackgroundColor(Color.RED);
        artist.setBackgroundColor(Color.YELLOW);
        album.setBackgroundColor(Color.BLUE);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSpecSong = tabHost.newTabSpec("SONG").setIndicator("음악별");
        tabSpecSong.setContent(R.id.tabSong);
        tabHost.addTab(tabSpecSong);

        TabHost.TabSpec tabSpecArtist = tabHost.newTabSpec("ARTIST").setIndicator("가수별");
        tabSpecArtist.setContent(R.id.tabArtist);
        tabHost.addTab(tabSpecArtist);

        TabHost.TabSpec tabSpecAlbum = tabHost.newTabSpec("ALBUM").setIndicator("앨범별");
        tabSpecAlbum.setContent(R.id.tabAlbum);
        tabHost.addTab(tabSpecAlbum);

        tabHost.setCurrentTab(0);
    }

}