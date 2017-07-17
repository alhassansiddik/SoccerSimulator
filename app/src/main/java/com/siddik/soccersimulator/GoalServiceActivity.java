package com.siddik.soccersimulator;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.siddik.soccersimulator.service.TestService;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class GoalServiceActivity extends BaseActivity {
    @BindView(R.id.activity_service_tv)
    TextView textView;

    private TestReceiver testReceiever;

    @OnClick(R.id.activity_service_start)
    public void startService(View v){
        Intent intent = new Intent(this, TestService.class);
        intent.putExtra("Service", "Start");
        startService(intent);
        registerBroadcast();
    }

    @OnClick(R.id.activity_service_stop)
    public void stopService(View v){
        Intent intent = new Intent(this, TestService.class);
        intent.putExtra("Service", "Stop");
        stopService(intent);
        //stopBroadcast();
    }

    private void registerBroadcast() {
        testReceiever = new TestReceiver();
        IntentFilter filter = new IntentFilter();
        filter.addAction(TestService.ACTION);
        registerReceiver(testReceiever,filter);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal_service);
        ButterKnife.bind(this);
    }

    public class TestReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent){
            String action = intent.getAction();
            if(action.equals(TestService.ACTION)){
                int update = intent.getIntExtra("update",0);
                textView.setText(String.valueOf(update));}
//            }else if(action.equals(TestService.SACTION)){
//                textView.setText(0);
//            }
        }
    }

}
