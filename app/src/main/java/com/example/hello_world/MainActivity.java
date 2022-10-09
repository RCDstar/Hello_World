package com.example.hello_world;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button cambiar_texto;
    TextView Frase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Frase = (TextView)findViewById(R.id.Texto1);
        cambiar_texto = (Button)findViewById(R.id.CambiarTexto);
        cambiar_texto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Frase.setText("Hola món!");
            }
        });
    }
}