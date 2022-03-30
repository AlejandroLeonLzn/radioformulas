package com.example.radioformulas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class CuadradoActivity extends AppCompatActivity {
    RadioButton r1,r2,r3;
    ImageView ivc;
    EditText etc1;
    TextView txtresultadoc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);

        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        r3 = findViewById(R.id.r3);
        ivc = findViewById(R.id.ivc);
        etc1 = findViewById(R.id.etc1);
        txtresultadoc = findViewById(R.id.txtresultadoc);
    }
    public void tam(View view){
        int ancho = 800;
        int alto = 800;
        int sizeF = 20;
        if(r1.isChecked()){
           ancho = 200;
           alto = 200;
           sizeF = 10;
        } else if(r2.isChecked()){
            ancho = 400;
            alto = 400;
            sizeF = 20;
        }else if(r3.isChecked()){
            ancho = 800;
            alto = 800;
            sizeF = 40;
        }
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(ancho, alto);
        ivc.setLayoutParams(params);
        txtresultadoc.setTextSize(sizeF);
        int areac;
        int lado = Integer.parseInt(etc1.getText().toString());
        areac=(lado*lado);
        txtresultadoc.setText("Area="+areac);
    }

}