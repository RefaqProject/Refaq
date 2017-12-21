package com.example.elashry.refaq;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class AuthActivityFragment extends Fragment {

    ViewPager viewPager;

    List<Fragment> fragemtList=new ArrayList<>();
    List<String> titleList=new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_auth, container, false);

        viewPager=(ViewPager)view.findViewById(R.id.viewPager);

        TabLayout tabLayout=(TabLayout)view.findViewById(R.id.tab_layout);

        prepareData();

        TextTabsAdapter textTabsAdapter=new TextTabsAdapter(getFragmentManager(),fragemtList,titleList);

        viewPager.setAdapter(textTabsAdapter);

        tabLayout.setupWithViewPager(viewPager);


        return view;

    }

    public void prepareData(){
        addData(new SignInFragment(),"Signin");
        addData(new SignupFragment(),"Signup");

    }

    public void  addData(Fragment fragment , String title){

        fragemtList.add(fragment);
        titleList.add(title);

    }

}
