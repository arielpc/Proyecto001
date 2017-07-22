package com.example.arielpc.proyecto001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompleteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete);

        String[] data = {"Cat", "Dog", "Mouse", "Elephant", "Unicorn"};
        AutoCompleteTextView tvAutoComplete = (AutoCompleteTextView)findViewById(R.id.tvAutoComplete);
        tvAutoComplete.setAdapter(
                new ArrayAdapter<>(this,android.R.layout.select_dialog_item,data)
        );
        //number of chars to trigger lookup
        tvAutoComplete.setThreshold(1);
    }
}
