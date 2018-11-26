package com.example.frebby.lunoremake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button signIn;
    Intent intent;
    Button signUp;

    @Override
    public void onClick(View view) {
        if(signUp.isPressed()) {
            intent = new Intent(this, SignUpActivity.class);
            startActivity(intent);}
            else if(signIn.isPressed()){
                intent = new Intent(this, SignInActivity.class);
                startActivity(intent);
            }
        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signIn = findViewById(R.id.signIn);
        signIn.setOnClickListener(this);
        signUp = findViewById(R.id.signUp);
        signUp.setOnClickListener(this);


    }
}