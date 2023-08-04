package com.bryan.ec03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import com.bryan.ec03.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    //private Button btnGetStarted;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnGetStarted.setOnClickListener(v ->{
            //Toast.makeText(this,"Comenzar",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        } );
        binding.fltMain.setOnClickListener(view -> {
            String[] mensajes = {
                    "Playing!",
                    "Started Now",
                    "Let's go",
                    "Very Nice"
            };
            int mensajeAleatorio = (int) (Math.random() * mensajes.length);
            String mensajeElegido = mensajes[mensajeAleatorio];
            Snackbar.make(binding.getRoot(), mensajeElegido,Snackbar.LENGTH_SHORT).show();
        });

    }
}