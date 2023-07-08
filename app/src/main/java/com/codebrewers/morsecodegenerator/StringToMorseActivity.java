package com.codebrewers.morsecodegenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StringToMorseActivity extends AppCompatActivity {

    EditText input;
    Button button;
    TextView output;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_string_to_morse);
        setContentView(R.layout.activity_string_to_morse);

        input = findViewById(R.id.editTextMorse);
        button = findViewById(R.id.buttonConvertToString);
        output = findViewById(R.id.textViewOutputString);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convert();
            }
        });
    }

    private void convert() {
        String strInput = String.valueOf(input.getText()).toUpperCase();
        String strOutput = "";

        for (char c : strInput.toCharArray()) {
            strOutput += MainActivity.morseCode.get(c) + " ";
        }

        output.setText(strOutput.trim());
    }
}