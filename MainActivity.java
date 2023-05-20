package com.example.myapplicationapril5;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editText1, editText2;
    private Button buttonSwap, buttonCheck;
    private TextView textResult;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        buttonSwap = findViewById(R.id.buttonSwap);
        buttonCheck = findViewById(R.id.buttonCheck);
        textResult = findViewById(R.id.textResult);

        buttonSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = editText1.getText().toString();
                editText1.setText(editText2.getText().toString());
                editText2.setText(temp);
            }
        });

        buttonCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText1.getText().toString().equals(editText2.getText().toString())) {
                    textResult.setText("SAME");
                } else {
                    textResult.setText("NOT THE SAME");
                }
            }
        });
    }
}