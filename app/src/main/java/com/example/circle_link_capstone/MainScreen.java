package com.example.circle_link_capstone;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainScreen extends AppCompatActivity {

    private TextView mTextMessage;
    private DrawerLayout drawerMain;
    private LinearLayout linearLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.voucher:
                    mTextMessage.setText( R.string.voucher );
                    return true;
                case R.id.history:
                    mTextMessage.setText( R.string.history );
                    return true;
                case R.id.card:
                    mTextMessage.setText( R.string.card );
                    return true;
                case R.id.location:
                    mTextMessage.setText( R.string.location );
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main_screen );

//        Bottom Navigation
        mTextMessage = (TextView) findViewById( R.id.message );
        BottomNavigationView navigation = (BottomNavigationView) findViewById( R.id.navigation );
        navigation.setOnNavigationItemSelectedListener( mOnNavigationItemSelectedListener );

//        Side Menu
        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
        setSupportActionBar(toolbar);

        drawerMain = (DrawerLayout) findViewById( R.id.drawerMain );
        linearLayout = (LinearLayout) findViewById( R.id.linearNavigation );


//        create two String for actionBarDrawerToggle
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerMain, R.string.open,
                R.string.close);

//        set drawerListener to the drawerLayout

        drawerMain.addDrawerListener( actionBarDrawerToggle );

        getSupportActionBar().setDisplayShowHomeEnabled( true );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );
        
//        set click listener to above menu
        toolbar.setNavigationOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(drawerMain.isDrawerOpen(linearLayout)){
                    drawerMain.closeDrawer( linearLayout );
                } else {
                    drawerMain.openDrawer( linearLayout );
                }
            }
        } );

    }

    @Override
    protected void onPostCreate(@Nullable Bundle saveInstanceState) {
        super.onPostCreate( saveInstanceState );

        actionBarDrawerToggle.syncState();

    }

    public void onBackCreate() {
        if(drawerMain.isDrawerOpen(linearLayout)) {
            drawerMain.closeDrawer( linearLayout );
        } else {
            super.onBackPressed();
        }

    }


    private void setSupportActionBar(Toolbar toolbar) {
    }

}
