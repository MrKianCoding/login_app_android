package com.kian.login_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView buttonBack, buttonGoogle, buttonFacebook;
    Button buttonSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonBack = findViewById(R.id.buttonBack);
        buttonGoogle = findViewById(R.id.buttonGoogle);
        buttonFacebook = findViewById(R.id.buttonFacebook);
        buttonSignup = findViewById(R.id.buttonSignup);

        buttonBack.setOnClickListener(v-> Toast.makeText(this,"Back",Toast.LENGTH_SHORT).show());
        buttonGoogle.setOnClickListener(v->{});
        buttonFacebook.setOnClickListener(v->{});
        buttonSignup.setOnClickListener(v-> Toast.makeText(this,"Sign up successfully",Toast.LENGTH_LONG).show());
    }
}