package com.tbbass.ir;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;

public class IRListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView wv = new WebView(this);
        wv.loadUrl("https://tb-ir-bass.netlify.app/client.html");
        setContentView(wv);
    }
}
