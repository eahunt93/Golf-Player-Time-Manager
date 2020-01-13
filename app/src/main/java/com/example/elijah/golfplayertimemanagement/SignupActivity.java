package com.example.elijah.golfplayertimemanagement;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {
    private EditText email;
    private EditText password1;
    private EditText password2;
    private Button Signupbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        email = (EditText) findViewById(R.id.signupEmail);
        password1 = (EditText) findViewById(R.id.signupPassword1);
        password2 = (EditText) findViewById(R.id.signupPassword2);
        Signupbtn = (Button) findViewById(R.id.Signupbtn);
        String Email = "";
        String Password1 = "";
        String Password2 = "";


        //User clicks sign up button and creates their account
        Signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Email = email.getText().toString();
                String Password1 = password1.getText().toString();
                String Password2 = password2.getText().toString();

                //firebase stuff goes in here. make a Toast message to check that it works


            }
        });
    }
}
