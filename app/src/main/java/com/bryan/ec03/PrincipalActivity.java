package com.bryan.ec03;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.bryan.ec03.databinding.ActivityPrincipalBinding;
import com.bryan.ec03.fragments.HomeFragment;
import com.google.android.material.snackbar.Snackbar;

public class PrincipalActivity extends AppCompatActivity {

    private ActivityPrincipalBinding binding;
    public static String EMAIL = "EMAIL";
    public String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPrincipalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSession();
        addHomeFragment();




    }

    private void addHomeFragment() {
        getSupportFragmentManager()
                .beginTransaction().add(binding.fcwMain.getId(), new HomeFragment()).commit();
    }

    private void setSession() {
        Intent getIntent = getIntent();
        email = getIntent.getStringExtra(EMAIL);
        binding.textEmail.setText(email);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.food_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){

        if (item.getItemId() == R.id.search) {

            Snackbar.make(binding.getRoot(),"Search", Snackbar.LENGTH_SHORT).show();
            return true;

        } else if (item.getItemId() == R.id.settings) {

            Snackbar.make(binding.getRoot(),"Settings", Snackbar.LENGTH_SHORT).show();
            return true;

        } else {
            return false;
        }

    }
}