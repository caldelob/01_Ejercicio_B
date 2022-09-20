package com.example.a01_introduccionaandroid_b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //Zona defición de variables de TIPO VISTA:
    private TextView tpNombre;
    private Button btnClickMain;
    private TextView tvSaludo;
    private Button btnClickReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //esta clase de tipo activity tiene control sobre el layout



        inicializarVistas();
        


    }



    private void inicializarVistas() {
        btnClickMain = findViewById(R.id.btnClickMain);
        tvSaludo = findViewById(R.id.tvSaludo);
        tpNombre = findViewById(R.id.tvNombre);
        btnClickReset= findViewById(R.id.btnClickReset);

        btnClickMain.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!tpNombre.getText().toString().equals("")){
                    tvSaludo.setText("Hola "+tpNombre.getText()+", buenos dias");
                    tpNombre.setText("");
                }
            }
        });
        btnClickReset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvSaludo.setText("");
            }
        });


    }

/*
    @Override
    protected void onStart() {
        //se ejecuta cada vez que la actividad pasa a primer plano
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //cuando una actividad se va a destruir
    }*/
}