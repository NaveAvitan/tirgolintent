package com.example.tirgolintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
EditText a;
EditText b;
EditText c;
double numA,numB,numC;
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
        a.setText(rnd.nextInt(100)+1+rnd.nextDouble()+"");
        b.setText(rnd.nextInt(100)+1+rnd.nextDouble()+"");
        c.setText(rnd.nextInt(100)+1+rnd.nextDouble()+"");
    }

    public void DoThis(View view) {
        String stA= a.getText().toString();
        numA= Double.parseDouble(stA);
        String stB= b.getText().toString();
        numB= Double.parseDouble(stB);
        String stC= c.getText().toString();
        numC= Double.parseDouble(stC);
        if ((stA.equals(""))||(stB.equals("")) || (stC.equals(""))|| ( stA.equals("-")) || ( stB.equals("-")) || ( stC.equals("-")) || ( stA.equals(".")) || ( stB.equals(".")) || ( stC.equals(".")) || ( stA.equals("+")) || ( stB.equals("+")) || ( stC.equals("+")) ){
            Toast.makeText( this,"do this good or dont do this at all",Toast.LENGTH_SHORT).show(); }
            else {
        Intent gi= new Intent(this,Main3Activity.class);
        gi.putExtra("n", numA);
        gi.putExtra("nn", numB);
        gi.putExtra("nnn", numC);
        startActivityForResult(gi,1);


    } }

    public void doplz(View view) {
        Intent ti = getIntent();
        int x1 = ti.getIntExtra("n",1);
        int x2 = ti.getIntExtra("nn",2);
        if ((x1 != 0)&&( x2 != 0)){
        tvSOUL.setText(" youre reaults are: "+ x1 +"and" +x2);
    }
    else {
        tvSOUL.setText("we still dont have a soulotion");
        }
} }
