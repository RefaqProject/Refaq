package com.example.elashry.refaq;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;




public class SignupFragment extends Fragment {


    Button kafeel,mtabr3,family,fakeer;


    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.signupfragment,container,false);

        kafeel=(Button)view.findViewById(R.id.kafeelbtn);
        mtabr3=(Button)view.findViewById(R.id.mtbar3btn);
        family=(Button)view.findViewById(R.id.familybtn);
        fakeer=(Button)view.findViewById(R.id.fakeerbtn);


        kafeel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent i = new Intent(getActivity(), RegisterKafeel.class);
                startActivity(i);


            }

        });
        mtabr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent i = new Intent(getActivity(), RegisterKafeel.class);
                startActivity(i);


            }

        });
        fakeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent i = new Intent(getActivity(), RegisterKafeel.class);
                startActivity(i);


            }

        });
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent i = new Intent(getActivity(), RegisterKafeel.class);
                startActivity(i);


            }

        });

        return view;
    }
}
