package com.example.ghj;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.

        navView.setSelectedItemId(R.id.navigation_home);

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
                        return true;
                    case R.id.navigation_waani :
                        startActivity(new Intent(getApplicationContext(), Waani.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.navigation_notifications :
                        startActivity(new Intent(getApplicationContext(), Notifications.class));
                        overridePendingTransition(0,0);
                        return true;

                }
                return false;
            }
        });

    }

}