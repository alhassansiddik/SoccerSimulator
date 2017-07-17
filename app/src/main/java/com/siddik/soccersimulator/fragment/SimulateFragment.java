package com.siddik.soccersimulator.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.siddik.soccersimulator.BaseActivity;
import com.siddik.soccersimulator.R;
import com.siddik.soccersimulator.SimulatorActivity;

import butterknife.ButterKnife;

/**
 * Created by Sidleh on 7/12/2017.
 */

public class SimulateFragment extends Fragment {

    public SimulateFragment(){

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //System.exit(0);
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_simulate, container, false);
    }
}
