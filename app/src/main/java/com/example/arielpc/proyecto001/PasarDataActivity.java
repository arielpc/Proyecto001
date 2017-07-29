package com.example.arielpc.proyecto001;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static com.example.arielpc.proyecto001.R.id.etData;

public class PasarDataActivity extends AppCompatActivity {

    private EditText etData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasar_data);

        etData = (EditText)findViewById(R.id.etData);
    }

    public void cPasarData (View view) {
        String editData = etData.getText().toString();

        Intent newIntent = new Intent (this,AutoCompleteActivity.class);
        newIntent.putExtra("boolVal",false);
        //newIntent.putExtra("stringVal","Este es el nuevo Hint");
        newIntent.putExtra("stringVal",editData);

        Bundle b = new Bundle();
        b.putString("name","texto");
        b.putString("surname","Nombre");
        b.putString("hintReal","Este deberia ser el Hint");

        newIntent.putExtra("bundleVal", b);
        startActivity(newIntent);
    }

}
