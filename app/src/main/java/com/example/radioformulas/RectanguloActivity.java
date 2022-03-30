package com.example.radioformulas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class RectanguloActivity extends AppCompatActivity {
    RadioButton rr1,rr2,rr3;
    ImageView ivr;
    EditText edr1,edr2;
    TextView txtrec;
    Button letras,arear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);

        rr1 = findViewById(R.id.rr1);
        rr2 = findViewById(R.id.rr2);
        rr3 = findViewById(R.id.rr3);
        ivr = findViewById(R.id.ivr);
        edr1 = findViewById(R.id.edr1);
        edr2 = findViewById(R.id.edr2);
        txtrec = findViewById(R.id.txtrec);
        letras = findViewById(R.id.letras);
        arear = findViewById(R.id.arear);
    }
    public void letrasr(View view){

        if(rr1.isChecked()){
            ivr.setImageResource(R.drawable.rectangulo2);
            edr1.setTypeface(null, Typeface.BOLD);
            edr2.setTypeface(null, Typeface.BOLD);
            txtrec.setTypeface(null, Typeface.BOLD);
            letras.setTypeface(null, Typeface.BOLD);
            arear.setTypeface(null, Typeface.BOLD);
        } else if(rr2.isChecked()){
            ivr.setImageResource(R.drawable.rectangulo3);
            edr1.setTypeface(null, Typeface.ITALIC);
            edr2.setTypeface(null, Typeface.ITALIC);
            txtrec.setTypeface(null, Typeface.ITALIC);
            letras.setTypeface(null, Typeface.ITALIC);
            arear.setTypeface(null, Typeface.ITALIC);
        }else if(rr3.isChecked()){
            ivr.setImageResource(R.drawable.rectangulo1);
            edr1.setTypeface(null, Typeface.NORMAL);
            edr2.setTypeface(null, Typeface.NORMAL);
            txtrec.setTypeface(null, Typeface.NORMAL);
            letras.setTypeface(null, Typeface.NORMAL);
            arear.setTypeface(null, Typeface.NORMAL);
        }
    }   public void arearect(View view){
        int base = Integer.parseInt(edr1.getText().toString());
        int altura = Integer.parseInt(edr2.getText().toString());
        double resultadorec=(base*altura);
        txtrec.setText("Area="+resultadorec);

    }
}