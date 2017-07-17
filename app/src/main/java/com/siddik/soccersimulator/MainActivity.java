package com.siddik.soccersimulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    private Animation transAnimation;

    @BindView(R.id.imageViewSoccer)
    ImageView imageView;

    @OnClick(R.id.button_start)
    public void start(View v){
        goToActivity(SelectionPagerActivity.class);
    }

    @OnClick(R.id.button_menu)
    public void goMenu(View v){
        goToActivity(MenuActivity.class);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    public void spinBall(View v){
        imageView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.anim_rotate));
    }

    public void showPlayer(View v){
        shortToast("Player");
    }

}
