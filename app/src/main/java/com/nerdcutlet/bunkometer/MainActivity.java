package com.nerdcutlet.bunkometer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Widgets
    Button button_mon;
    TextView textView_mon;

    //Class Variables
    int num_mon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Views
        button_mon = (Button) findViewById(R.id.mon);
        textView_mon = (TextView) findViewById(R.id.mon_text);

        //Actions
        button_mon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_mon = num_mon + 1;
                textView_mon.setText("" + num_mon);
            }
        });

    }

}
