package com.belatrix.android.classandroidlesson2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Flavio Franco Tunqui (VLEIX) on 1/16/17.
 * GOOODK
 */
public class ActivityB extends AppCompatActivity implements View.OnClickListener {

    Button btnGoC;
    Button btnGoD;
    Button btnGoE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        initViews();
    }

    private void initViews(){
        btnGoC = (Button)findViewById(R.id.btnGoC);
        btnGoD = (Button)findViewById(R.id.btnGoD);
        btnGoE = (Button)findViewById(R.id.btnGoE);

        btnGoC.setOnClickListener(this);
        btnGoD.setOnClickListener(this);
        btnGoE.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnGoC:
                startActivity(new Intent(getApplicationContext(), ActivityC.class));
                break;

            case R.id.btnGoD:
                startActivity(new Intent(getApplicationContext(), ActivityD.class));
                break;

            case R.id.btnGoE:
                startActivity(new Intent(getApplicationContext(), ActivityE.class));
                break;
            default:
                break;
        }
    }
}
