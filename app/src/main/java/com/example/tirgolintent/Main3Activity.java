package com.example.tirgolintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;




public class Main3Activity extends AppCompatActivity {
    Intent gi = getIntent();
    int x1 = gi.getIntExtra("n", 1);
    int x2 = gi.getIntExtra("nn", 2);
    int x3 = gi.getIntExtra("nnn", 1);
    WebView wb1;
    TextView tv23;
    String url2 = "https://www.google.co.il/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=" + x1 + "x%5E2%2B" + x2 + "x%2b" + x3;
    double x11 = (-x2 + Math.sqrt(x2 ^ 2 + 4 * x1 * x3)) * 0.5;
    double x12 = (-x2 - Math.sqrt(x2 ^ 2 + 4 * x1 * x3)) * 0.5;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        wb1 = (WebView) findViewById(R.id.webv1);
        tv23 = (TextView) findViewById(R.id.tvSoul2);
        wb1.setWebViewClient(new myWcl());
        wb1.getSettings().setJavaScriptEnabled(true);
        wb1.loadUrl(url2);
        tv23.setText(" youre reaults are: " + x11 + "and" + x12);

    }

    public void backPlz(View view) {
        Intent di = new Intent(this, MainActivity.class);
        di.putExtra("n", x11);
        di.putExtra("nn", x12);
        startActivity(di);
    }


    private class myWcl extends WebViewClient implements com.example.tirgolintent.myWcl {
        @Override
        public boolean shouldOverrideUrlLoading(WebView wb1, String url2) {
          wb1.loadUrl(url2);
        return true;
        }
    }
}
