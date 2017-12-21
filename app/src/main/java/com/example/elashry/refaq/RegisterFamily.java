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

public class RegisterFamily extends AppCompatActivity {


    Button regist;
    EditText name,id,fullname,dept,phone,password,cpassword;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_family);


        name=(EditText) findViewById(R.id.name_family);
        id=(EditText) findViewById(R.id.id_family);
        password=(EditText) findViewById(R.id.password_family);
        cpassword=(EditText) findViewById(R.id.confirm_pass_family);
        dept=(EditText) findViewById(R.id.dep_family);
        phone=(EditText) findViewById(R.id.phone_family);
        progressBar=(ProgressBar) findViewById(R.id.progressBar2);




        progressBar.setVisibility( INVISIBLE);

        regist=(Button) findViewById(R.id.familybtn);


        regist.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(name.getText())) {
                    Toast.makeText( RegisterFamily.this, "Enter name !", Toast.LENGTH_SHORT).show();
                }

                else if (TextUtils.isEmpty(id.getText())) {
                    Toast.makeText( RegisterFamily.this, "Enter id!", Toast.LENGTH_SHORT).show();
                }

                else if (TextUtils.isEmpty(phone.getText())) {
                    Toast.makeText( RegisterFamily.this, "Enter phone!", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(dept.getText())) {
                    Toast.makeText( RegisterFamily.this, "Enter department!", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(password.getText())) {
                    Toast.makeText( RegisterFamily.this, "Enter password!", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(cpassword.getText())) {
                    Toast.makeText( RegisterFamily.this, "Enter confirm password!", Toast.LENGTH_SHORT).show();
                }
                else if (password.length() < 6) {
                    Toast.makeText( RegisterFamily.this, "Password too short, enter minimum 6 characters!", Toast.LENGTH_SHORT).show();
                }
                else {

                    progressBar.setVisibility( VISIBLE);

                    progressBar.setVisibility( GONE);

                    Toast.makeText( RegisterFamily.this, "Your account is added successfully." , Toast.LENGTH_SHORT).show();

                    Intent i=new Intent( RegisterFamily.this,MainActivity.class);
                    startActivity(i);




                }

            }


        });
    }
}
