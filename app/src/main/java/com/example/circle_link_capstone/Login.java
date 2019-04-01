package com.example.circle_link_capstone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {
    private Button openSignup;
    private Button openForgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );

        openSignup = (Button)findViewById( R.id.openSignUp );
        openForgot = (Button)findViewById( R.id.btnForgot );

        openSignup.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( Login.this, RegisterC.class );
                startActivity(i);
            }

        } );

        openForgot.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent( Login.this, MainScreen.class );
                startActivity(i2);
            }
        } );
    }

}
