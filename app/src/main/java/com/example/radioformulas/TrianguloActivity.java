package com.example.radioformulas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class TrianguloActivity extends AppCompatActivity {
    RadioButton rt1,rt2,rt3,rt4,rt5;
    ImageView ivt;
    EditText et1, et2;
    TextView txtresultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);

        rt1 = findViewById(R.id.rt1);
        rt2 = findViewById(R.id.rt2);
        rt3 = findViewById(R.id.rt3);
        rt4 = findViewById(R.id.rt4);
        rt5 = findViewById(R.id.rt5);
        ivt = findViewById(R.id.ivt);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        txtresultado = findViewById(R.id.txtresultado);
    }

    public void cambiotriangulo(View view){

        if(rt1.isChecked()){
            ivt.setBackgroundResource(R.drawable.triangulo1);
        } else if(rt2.isChecked()){
            ivt.setBackgroundResource(R.drawable.triangulo3);
        }else if(rt3.isChecked()){
            ivt.setBackgroundResource(R.drawable.triangulo4);
        }else if(rt4.isChecked()){
            ivt.setBackgroundResource(R.drawable.triangulo5);
        }else if(rt5.isChecked()){
            ivt.setBackgroundResource(R.drawable.triangulo6);
        }
    }   public void operacion(View view){

        int altura = Integer.parseInt(et1.getText().toString());
        int base = Integer.parseInt(et2.getText().toString());
        int resultado=((altura*base)/2);
        txtresultado.setText("Area="+resultado);

    }

}