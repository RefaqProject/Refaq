package com.example.elashry.refaq;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class FamilyDetails extends AppCompatActivity {
    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_details);
        name=findViewById(R.id.name);
        Intent i=getIntent();
        name.setText(i.getStringExtra("name"));

    }
}
