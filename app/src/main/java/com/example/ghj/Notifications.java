package com.example.ghj;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Notifications extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.

        navView.setSelectedItemId(R.id.navigation_notifications);

        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.navigation_bhajans :
                        startActivity(new Intent(getApplicationContext(), Bhajans.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.navigation_gallery :
                        startActivity(new Intent(getApplicationContext(), Gallery.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.navigation_home :
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.navigation_waani :
                        startActivity(new Intent(getApplicationContext(), Waani.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.navigation_notifications :
                        return true;

                }
                return false;
            }
        });
    }
}