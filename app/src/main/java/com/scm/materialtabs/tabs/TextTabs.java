package com.scm.materialtabs.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.scm.materialtabs.R;
import com.scm.materialtabs.adapters.TextTabsAdapter;
import com.scm.materialtabs.fragments.FragmentOne;
import com.scm.materialtabs.fragments.FragmentThree;
import com.scm.materialtabs.fragments.FragmentTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by scm on 6/14/16.
 */
public class TextTabs extends AppCompatActivity {

    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> titleList = new ArrayList<>();
    private ViewPager viewPager;
    private TextTabsAdapter adapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_tabs);

        initialise();
        prepareDataResource();
        adapter = new TextTabsAdapter(getSupportFragmentManager(),fragmentList,titleList);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        
        setTabIcons();
    }

    private void setTabIcons() {
        tabLayout.getTabAt(0).setIcon(R.drawable.facebook);
        tabLayout.getTabAt(1).setIcon(R.drawable.googleplus);

        tabLayout.getTabAt(2).setIcon(R.drawable.twitter);
    }

    private void initialise() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarSimpleTabs);
        toolbar.setTitle("Simple tabs view");

        viewPager = (ViewPager) findViewById(R.id.viewPagerSimpleTabs);
        tabLayout = (TabLayout) findViewById(R.id.tabs);

    }

    private void prepareDataResource() {

        addData(new FragmentOne(),"ONE");
        addData(new FragmentTwo(), "TWO");
        addData(new FragmentThree(), "THREE");

    }

    private void addData(Fragment fragment , String title){
        fragmentList.add(fragment);
        titleList.add(title);
    }
}
