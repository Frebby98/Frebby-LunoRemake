package com.example.frebby.lunoremake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmActivity extends AppCompatActivity implements View.OnClickListener {

   Button confirmEmail;
   Intent intent;

    @Override
    public void onClick(View view) {
            intent = new Intent(this, AccessActivity.class);
            startActivity(intent);
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
       confirmEmail =findViewById(R.id.confirmEmail);
       confirmEmail.setOnClickListener(this);


    }
}
