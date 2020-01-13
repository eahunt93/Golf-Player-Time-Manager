package com.example.elijah.golfplayertimemanagement;

import android.content.Intent;
import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();

    }

    @Override
    protected void onStart() {
        super.onStart();
        if(mAuth.getCurrentUser() == null){
            OpenPresentationActivity();
        }

    }

    public void OpenPresentationActivity(){
        Intent intent = new Intent(MainActivity.this, PresentationActivity.class);
        startActivity(intent);
        finish();
    }
}
