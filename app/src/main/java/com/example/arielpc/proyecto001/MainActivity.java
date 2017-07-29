package com.example.arielpc.proyecto001;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cCalc(View view) {
        Intent i = new Intent(this, Calculator.class);
        startActivity(i);
    }

    public void cLinearLayoutVertical(View view) {
        Intent i = new Intent(this, LinearLayourVertical.class);
        startActivity(i);
    }

    public void cLinearLayoutHorizontal(View view) {
        Intent i = new Intent(this, LinearLayoutHorizontal.class);
        startActivity(i);
    }

    public void cRelativeLayout(View view) {
        Intent i = new Intent(this, RelativeLayout.class);
        startActivity(i);
    }

    public void cTableLayout(View view) {
        Intent i = new Intent(this, TableLayoutActivity.class);
        startActivity(i);
    }

    public void cFrameLayout(View view) {
        Intent i = new Intent(this, FrameLayout.class);
        startActivity(i);
    }

    public void cListView(View view) {
        Intent i = new Intent(this, ListViewActivity.class);
        startActivity(i);
    }

    public void cGridView(View view) {
        Intent i = new Intent(this, GridViewActivity.class);
        startActivity(i);
    }

    public void cCustomAdapter(View view) {
        Intent i = new Intent(this, CustomAdapterActivity.class);
        startActivity(i);
    }

    public void cStyles(View view) {
        Intent i = new Intent(this, StylesActivity.class);
        startActivity(i);
    }

    public void cAutoComplete(View view) {
        Intent i = new Intent(this, AutoCompleteActivity.class);
        startActivity(i);
    }

    public void cPasarDataActivity(View view) {
        Intent i = new Intent(this, PasarDataActivity.class);
        startActivity(i);
    }

    public void cAlertDialog(View view) {
        Intent i = new Intent(this, AlertButtonActivity.class);
        startActivity(i);
    }

    public void cBoxex(View view) {
        Intent i = new Intent(this, BoxexActivity.class);
        startActivity(i);
    }


}
