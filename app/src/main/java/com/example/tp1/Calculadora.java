package com.example.tp1;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Calculadora extends AppCompatActivity {
    private ArrayList<Button> v = new ArrayList<Button>();
    private TextView r;
    private CalcLogica cl = new CalcLogica();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        r = (TextView) findViewById(R.id.lblResultado);
        v.add((Button) findViewById(R.id.button00));
        v.add((Button) findViewById(R.id.button01));
        v.add((Button) findViewById(R.id.button02));
        v.add((Button) findViewById(R.id.button03));
        v.add((Button) findViewById(R.id.button04));
        v.add((Button) findViewById(R.id.button05));
        v.add((Button) findViewById(R.id.button06));
        v.add((Button) findViewById(R.id.button07));
        v.add((Button) findViewById(R.id.button08));
        v.add((Button) findViewById(R.id.button09));
        v.add((Button) findViewById(R.id.button_C));
        v.add((Button) findViewById(R.id.button_plus));
        v.add((Button) findViewById(R.id.button_minus));
        v.add((Button) findViewById(R.id.button_times));
        v.add((Button) findViewById(R.id.button_divide));
        v.add((Button) findViewById(R.id.button_calcular));

        v.get(0).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r.setText(cl.input("0"));
            }
        });
        v.get(1).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r.setText(cl.input("1"));
            }
        });
        v.get(2).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r.setText(cl.input("2"));
            }
        });
        v.get(3).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r.setText(cl.input("3"));
            }
        });
        v.get(4).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r.setText(cl.input("4"));
            }
        });
        v.get(5).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r.setText(cl.input("5"));
            }
        });
        v.get(6).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r.setText(cl.input("6"));
            }
        });
        v.get(7).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r.setText(cl.input("7"));
            }
        });
        v.get(8).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r.setText(cl.input("8"));
            }
        });
        v.get(9).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r.setText(cl.input("9"));
            }
        });
        v.get(10).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r.setText(cl.input("C"));
            }
        });
        v.get(11).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r.setText(cl.input("+"));
            }
        });
        v.get(12).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r.setText(cl.input("-"));
            }
        });
        v.get(13).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r.setText(cl.input("*"));
            }
        });
        v.get(14).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r.setText(cl.input("/"));
            }
        });
        v.get(15).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r.setText(cl.input("="));
            }
        });



    }
}