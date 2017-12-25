package com.example.elashry.refaq;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;



public class Programs extends AppCompatActivity {
    String [] programsNames = {"البرنامج السابع","البرنامج السادس","البرنامج الخامس","البرنامج الرابع","البرنامج الثالث","البرنامج الثانى","البرنامج الاول "};
    String [] programsRate = {"25$","100$","94$","25$","100$","94$","100$"};
    int [] programsImg = {R.drawable.program5,R.drawable.program2,R.drawable.program3,R.drawable.program7,R.drawable.program5,R.drawable.program6,R.drawable.program7};
    RecyclerView programRecyclerView;
    RecyclerAdapter programRecyclerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs);
        programRecyclerView = (RecyclerView) findViewById(R.id.recyclerview_id);
        programRecyclerAdapter = new RecyclerAdapter(Programs.this,programsNames,programsRate,programsImg);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        programRecyclerView.setLayoutManager(layoutManager);
        programRecyclerView.setHasFixedSize(true);


        programRecyclerView.setAdapter(programRecyclerAdapter);
    }
}
