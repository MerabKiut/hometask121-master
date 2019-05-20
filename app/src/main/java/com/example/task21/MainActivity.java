package com.example.task21; //решить проблему с именем


import android.app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
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
    private String sign;
    private String mail;

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

        sign = getString(R.string.sign);
        mail = getString(R.string.mail);



    }

    private final View.OnClickListener okButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            name = nameInput.getText().toString();
            email = emailInput.getText().toString();

            message.setText(MessageFormat.format("{0}{1}{2}{3}", sign, name, mail, email));
            // изменил на ресурсы, правда не совсем понимаю зачем делать это в Java коде

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
