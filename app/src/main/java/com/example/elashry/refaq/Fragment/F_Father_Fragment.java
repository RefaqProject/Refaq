package com.example.elashry.refaq.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.elashry.refaq.Activities.Family_2;
import com.example.elashry.refaq.Activities.MainActivity;
import com.example.elashry.refaq.R;
import com.example.elashry.refaq.Activities.RegisterFakeer;
import com.example.elashry.refaq.Activities.RegisterFamily;
import com.example.elashry.refaq.Activities.RegisterKafeel;
import com.example.elashry.refaq.Activities.Registermtabr3;


public class F_Father_Fragment extends Fragment {

    private static View view;




    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.activity_f__father__fragment, container, false);

        return view;
    }

    public static class SignupFragment extends Fragment {


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



                    Intent i = new Intent(getActivity(), Registermtabr3.class);
                    startActivity(i);


                }

            });
            fakeer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {



                    Intent i = new Intent(getActivity(), RegisterFakeer.class);
                    startActivity(i);


                }

            });
            family.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {



                    Intent i = new Intent(getActivity(), RegisterFamily.class);
                    startActivity(i);


                }

            });

            return view;
        }
    }

    public static class SignInFragment extends Fragment {

        public SignInFragment() {
            Log.i("sign in", "Fragment one");
        }

        EditText username, password;
        Button signinBTN;

        ProgressBar progressBar;


        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.signinfragment, container, false);

            progressBar = (ProgressBar) view.findViewById(R.id.progressBar1);
            progressBar.setVisibility(View.INVISIBLE);
            username = (EditText) view.findViewById(R.id.username);
            password = (EditText) view.findViewById(R.id.password);
            signinBTN = (Button) view.findViewById(R.id.signinbutton);
            signinBTN.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String x=password.getText()+"";
                    String l=username.getText()+"";


                    if (l.equals("asmaa")&&x.equals("123")) {

                           Intent i = new Intent(getActivity(), MainActivity.class);
                           startActivity(i);
                           Toast.makeText(getActivity(), "Lo", Toast.LENGTH_LONG).show();

                       }else {
                        Toast.makeText(getActivity(), username.getText(), Toast.LENGTH_LONG).show();
                        Toast.makeText(getActivity(), "Login successfully", Toast.LENGTH_LONG).show();

                        Intent i = new Intent(getActivity(), Family_2.class);
                        startActivity(i);

                    }


            }}
            );


            return view;
        }
    }
}
