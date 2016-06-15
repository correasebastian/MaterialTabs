package com.scm.materialtabs.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.scm.materialtabs.R;
import com.scm.materialtabs.tabs.IconTabs;
import com.scm.materialtabs.tabs.TextTabs;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Toolbar toolbar;
    private Button btnSimpleTabs;
    private Intent i;
    private Button btnIconTabs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnSimpleTabs = (Button) findViewById(R.id.btnSimpleTabs);
        btnIconTabs = (Button) findViewById(R.id.btnIconTabs);

        btnSimpleTabs.setOnClickListener(this);
        btnIconTabs.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()){
            case R.id.btnSimpleTabs:
                i = new Intent(MainActivity.this,TextTabs.class);

                break;
            case R.id.btnIconTabs:
                i= new Intent(MainActivity.this,IconTabs.class);

                break;
        }
        startActivity(i);
    }
}
