package com.nerdcutlet.bunkometer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    //Widgets
    Button button_mon, button_tue, button_wed, button_thu, button_fri;
    TextView textView_mon, textView_tue, textView_wed, textView_thu, textView_fri;

    //Class Variables
    int num_mon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef = database.getReference("days");


        //Views
        button_mon = (Button) findViewById(R.id.mon);
        textView_mon = (TextView) findViewById(R.id.mon_text);

        button_tue = (Button) findViewById(R.id.tue);
        textView_tue = (TextView) findViewById(R.id.tue_text);

        button_wed = (Button) findViewById(R.id.wed);
        textView_wed = (TextView) findViewById(R.id.wed_text);

        button_thu = (Button) findViewById(R.id.thu);
        textView_thu = (TextView) findViewById(R.id.thu_text);

        button_fri = (Button) findViewById(R.id.fri);
        textView_fri = (TextView) findViewById(R.id.fri_text);


        //Actions
        button_mon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_mon = num_mon + 1;
                myRef.setValue(num_mon);

                textView_mon.setText("" + num_mon);
            }
        });

    }

}
