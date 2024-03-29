package com.example.myapplicationnav;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        Toolbar toolbar = findViewById ( R.id.toolbar );
        setSupportActionBar ( toolbar );
        FloatingActionButton fab = findViewById ( R.id.fab );
        fab.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Snackbar.make ( view, "welcome", Snackbar.LENGTH_LONG )
                        .setAction ( "hello", null ).show ();
            }
        } );
        DrawerLayout drawer = findViewById ( R.id.drawer_layout );
        NavigationView navigationView = findViewById ( R.id.nav_view );
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle (
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close );
        drawer.addDrawerListener ( toggle );
        toggle.syncState ();
        navigationView.setNavigationItemSelectedListener ( this );
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById ( R.id.drawer_layout );
        if (drawer.isDrawerOpen ( GravityCompat.START )) {
            drawer.closeDrawer ( GravityCompat.START );
        } else {
            super.onBackPressed ();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater ().inflate ( R.menu.main, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId ();

        //noinspection SimplifiableIfStatement
        if (id == R.id.morning) {
            Toast.makeText ( getApplicationContext (),"we have a fastfood in the morning",Toast.LENGTH_SHORT ).show ();
            return true;
        }

        return super.onOptionsItemSelected ( item );
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId ();

        if (id == R.id.nav_Dishes) {
            Toast.makeText ( getApplicationContext (),"Dishes are here",Toast.LENGTH_SHORT ).show ();
            // Handle the camera action
        } else if (id == R.id.nav_Tables) {
            Toast.makeText ( getApplicationContext (),"Tables are here",Toast.LENGTH_SHORT ).show ();

        } else if (id == R.id.nav_Chairs) {
            Toast.makeText ( getApplicationContext (),"Chairs are here",Toast.LENGTH_SHORT ).show ();

        } else if (id == R.id.nav_Menus) {
            Toast.makeText ( getApplicationContext (),"Menus are here",Toast.LENGTH_SHORT ).show ();

        } else if (id == R.id.nav_Folks) {
            Toast.makeText ( getApplicationContext (),"Folks are here",Toast.LENGTH_SHORT ).show ();

        } else if (id == R.id.nav_Flask) {
            Toast.makeText ( getApplicationContext (),"Flasks are here",Toast.LENGTH_SHORT ).show ();

        }


        DrawerLayout drawer = findViewById ( R.id.drawer_layout );
        drawer.closeDrawer ( GravityCompat.START );
        return true;
    }
}
