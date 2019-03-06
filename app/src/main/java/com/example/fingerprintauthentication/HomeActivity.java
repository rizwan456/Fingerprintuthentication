package com.example.fingerprintauthentication;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.fingerprintauthentication.databinding.HomeACtivityBinding;

public class HomeActivity extends AppCompatActivity {

    HomeACtivityBinding homeACtivityBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_home);
        homeACtivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_home);

        homeACtivityBinding.homeTXT.setText(getIntent().getStringExtra("Title"));
    }
}
