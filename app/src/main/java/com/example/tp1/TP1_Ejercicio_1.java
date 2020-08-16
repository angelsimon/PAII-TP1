package com.example.tp1;

import android.content.Context;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TP1_Ejercicio_1 extends AppCompatActivity {
    private EditText num1, num2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t_p1__ejercicio_1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);

        num1 = (EditText) findViewById(R.id.editTextNumber);
        num2 = (EditText) findViewById(R.id.editTextNumber2);
        resultado = (TextView) findViewById(R.id.textView6);

        num1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    resultado.setText("");
                }
            }
        });

        num2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    resultado.setText("");
                }
            }
        });

    }

    public void calcular(View view){

        String n1, n2, res;
        n1 = num1.getText().toString();
        n2 = num2.getText().toString();

        if(n1.isEmpty() || n2.isEmpty())
        {
            Toast.makeText(getApplicationContext(), "Debe ingresar un valor", Toast.LENGTH_SHORT).show();
            if(n1.isEmpty()){
                if(num1.requestFocus()){
                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.showSoftInput(num1, InputMethodManager.SHOW_IMPLICIT);
                }
            }
            else {
                if (num2.requestFocus()) {
                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.showSoftInput(num2, InputMethodManager.SHOW_IMPLICIT);
                }
            }
        }
        else
        {
            res = String.valueOf((Integer.parseInt(n1) + Integer.parseInt(n2)));
            resultado.setText(res);
        }

    }

    public void salir(View view){
        finish();
    }

}