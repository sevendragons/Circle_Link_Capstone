package com.example.circle_link_capstone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForgotPass extends AppCompatActivity {
    private Button openLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_forgot_pass );

        openLogin = (Button) findViewById( R.id.openLogin );

        openLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( ForgotPass.this, Login.class );
                startActivity( intent );
            }

        });

    }
}
