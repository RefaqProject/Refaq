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



/**
 * Created by mohamed on 5/18/2017.
 */
public class SignupFragment extends Fragment {


    Button regist;
    EditText email,password,fullname,addrss,phone;
    ProgressBar progressBar;



    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.signupfragment,container,false);


        email=(EditText)view.findViewById(R.id.email);
        password=(EditText)view.findViewById(R.id.passwordet);
        fullname=(EditText)view.findViewById(R.id.fullname);
        addrss=(EditText)view.findViewById(R.id.addrss);
        phone=(EditText)view.findViewById(R.id.phone);
        progressBar=(ProgressBar)view.findViewById(R.id.progressBar2);




        progressBar.setVisibility(View.INVISIBLE);

        regist=(Button)view.findViewById(R.id.registbutton);


        regist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(email.getText())) {
                    Toast.makeText(getActivity(), "Enter email address!", Toast.LENGTH_SHORT).show();
                }

                else if (TextUtils.isEmpty(password.getText())) {
                    Toast.makeText(getActivity(), "Enter password!", Toast.LENGTH_SHORT).show();
                }

                else if (TextUtils.isEmpty(phone.getText())) {
                    Toast.makeText(getActivity(), "Enter phone!", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(fullname.getText())) {
                    Toast.makeText(getActivity(), "Enter first name!", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(password.getText())) {
                    Toast.makeText(getActivity(), "Enter last name!", Toast.LENGTH_SHORT).show();
                }
                else if (password.length() < 6) {
                    Toast.makeText(getActivity(), "Password too short, enter minimum 6 characters!", Toast.LENGTH_SHORT).show();
                }
                else {

                    progressBar.setVisibility(View.VISIBLE);

                     progressBar.setVisibility(View.GONE);

                                    Toast.makeText(getActivity(), "Your account is added successfully." , Toast.LENGTH_SHORT).show();

                    Intent i=new Intent(getActivity(),MainActivity.class);
                    startActivity(i);




                }

            }


        });

        return view;
    }
}
