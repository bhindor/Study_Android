package kr.hs.ex32;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    Button btnPrev, btnNext;
    myPictureView myPicture;
    int curNum=1;
    File[] imageFiles;
    String imageFname;
    TextView text;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("간단 이미지 뷰어");
        ActivityCompat.requestPermissions(this, new String[] {android.Manifest.permission.WRITE_EXTERNAL_STORAGE},MODE_PRIVATE);

        btnPrev = (Button) findViewById(R.id.btnPrev);
        btnNext = (Button) findViewById(R.id.btnNext);
        myPicture = (myPictureView) findViewById(R.id.myPictureView1);
        text = (TextView) findViewById(R.id.text);

        imageFiles = new File(Environment.getExternalStorageDirectory()
                .getAbsolutePath()+"/picture").listFiles();
        imageFname = imageFiles[curNum-1].toString();
        myPicture.imagePath=imageFname;
        text.setText(1+"/"+(imageFiles.length));
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (curNum <= 1){
                    curNum = imageFiles.length;
                    imageFname = imageFiles[curNum-1].toString();
                    myPicture.imagePath = imageFname;
                    text.setText(curNum+"/"+(imageFiles.length));
                    myPicture.invalidate();
                }else {
                    curNum--;
                    imageFname = imageFiles[curNum-1].toString();
                    myPicture.imagePath = imageFname;
                    text.setText(curNum+"/"+(imageFiles.length));
                    myPicture.invalidate();
                }
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curNum >= imageFiles.length){
                    curNum = 1;
                    imageFname = imageFiles[curNum-1].toString();
                    myPicture.imagePath = imageFname;
                    text.setText(curNum+"/"+(imageFiles.length));
                    myPicture.invalidate();
                }else{
                    curNum++;
                    imageFname = imageFiles[curNum-1].toString();
                    myPicture.imagePath = imageFname;
                    text.setText(curNum+"/"+(imageFiles.length));
                    myPicture.invalidate();
                }
            }
        });

    }
}