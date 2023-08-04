package com.bryan.ec03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bryan.ec03.databinding.ActivityPrincipalBinding;
import com.google.android.material.snackbar.Snackbar;

public class PrincipalActivity extends AppCompatActivity {

    private ActivityPrincipalBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPrincipalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.fabAddMovie.setOnClickListener(view -> {
            Snackbar.make(binding.getRoot(),"Add a Movie", Snackbar.LENGTH_SHORT).show();
        });


    }
}