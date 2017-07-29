package com.example.arielpc.proyecto001;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class AutoCompleteActivity extends AppCompatActivity {

    private TextView tvOtro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete);

        tvOtro = (TextView)findViewById(R.id.tvOtro);

        String[] data = {"Cat", "Dog", "Mouse", "Elephant", "Unicorn"};
        AutoCompleteTextView tvAutoComplete = (AutoCompleteTextView)findViewById(R.id.tvAutoComplete);
        tvAutoComplete.setAdapter(
                new ArrayAdapter<>(this,android.R.layout.select_dialog_item,data)
        );
        //number of chars to trigger lookup
        tvAutoComplete.setThreshold(1);

        //Recibiendo Datos de otra Actividad
        Intent recibirIntent = getIntent();
        String value = recibirIntent.getStringExtra("stringVal");
        Bundle bundle = recibirIntent.getBundleExtra("bundleVal");

        tvAutoComplete.setHint(value);
        String otroValor = tvOtro.getText().toString() + bundle.getString("name");
        tvOtro.setText(otroValor);

    }
}
