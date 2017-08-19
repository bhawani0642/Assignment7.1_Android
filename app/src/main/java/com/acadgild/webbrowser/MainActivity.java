package com.acadgild.webbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// using findviewById to bring the edittext from xml to java
editText=(EditText)findViewById(R.id.editText3);
    }
// Method is triggered when button is clicked
    public  void ClickToOpen(View view){

        WebView webView= (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        editText.findViewById(R.id.editText3);
        webView.loadUrl("https://www."+editText.getText().toString());

    }
}
