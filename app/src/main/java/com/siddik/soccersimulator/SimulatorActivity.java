package com.siddik.soccersimulator;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.siddik.soccersimulator.dialog.CustomDialog;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SimulatorActivity extends BaseActivity {

    @BindView(R.id.activity_handler_runnable_et)
    EditText editText;

    @BindView(R.id.activity_handler_runnable_bt)
    Button button;

    @BindView(R.id.activity_handler_runnable_winner)
    Button button_winner;



    private View.OnClickListener startListener;
    private View.OnClickListener stopListener;
    private View.OnClickListener resetListener;

    Handler handler = new Handler();
    private int time = 0;

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            time--;
            if(time>0){
                editText.setText(String.valueOf(time));
                handler.postDelayed(runnable,100);

            }

            if(time == 0){
                double random = Math.random();
                if(random > 0.5){
                    shortToast("Arsenal won");
                }else {
                    shortToast("Barca won");
                }

                button.setText("Reset Time");
                button.setOnClickListener(resetListener);
                button_winner.setEnabled(true);
            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simulator);
        ButterKnife.bind(this);

        startListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button.setText("Stop Simulation");
                editText.setEnabled(false);
                button.setOnClickListener(stopListener);
                time = Integer.valueOf(editText.getText().toString());
                handler.postDelayed(runnable,1000);
            }
        };
        stopListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button.setText("Reset Time");
                button.setOnClickListener(resetListener);
                handler.removeCallbacks(runnable);
            }
        };
        resetListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_winner.setEnabled(false);
                button.setText("Start Simulation");
                editText.setText(String.valueOf(90));
                editText.setEnabled(false);
                button.setOnClickListener(startListener);
            }
        };
        button.setOnClickListener(startListener);
    }

    public void showWinner(View v){
        shortToast("Winner is Barcelona");
    }

    public void showCustomDialog(View v){
        CustomDialog customDialog = new CustomDialog(this, new CustomDialog.ICustomDialogListener() {
            @Override
            public void onOKClicked(String msg) {
                shortToast(msg);
            }
        });

        customDialog.setCanceledOnTouchOutside(true);
        customDialog.show();

    }
}
