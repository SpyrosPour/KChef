package com.example.kchef;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondaryActivity extends AppCompatActivity {
    Button button;
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        text = (EditText) findViewById(R.id.editText);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String passInfo = text.getText().toString();
                Intent intent = new Intent(SecondaryActivity.this, MainActivity.class);
                intent.putExtra("INFO",passInfo);
                startActivity(intent);
            }
        });
    }
}