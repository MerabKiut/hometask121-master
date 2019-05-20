package com.example.task21; //решить проблему с именем


import android.app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.MessageFormat;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private TextView message;
    private String name;
    private String email;
    private EditText nameInput;
    private EditText emailInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button okButton = findViewById(R.id.button_ok);
        Button clearButton = findViewById(R.id.button_clear);

        message = findViewById(R.id.result);

        nameInput = (EditText)findViewById(R.id.userNameInput);
        emailInput = (EditText)findViewById(R.id.userEmailInput);

        okButton.setOnClickListener(okButtonListener);
        clearButton.setOnClickListener(clearButtonListener);
    }

    private final View.OnClickListener okButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            name = nameInput.getText().toString();
            email = emailInput.getText().toString();
            message.setText(String.format(getString(R.string.sign), name, email));
        }
    };

    private final View.OnClickListener clearButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            message.setText("");
            nameInput.setText("");
            emailInput.setText("");
        }
    };
}
