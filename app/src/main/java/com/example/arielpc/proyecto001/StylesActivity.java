package com.example.arielpc.proyecto001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class StylesActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_styles);

        mEditText = (EditText)findViewById(R.id.etStyles);
        findViewById(R.id.btnStyles).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast Notificar = Toast.makeText(this,mEditText.getText(),Toast.LENGTH_SHORT);
        //Notificar.setGravity(Gravity.TOP,Gravity.TOP,Gravity.TOP); ///Para mover la notificacion
        Notificar.show();  //mostrar la notificacion
    }
}
