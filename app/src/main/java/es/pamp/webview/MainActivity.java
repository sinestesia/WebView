package es.pamp.webview;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView myWebView = (WebView) this.findViewById(R.id.webView);
        myWebView.addJavascriptInterface(new WebAppInterface(this), "Android");
        WebSettings mySettings = myWebView.getSettings();
        mySettings.setJavaScriptEnabled(true);

        //myWebView.loadUrl("https://meneame.net");
        myWebView.loadUrl("file:///android_asset/miweb.html");


    }
}


