package com.myhexaville.cards;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;

import com.myhexaville.cards.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);
        setSupportActionBar(binding.toolbar);

        binding.pager.setAdapter(new Adapter(getSupportFragmentManager()));
        binding.tabs.setCustomTabView((container, position, adapter) ->
                LayoutInflater.from(this).inflate(R.layout.tab, container, false));
        binding.tabs.setViewPager(binding.pager);


    }

}