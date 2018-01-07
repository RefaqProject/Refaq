package com.example.elashry.refaq.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationAdapter;
import com.example.elashry.refaq.Fragment.F_Family_Fragment;
import com.example.elashry.refaq.Fragment.F_Father_Fragment;
import com.example.elashry.refaq.Fragment.F_Main_Fragment;
import com.example.elashry.refaq.Fragment.F_home_Fragment;
import com.example.elashry.refaq.Fragment.F_mony_Fragment;
import com.example.elashry.refaq.R;


public class Family_2 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private FloatingActionButton floatingActionButton;

    AHBottomNavigation bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


          bottomNavigation = (AHBottomNavigation) findViewById(R.id.bottom_navigation);
        final AHBottomNavigationAdapter adapter = new AHBottomNavigationAdapter(Family_2.this,R.menu.bottom_nav_menu);
        adapter.setupWithBottomNavigation(bottomNavigation);

        bottomNavigation.setDefaultBackgroundColor(ContextCompat.getColor(Family_2.this,R.color.colorPrimary));
        bottomNavigation.setAccentColor(ContextCompat.getColor(Family_2.this,R.color.tab_checked));
        bottomNavigation.setInactiveColor(ContextCompat.getColor(Family_2.this,R.color.tab_enable));

        bottomNavigation.setCurrentItem(0);

        if (bottomNavigation.getCurrentItem()==0)
        {

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragmentsContainer,new F_Main_Fragment())
                    .commit();

        }
        bottomNavigation.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {

                if (position==0)
                {
                    bottomNavigation.setCurrentItem(position,false);
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragmentsContainer,new F_Main_Fragment())
                            .commit();





                }
                else if (position==1)
                {
                    bottomNavigation.setCurrentItem(position,false);
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragmentsContainer,new F_Father_Fragment())
                            .commit();




                }
                else if (position==2)
                {

                    bottomNavigation.setCurrentItem(position,false);

                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragmentsContainer,new F_home_Fragment())
                            .commit();


                }
                else if (position==3)
                {

                    bottomNavigation.setCurrentItem(position,false);

                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragmentsContainer,new F_mony_Fragment())
                            .commit();


                }

                else if (position==4)
                {

                    bottomNavigation.setCurrentItem(position,false);

                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragmentsContainer,new F_Family_Fragment())
                            .commit();


                }
                return false;
            }
        });




    }


    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.news) {
            // Handle the camera action
            Intent i=new Intent(Family_2.this,News.class);
            startActivity(i);
        } else if (id == R.id.programs) {
            Intent i=new Intent(Family_2.this,Programs.class);
            startActivity(i);
        } else if (id == R.id.about) {
            Intent i=new Intent(Family_2.this,About.class);
            startActivity(i);
        }
        else if (id == R.id.contact) {
            Intent i=new Intent(Family_2.this,CallUs.class);
            startActivity(i);


        }else if (id == R.id.out) {
            Intent i=new Intent(Family_2.this,IntroActivity.class);
            startActivity(i);


        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
