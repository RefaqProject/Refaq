package com.example.elashry.refaq.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.elashry.refaq.R;

public class F_home_Fragment extends Fragment {

    private static View view;




    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.activity_f_home__fragment, container, false);

        return view;
    }
}
