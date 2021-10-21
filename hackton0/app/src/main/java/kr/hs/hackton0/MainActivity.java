package kr.hs.hackton0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView mWebView; // 웹뷰 선언
    private WebSettings mWebSettings; //웹뷰세팅

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = (WebView) findViewById(R.id.webView);

        mWebView.setWebViewClient(new WebViewClient());
        mWebSettings = mWebView.getSettings(); //각종 환경 설정 가능여부
        mWebSettings.setJavaScriptEnabled(true); // 자바스크립트 허용여부
        mWebSettings.setSupportMultipleWindows(false); // 윈도우 여러개 사용여부
        mWebSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN); // 컨텐츠사이즈 맞추기
        mWebSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK); // 캐시 허용 여부
        mWebSettings.setUseWideViewPort(true); // wide viewport 사용 여부
        mWebSettings.setSupportZoom(true); // Zoom사용여부
        mWebSettings.setJavaScriptCanOpenWindowsAutomatically(false); // 자바스크립트가 window.open()사용할수있는지 여부
        mWebSettings.setLoadWithOverviewMode(true); // 메타태그 허용 여부
        mWebSettings.setBuiltInZoomControls(false); // 화면 확대 축소 허용 여부
        mWebSettings.setDomStorageEnabled(true); // 로컬저장소 허용 여부
        mWebView.loadUrl("https://www.naver.com/"); // 웹뷰 사이트 주소 및 시작

    }
    @Override
    public void onBackPressed() {
        if(mWebView.canGoBack()){
            mWebView.goBack();
        }else{
            super.onBackPressed();
        }
    }
}