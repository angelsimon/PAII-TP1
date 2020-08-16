package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button_click(View view) {
        Intent i = new Intent(this, TP1_Ejercicio_1.class);
        startActivity(i);
    }

    public void button2_click(View view) {
        Toast.makeText(getApplicationContext(), "Ejercicio 2", Toast.LENGTH_SHORT).show();
    }
}