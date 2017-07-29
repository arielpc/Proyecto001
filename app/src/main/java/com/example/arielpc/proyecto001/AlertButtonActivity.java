package com.example.arielpc.proyecto001;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlertButtonActivity extends AppCompatActivity implements View.OnClickListener {

    private String[] actions = {"OK","Cancel"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_button);

        Button btnAlerta = (Button)findViewById(R.id.btnAlerta);
        btnAlerta.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        AlertDialog alert = new AlertDialog.Builder(this)
                .setTitle("Titulo")
                .setMessage("Mensaje")
                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i){
                        Toast.makeText(AlertButtonActivity.this, "Positive Message", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("NO", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i){
                        Toast.makeText(AlertButtonActivity.this, "Negative Message", Toast.LENGTH_SHORT).show();
                    }
                })
                /*.setNeutralButton("Cancel", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i){
                        Toast.makeText(AlertButtonActivity.this, "Neutral Message", Toast.LENGTH_SHORT).show();
                    }
                })*/
                .create();
        alert.show();
    }
}
