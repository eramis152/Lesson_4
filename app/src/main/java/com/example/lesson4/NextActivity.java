package com.example.lesson4;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class NextActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        textView = findViewById(R.id.textView);

        String texto = getIntent().getStringExtra("textoIngresado");

        if (texto != null) {
            textView.setText(texto);
        }
    }
}