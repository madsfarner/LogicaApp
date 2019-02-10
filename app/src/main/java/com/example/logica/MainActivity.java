package com.example.logica;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mTF1;
    private Button mTF2;
    private Button mTF3;
    private Button mTF4;
    private Button mSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTF1 = findViewById(R.id.buttonTF1);
        mTF2 = findViewById(R.id.buttonTF2);
        mTF3 = findViewById(R.id.buttonTF3);
        mTF4 = findViewById(R.id.buttonTF4);
        mSubmit = findViewById(R.id.buttonSubmit);

        mTF1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                toggleTF(mTF1);
            }
        });
        mTF2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                toggleTF(mTF2);
            }
        });
        mTF3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                toggleTF(mTF3);
            }
        });
        mTF4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                toggleTF(mTF4);
            }
        });
        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                checkAnswer();
            }
        });

    }

    private void toggleTF(Button button){
        if(button.getText().equals("F")) {
            button.setText("T");
        } else {
            button.setText("F");
        }
    }

    private void checkAnswer(){
        boolean allCorrect = true;
        if(mTF1.getText().equals("T")) {
            mTF1.setBackgroundColor(Color.GREEN);
        } else {
            mTF1.setBackgroundColor(Color.RED);
            allCorrect = false;
        }
        if(mTF2.getText().equals("F")) {
            mTF2.setBackgroundColor(Color.GREEN);
        } else {
            mTF2.setBackgroundColor(Color.RED);
            allCorrect = false;
        }
        if(mTF3.getText().equals("F")) {
            mTF3.setBackgroundColor(Color.GREEN);
        } else {
            mTF3.setBackgroundColor(Color.RED);
            allCorrect = false;
        }
        if(mTF4.getText().equals("F")) {
            mTF4.setBackgroundColor(Color.GREEN);
        } else {
            mTF4.setBackgroundColor(Color.RED);
            allCorrect = false;
        }
        if (allCorrect){
            Toast.makeText(this, "All correct!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Not everything correct", Toast.LENGTH_SHORT).show();
        }
    }
}
