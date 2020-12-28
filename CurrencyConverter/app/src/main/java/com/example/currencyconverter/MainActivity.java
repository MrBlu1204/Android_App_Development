package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText poundsEditText=(EditText) findViewById(R.id.poundsEditText);
        String poundsString=poundsEditText.getText().toString();
        double poundsDouble=Double.parseDouble(poundsString);
        double dollarsDouble=1.34*poundsDouble;
        String dollarString=String.format("%.2f",dollarsDouble);
        Toast.makeText(this, poundsString+" pounds is "+dollarString+" dollars.", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}