package com.siddik.soccersimulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;

public class MenuActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);
    }

    public void goTeams(View v){
        goToActivity(TeamsActivity.class);
    }

    public void goField(View v){
        goToActivity(FieldActivity.class);
    }

    public void goService(View v){
        goToActivity(GoalServiceActivity.class);
    }
}
