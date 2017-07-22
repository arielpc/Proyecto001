package com.example.arielpc.proyecto001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {

    private EditText etValor1;
    private EditText etValor2;
    private TextView tvResultado;
    private RadioButton rdSumar, rdMultiplicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        etValor1=(EditText)findViewById(R.id.etValor1);
        etValor2=(EditText)findViewById(R.id.etValor2);
        rdSumar=(RadioButton)findViewById(R.id.rdSumar);
        rdMultiplicar=(RadioButton)findViewById(R.id.rdMultiplicar);
        tvResultado=(TextView)findViewById(R.id.tvResultado);
    }

    //Metodo para Operar
    public void bOperar(View view) {

        //comprobando si un campo esta vacio
        if (etValor1.getText().toString().matches("")) {
            Toast notificar = Toast.makeText(this,"El primer campo esta vacio",Toast.LENGTH_SHORT);
            notificar.show();
            return;
        }

        //otra forma si un campo esta vacio
        if (etValor2.getText().toString().isEmpty()) {
            etValor2.setText("0");
        }

        int nro1 = Integer.valueOf(etValor1.getText().toString());
        int nro2 = Integer.valueOf(etValor2.getText().toString());
        int suma = nro1 + nro2;
        int mult = nro1 * nro2;
        String resultado = null;

        if (rdSumar.isChecked() == true) {
            resultado = String.valueOf(suma);
        } else
            if (rdMultiplicar.isChecked() == true) {
                resultado = String.valueOf(mult);
            }

        tvResultado.setText(resultado);
    }

}
