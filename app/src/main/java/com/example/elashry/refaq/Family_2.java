package com.example.elashry.refaq;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationAdapter;


public class Family_2 extends AppCompatActivity {
    private FloatingActionButton floatingActionButton;

    AHBottomNavigation bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_2);

          bottomNavigation = (AHBottomNavigation) findViewById(R.id.bottom_navigation);
        final AHBottomNavigationAdapter adapter = new AHBottomNavigationAdapter(Family_2.this,R.menu.bottom_nav_menu);
        adapter.setupWithBottomNavigation(bottomNavigation);

        bottomNavigation.setDefaultBackgroundColor(ContextCompat.getColor(Family_2.this,R.color.colorPrimary));
        bottomNavigation.setAccentColor(ContextCompat.getColor(Family_2.this,R.color.tab_checked));
        bottomNavigation.setInactiveColor(ContextCompat.getColor(Family_2.this,R.color.tab_enable));

        bottomNavigation.setCurrentItem(0);

        if (bottomNavigation.getCurrentItem()==0)
        {

        }
        bottomNavigation.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {

                if (position==0)
                {
                    bottomNavigation.setCurrentItem(position,false);
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragmentsContainer,new F_Family_Fragment())
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


                }
                else if (position==3)
                {

                    bottomNavigation.setCurrentItem(position,false);


                }

                else if (position==4)
                {

                    bottomNavigation.setCurrentItem(position,false);


                }
                return false;
            }
        });




    }
    
    
}
