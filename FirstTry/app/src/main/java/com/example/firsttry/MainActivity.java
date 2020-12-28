package com.example.firsttry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private View view;

    public void clickFunction(View view){
        EditText loginEditText=(EditText)findViewById(R.id.loginEditText);
        EditText passwordEditText=(EditText) findViewById(R.id.passwordEditText);
        Log.i("Info","Button Clicked!");
        Log.i("Login ID",loginEditText.getText().toString());
        Log.i("Password",passwordEditText.getText().toString());
        Toast.makeText(this,"Hello "+loginEditText.getText().toString()+", you're now login",Toast.LENGTH_LONG).show();
        ImageView imageView=(ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.images);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}