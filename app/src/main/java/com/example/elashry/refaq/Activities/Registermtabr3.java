package com.example.elashry.refaq.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.elashry.refaq.R;


public class Registermtabr3 extends AppCompatActivity {


    Button regist;
    EditText email,password,fullname,addrss,phone;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registermtabr3);


        /*email=(EditText) findViewById(R.id.email);
        password=(EditText) findViewById(R.id.passwordet);
        fullname=(EditText) findViewById(R.id.fullname);
        addrss=(EditText) findViewById(R.id.addrss);
        phone=(EditText) findViewById(R.id.phone);
        progressBar=(ProgressBar) findViewById(R.id.progressBar2);


*/

      /*  progressBar.setVisibility( INVISIBLE);

        regist=(Button) findViewById(R.id.registbutton);


        regist.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(email.getText())) {
                    Toast.makeText( Registermtabr3.this, "Enter email address!", Toast.LENGTH_SHORT).show();
                }

                else if (TextUtils.isEmpty(password.getText())) {
                    Toast.makeText( Registermtabr3.this, "Enter password!", Toast.LENGTH_SHORT).show();
                }

                else if (TextUtils.isEmpty(phone.getText())) {
                    Toast.makeText( Registermtabr3.this, "Enter phone!", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(fullname.getText())) {
                    Toast.makeText( Registermtabr3.this, "Enter first name!", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(password.getText())) {
                    Toast.makeText( Registermtabr3.this, "Enter last name!", Toast.LENGTH_SHORT).show();
                }
                else if (password.length() < 6) {
                    Toast.makeText( Registermtabr3.this, "Password too short, enter minimum 6 characters!", Toast.LENGTH_SHORT).show();
                }
                else {

                    progressBar.setVisibility( VISIBLE);

                    progressBar.setVisibility( GONE);

                    Toast.makeText( Registermtabr3.this, "Your account is added successfully." , Toast.LENGTH_SHORT).show();

                    Intent i=new Intent( Registermtabr3.this,MainActivity.class);
                    startActivity(i);




                }

            }


        });*/
    }
}
