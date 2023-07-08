package com.codebrewers.morsecodegenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MorseToStringActivity extends AppCompatActivity {

    EditText input;
    Button button;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morse_to_string);

        input = findViewById(R.id.editTextMorse);
        button = findViewById(R.id.buttonConvertToString);
        output = findViewById(R.id.textViewOutputString);

        button.setOnClickListener(v -> convert());
    }

    private void convert() {
        String strInput = String.valueOf(input.getText());

        StringBuilder sentence = new StringBuilder();
        String[] words = strInput.split(" / ");
        for (String word : words) {
            String[] letters = word.split(" ");
            for (String letter : letters) {
                String character = MainActivity.stringMap.get(letter);
                if (character != null) {
                    sentence.append(character);
                }
            }
            sentence.append(" ");
        }

        output.setText(sentence.toString().trim());

//        output.setText("This is output");
    }
}