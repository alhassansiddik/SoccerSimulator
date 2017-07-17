package com.siddik.soccersimulator;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TeamsActivity extends BaseActivity {
    private int checkedID;

    @BindView(R.id.activity_radio_group)
    RadioGroup radioGroup;

    @OnClick(R.id.activity_radio_group_submit)
    public void submit(View view){
        shortToast("Thanks for choosing this team");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teams);
        ButterKnife.bind(this);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int checkedId) {
                checkedID = checkedId;
            }
        });
    }
}
