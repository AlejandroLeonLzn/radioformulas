package com.example.radioformulas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;


public class MainActivity extends AppCompatActivity {
    RadioButton rCuadrado,rRectangulo,rTriangulo,rCirculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rCuadrado = findViewById(R.id.rCuadrado);
        rRectangulo = findViewById(R.id.rRectangulo);
        rTriangulo = findViewById(R.id.rTriangulo);
        rCirculo = findViewById(R.id.rCirculo);

    }

    public void Calcular(View view){

        if(rCuadrado.isChecked()){
            Intent siguiente = new Intent(this, CuadradoActivity.class);
            startActivity(siguiente);
        } else if(rRectangulo.isChecked()){
            Intent siguiente = new Intent(this, RectanguloActivity.class);
            startActivity(siguiente);
        } else if(rTriangulo.isChecked()){
            Intent siguiente = new Intent(this, TrianguloActivity.class);
            startActivity(siguiente);
        } else if(rCirculo.isChecked()){
            Intent siguiente = new Intent(this, CirculoActivity.class);
            startActivity(siguiente);
            }
        }
    }
