package com.example.arielpc.proyecto001;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class BoxexActivity extends AppCompatActivity implements View.OnClickListener{

    private CheckBox cbUno;
    private ToggleButton tbUno;
    private RadioGroup my_radio_group;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boxex);

        cbUno = (CheckBox)findViewById(R.id.cbUno);
        tbUno = (ToggleButton)findViewById(R.id.tbUno);
        my_radio_group = (RadioGroup)findViewById(R.id.my_radio_group);
        findViewById(R.id.btnCheckbox).setOnClickListener(this);
    }

    @Override
    public void onClick (View view) {
        String checkUno = "El check box esta: " + String.valueOf(cbUno.isChecked());
        String toogleUno = "\n El Toggle esta: " + String.valueOf(tbUno.isChecked());
        RadioButton selected = (RadioButton)findViewById(my_radio_group.getCheckedRadioButtonId());
        String radioUno;

        if (selected != null) {
            //Toast.makeText(this,"Selected: "+selected.getText(),Toast.LENGTH_SHORT).show();
            radioUno = "\n El radiobutton seleccionado es: "+selected.getText();
        } else {
            //Toast.makeText(this,"Please select an animal",Toast.LENGTH_SHORT).show();
            radioUno = "\n Please select an animal";
        }

        String concatenar = checkUno + toogleUno + radioUno;

        //Toast.makeText(this,cbUno.isChecked() ? "Checked" : "Not Checked", Toast.LENGTH_SHORT).show();
        Toast.makeText(this,concatenar, Toast.LENGTH_LONG).show();
    }
}
