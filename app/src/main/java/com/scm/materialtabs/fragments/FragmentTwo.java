package com.scm.materialtabs.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.scm.materialtabs.R;

/**
 * Created by scm on 6/14/16.
 */
public class FragmentTwo extends Fragment {

    public FragmentTwo(){
        Log.i("Fragment two ", "created");

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_two,container,false);
    }
}
