package com.example.radioformulas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class CirculoActivity extends AppCompatActivity {
    RadioButton rc1,rc2;
    ImageView ivc;
    EditText ec1;
    TextView txtrescirculo;
    Button cambicircu,calcularc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);

        rc1 = findViewById(R.id.rc1);
        rc2 = findViewById(R.id.rc2);
        ivc = findViewById(R.id.ivc);
        ec1 = findViewById(R.id.ec1);
        txtrescirculo = findViewById(R.id.txtrescirculo);
        cambicircu = findViewById(R.id.cambicircu);
        calcularc = findViewById(R.id.calcularc);
    }
    public void colores(View view){

        if(rc1.isChecked()){
            ivc.setImageResource(R.drawable.circulo2);
            txtrescirculo.setTextColor(Color.parseColor("#FF0404"));
            ec1.setTextColor(Color.parseColor("#FF0404"));
            ec1.setHintTextColor(Color.parseColor("#FF0404"));
            cambicircu.setBackgroundColor(Color.parseColor("#FF0404"));
            calcularc.setBackgroundColor(Color.parseColor("#FF0404"));
            rc1.setTextColor(Color.parseColor("#FF0404"));
            rc2.setTextColor(Color.parseColor("#FF0404"));
        } else if(rc2.isChecked()){
            ivc.setImageResource(R.drawable.circulo3);
            txtrescirculo.setTextColor(Color.parseColor("#15FF04"));
            cambicircu.setBackgroundColor(Color.parseColor("#15FF04"));
            calcularc.setBackgroundColor(Color.parseColor("#15FF04"));
            ec1.setTextColor(Color.parseColor("#15FF04"));
            ec1.setHintTextColor(Color.parseColor("#15FF04"));
            rc1.setTextColor(Color.parseColor("#15FF04"));
            rc2.setTextColor(Color.parseColor("#15FF04"));

        }
    }   public void aypcirc(View view){
        int radio=0;
        radio = Integer.parseInt(ec1.getText().toString());
        double resultadocir=Math.pow((3.1416*radio), 2);
        txtrescirculo.setText("Area="+resultadocir);

    }
}