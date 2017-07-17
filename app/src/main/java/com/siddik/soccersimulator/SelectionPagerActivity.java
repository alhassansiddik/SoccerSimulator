package com.siddik.soccersimulator;

import android.support.v4.app.Fragment;
import android.support.v4.util.Pair;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.view.View;

import com.siddik.soccersimulator.adapter.ViewFragmentStateAdapter;
import com.siddik.soccersimulator.fragment.AwayFragment;
import com.siddik.soccersimulator.fragment.HomeFragment;
import com.siddik.soccersimulator.fragment.SimulateFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SelectionPagerActivity extends BaseActivity {

    private ArrayList<Pair<String, Fragment>> list = new ArrayList<Pair<String, Fragment>>();

    @BindView(R.id.activity_advance_view_pager_tablayout)
    TabLayout tabLayout;

    @BindView(R.id.activity_advance_view_pager)
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_pager);
        ButterKnife.bind(this);
        list.add(new Pair<String, Fragment>("Home", new HomeFragment()));
        list.add(new Pair<String, Fragment>("Away", new AwayFragment()));
        list.add(new Pair<String, Fragment>("Simulate", new SimulateFragment()));
        ViewFragmentStateAdapter adapter = new ViewFragmentStateAdapter(this.getSupportFragmentManager(), list);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    public void goSimulate(View v){
        goToActivity(SimulatorActivity.class);
    }

}
