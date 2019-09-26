package com.example.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnFrag1, btnFrag2;
    Fragment myfrag1, myfrag2;
    FragmentTransaction transaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myfrag1 = new MyFrag1();
        myfrag2 = new MyFrag2();

        btnFrag1 = findViewById(R.id.button);
        btnFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frag_cont, myfrag1);
                transaction.commit();
            }
        });

        btnFrag2 = findViewById(R.id.button2);
        btnFrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frag_cont, myfrag2);
                transaction.commit();
            }
        });
    }
}
