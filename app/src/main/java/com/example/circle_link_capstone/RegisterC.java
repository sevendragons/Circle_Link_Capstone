package com.example.circle_link_capstone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_register_c );

        Button btnLogin = (Button) findViewById( R.id.openLogin );
        Button btnForgot = (Button) findViewById( R.id.btnForgot );

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( RegisterC.this, Login.class );
                startActivity( intent );
            }

        });

        btnForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent( RegisterC.this, ForgotPass.class );
                startActivity( intent2 );
            }
        });




    }
}
