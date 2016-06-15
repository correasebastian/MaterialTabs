package com.scm.materialtabs.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.scm.materialtabs.R;
import com.scm.materialtabs.adapters.ScrollTabsAdapter;
import com.scm.materialtabs.adapters.TextTabsAdapter;
import com.scm.materialtabs.fragments.FragmentOne;
import com.scm.materialtabs.fragments.FragmentThree;
import com.scm.materialtabs.fragments.FragmentTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by scm on 6/14/16.
 */
public class ScrollTabs extends AppCompatActivity {

    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> titleList = new ArrayList<>();
    private ViewPager viewPager;
    private ScrollTabsAdapter adapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_tabs);

        initialise();
        prepareDataResource();
        adapter = new ScrollTabsAdapter(getSupportFragmentManager(),fragmentList,titleList);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }



    private void initialise() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarSimpleTabs);
        toolbar.setTitle("Scroll tabs example");

        viewPager = (ViewPager) findViewById(R.id.viewPagerSimpleTabs);
        tabLayout = (TabLayout) findViewById(R.id.tabs);

    }

    private void prepareDataResource() {

        addData(new FragmentOne(),"ONE");
        addData(new FragmentTwo(), "TWO");
        addData(new FragmentThree(), "THREE");
        addData(new FragmentOne(),"FOUR");
        addData(new FragmentTwo(), "FIVE");
        addData(new FragmentThree(), "SIX");
        addData(new FragmentOne(),"SEVEN");
        addData(new FragmentTwo(), "EIGHT");
        addData(new FragmentThree(), "NINE");

    }

    private void addData(Fragment fragment , String title){
        fragmentList.add(fragment);
        titleList.add(title);
    }
}
