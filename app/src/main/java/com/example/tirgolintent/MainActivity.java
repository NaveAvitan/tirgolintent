package com.example.tirgolintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
EditText a;
EditText b;
EditText c;
int numA,numB,numC;
Random rnd= new Random();
TextView tvSOUL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a= (EditText) findViewById(R.id.editTextA);
        b= (EditText) findViewById(R.id.editTextB);
        c= (EditText) findViewById(R.id.editTextC);
    }

    public void RandomNow(View view) {
        numA= rnd.nextInt(100)+1;
        numB= rnd.nextInt(100)+1;
        numC= rnd.nextInt(100)+1;

    }

    public void DoThis(View view) {
        String stA= a.getText().toString();
        numA= Integer.parseInt(stA);
        String stB= b.getText().toString();
        numB= Integer.parseInt(stB);
        String stC= c.getText().toString();
        numC= Integer.parseInt(stC);
    }
}
