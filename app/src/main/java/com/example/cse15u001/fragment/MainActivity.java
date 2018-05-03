package com.example.cse15u001.fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Switch(View view) {
        Fragment F;
        if (view == findViewById(R.id.btn1))
        {
            F = new FragmentOne();
            android.app.FragmentManager fm = getFragmentManager();
            android.app.FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.Frag,F);
            ft.commit();
        }
        else if (view == findViewById(R.id.btn2))
        {
            F = new FragmentTwo();
            android.app.FragmentManager fm = getFragmentManager();
            android.app.FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.Frag,F);
            ft.commit();
        }
    }

}
