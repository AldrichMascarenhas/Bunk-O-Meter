package com.nerdcutlet.bunkometer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    //Widgets
    Button button_mon, button_tue, button_wed, button_thu, button_fri;
    TextView textView_mon, textView_tue, textView_wed, textView_thu, textView_fri;

    //Class Variables
    Long num_mon = 0L;
    Long num_tue = 0L;
    Long num_wed = 0L;
    Long num_thu = 0L;
    Long  num_fri = 0L;

    // Write a message to the database
    FirebaseDatabase database = FirebaseDatabase.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        //MONDAY
        final DatabaseReference mon = database.getReference("mon");

        mon.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    num_mon = (Long) dataSnapshot.getValue();
                    textView_mon.setText("" + num_mon);
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        button_mon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_mon = num_mon + 1;
                mon.setValue(num_mon);

                textView_mon.setText("" + num_mon);
            }
        });


        //TUESDAY


        final DatabaseReference tue = database.getReference("tue");

        tue.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    num_tue = (Long) dataSnapshot.getValue();
                    textView_tue.setText("" + num_tue);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        button_tue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_tue = num_tue + 1;
                tue.setValue(num_tue);

                textView_tue.setText("" + num_tue);
            }
        });

        //WEDNESDAY

        final DatabaseReference wed = database.getReference("wed");

        wed.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    num_wed = (Long) dataSnapshot.getValue();
                    textView_wed.setText("" + num_wed);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        button_wed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_wed = num_wed + 1;
                wed.setValue(num_wed);

                textView_wed.setText("" + num_wed);
            }
        });

        //THURSDAY

        final DatabaseReference thu = database.getReference("thu");

        thu.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    num_thu = (Long) dataSnapshot.getValue();
                    textView_thu.setText("" + num_thu);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        button_thu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_thu = num_thu + 1;
                thu.setValue(num_thu);

                textView_thu.setText("" + num_thu);
            }
        });

        //FRIDAY

        final DatabaseReference fri = database.getReference("fri");

        fri.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    num_fri = (Long) dataSnapshot.getValue();
                    textView_fri.setText("" + num_fri);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        button_fri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_fri = num_fri + 1;
                fri.setValue(num_fri);

                textView_fri.setText("" + num_fri);
            }
        });

    }

}
