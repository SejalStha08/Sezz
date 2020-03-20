package com.example.planner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Fragment;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
  public  void ChangeFragment(View view) {
      Fragment fragment;
      if (view == findViewById(R.id.Button)) {
          fragment=new Fragment1();
          FragmentManager fm=getFragmentManager();
          FragmentTransaction ft=fm.beginTransaction();
          ft.replace(R.id.button2,fragment);
          ft.commit();
      }

      if (view == findViewById(R.id.Button2)) {
          fragment=new Fragment2();
          FragmentManager fm=getFragmentManager();
          FragmentTransaction ft=fm.beginTransaction();
          ft.replace(R.id.button2,fragment);
          ft.commit();
      }
      }
  }