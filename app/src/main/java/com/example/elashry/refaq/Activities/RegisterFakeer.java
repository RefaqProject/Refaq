package com.example.elashry.refaq.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.elashry.refaq.R;

import static android.view.View.GONE;
import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

public class RegisterFakeer extends AppCompatActivity {


    Button regist;
    EditText name,state,need,addrss,phone;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_fakeer);


        name=(EditText) findViewById(R.id.name_poor);
        phone=(EditText) findViewById(R.id.phone_poor);
        addrss=(EditText) findViewById(R.id.addrss_poor);
        need=(EditText) findViewById(R.id.need_poor);
        state=(EditText) findViewById(R.id.state_poor);
        progressBar=(ProgressBar) findViewById(R.id.progressBar2);




        progressBar.setVisibility( INVISIBLE);

        regist=(Button) findViewById(R.id.regist_poor);


        regist.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(name.getText())) {
                    Toast.makeText( RegisterFakeer.this, "Enter name !", Toast.LENGTH_SHORT).show();
                }


                else if (TextUtils.isEmpty(phone.getText())) {
                    Toast.makeText( RegisterFakeer.this, "Enter phone!", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(need.getText())) {
                    Toast.makeText( RegisterFakeer.this, "Enter first name!", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(state.getText())) {
                    Toast.makeText( RegisterFakeer.this, "Enter last name!", Toast.LENGTH_SHORT).show();
                }

                else {

                    progressBar.setVisibility( VISIBLE);

                    progressBar.setVisibility( GONE);

                    Toast.makeText( RegisterFakeer.this, "Your account is added successfully." , Toast.LENGTH_SHORT).show();

                    Intent i=new Intent( RegisterFakeer.this,MainActivity.class);
                    startActivity(i);




             }

            }


        });
    }
}
