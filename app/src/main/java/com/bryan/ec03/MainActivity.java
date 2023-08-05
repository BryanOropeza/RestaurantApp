package com.bryan.ec03;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

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
                    "Very delicious Plates",
                    "Tipical Plates From Perú",
                    "The best choice",

            };
            int mensajeAleatorio = (int) (Math.random() * mensajes.length);
            String mensajeElegido = mensajes[mensajeAleatorio];
            Snackbar.make(binding.getRoot(), mensajeElegido,Snackbar.LENGTH_SHORT).show();
        });

    }
}