package com.example.elashry.refaq;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;



public class SignInFragment extends Fragment {

    public SignInFragment(){
        Log.i("sign in","Fragment one");
    }

    EditText username,password;
    Button signinBTN;

    ProgressBar progressBar;


    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.signinfragment,container,false);

        progressBar=(ProgressBar)view.findViewById(R.id.progressBar1);
        progressBar.setVisibility(View.INVISIBLE);


        username=(EditText)view.findViewById(R.id.username);
        password=(EditText)view.findViewById(R.id.password);
        signinBTN=(Button)view.findViewById(R.id.signinbutton);
        signinBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(username.getText())) {
                    Toast.makeText(getActivity(), "Enter username !", Toast.LENGTH_SHORT).show();

                }

                else if (TextUtils.isEmpty(password.getText())) {
                    Toast.makeText(getActivity(), "Enter password!", Toast.LENGTH_SHORT).show();

                }else {

                    progressBar.setVisibility(View.VISIBLE);


                                        Toast.makeText(getActivity(),"Login successfully", Toast.LENGTH_LONG).show();

                                        Intent i=new Intent(getActivity(),MainActivity.class);
                                        startActivity(i);


                }

            }
        });


        return view;
    }
}
