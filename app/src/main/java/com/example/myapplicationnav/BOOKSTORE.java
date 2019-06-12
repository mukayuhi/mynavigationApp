package com.example.myapplicationnav;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BOOKSTORE extends AppCompatActivity {
Button btnlog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_bookstore );
        btnlog=(Button)findViewById ( R.id.btnlog );
        Toast.makeText ( this,"logged in",Toast.LENGTH_SHORT ).show ();
    }

    public void btnlog(View view) {
        Intent nzere =new Intent (BOOKSTORE.this,MainActivity.class);
        startActivity ( nzere );
    }
}
