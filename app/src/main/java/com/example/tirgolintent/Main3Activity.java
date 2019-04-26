package com.example.tirgolintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
     Intent gi = getIntent();
     int x1 = gi.getIntExtra("n",1);
    int x2 = gi.getIntExtra("nn",2);
    int x3 = gi.getIntExtra("nnn",1);
    WebView wb1;
    TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        wb1= (WebView) findViewById(R.id.webv1);
        tv2= (TextView) findViewById(R.id.tvSoul2);
    }
}
