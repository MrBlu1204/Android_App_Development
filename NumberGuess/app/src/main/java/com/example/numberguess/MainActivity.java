package com.example.numberguess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    String message;
    public void generateNumber(){
         Random rand=new Random();
         randomNumber=rand.nextInt(20)+1;
         Log.i("Generated Values",Integer.toString(randomNumber));
    }
    
    public void guess(View view){
        EditText guessEditText=(EditText) findViewById(R.id.guessEditText);
        if(guessEditText.getText().toString().isEmpty()){
            Toast.makeText(this,"Enter a number",Toast.LENGTH_LONG).show();
        }
        else {
            int guessNumber = Integer.parseInt(guessEditText.getText().toString());
            Log.i("Guess Value",guessEditText.getText().toString());
            if(guessNumber<randomNumber){
                message="Lower";
            }
            else if(guessNumber>randomNumber){
                message="Higher";
            }
            else{
                message="You got it Right, Try Again";
                generateNumber();
            }
            Toast.makeText(this,message,Toast.LENGTH_LONG).show();
        }
        
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateNumber();
    }
}