package com.example.homework_3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText subject, text, addresses;
    private Button btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initObjects();
        btn_send.setOnClickListener(view -> {
            Intent emailIntent = new Intent(Intent.ACTION_SEND);
            emailIntent.setType("text/plain");
            emailIntent.putExtra(Intent.EXTRA_EMAIL  , addresses.getText().toString());
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject.getText().toString());
            emailIntent.putExtra(Intent.EXTRA_TEXT   , text.getText().toString());

            startActivity(emailIntent);
        });

        }

    private void initObjects() {
        addresses = findViewById(R.id.et_email);
        subject = findViewById(R.id.et_theme);
        text = findViewById(R.id.et_text);
        btn_send = findViewById(R.id.btn_send);
    }

}



