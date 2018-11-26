
package com.example.frebby.lunoremake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener {
    Button next;
    Intent intent;
    @Override
    public void onClick(View view) {
        intent = new Intent(this, ConfirmActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        next = findViewById(R.id.next);
        next.setOnClickListener(this);
    }
    }

