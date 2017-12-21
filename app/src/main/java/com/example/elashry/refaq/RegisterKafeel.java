package com.example.elashry.refaq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import static android.view.View.GONE;
import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

public class RegisterKafeel extends AppCompatActivity {


    Button regist;
    EditText email,password,fullname,addrss,phone;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_kafeel);


        email=(EditText) findViewById(R.id.email);
        password=(EditText) findViewById(R.id.passwordet);
        fullname=(EditText) findViewById(R.id.fullname);
        addrss=(EditText) findViewById(R.id.addrss);
        phone=(EditText) findViewById(R.id.phone);
        progressBar=(ProgressBar) findViewById(R.id.progressBar2);




        progressBar.setVisibility( INVISIBLE);

        regist=(Button) findViewById(R.id.registbutton);


        regist.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(email.getText())) {
                    Toast.makeText( RegisterKafeel.this, "Enter email address!", Toast.LENGTH_SHORT).show();
                }

                else if (TextUtils.isEmpty(password.getText())) {
                    Toast.makeText( RegisterKafeel.this, "Enter password!", Toast.LENGTH_SHORT).show();
                }

                else if (TextUtils.isEmpty(phone.getText())) {
                    Toast.makeText( RegisterKafeel.this, "Enter phone!", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(fullname.getText())) {
                    Toast.makeText( RegisterKafeel.this, "Enter first name!", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(password.getText())) {
                    Toast.makeText( RegisterKafeel.this, "Enter last name!", Toast.LENGTH_SHORT).show();
                }
                else if (password.length() < 6) {
                    Toast.makeText( RegisterKafeel.this, "Password too short, enter minimum 6 characters!", Toast.LENGTH_SHORT).show();
                }
                else {

                    progressBar.setVisibility( VISIBLE);

                    progressBar.setVisibility( GONE);

                    Toast.makeText( RegisterKafeel.this, "Your account is added successfully." , Toast.LENGTH_SHORT).show();

                    Intent i=new Intent( RegisterKafeel.this,MainActivity.class);
                    startActivity(i);




                }

            }


        });
    }
}
