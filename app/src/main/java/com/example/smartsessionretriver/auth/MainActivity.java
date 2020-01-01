package com.example.smartsessionretriver.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.smartsessionretriver.R;
import com.example.smartsessionretriver.classroom.ClassRoom;
import com.example.smartsessionretriver.meetings.Meetings;
import com.example.smartsessionretriver.workshop.Workshop;

public class MainActivity extends AppCompatActivity {

    Button btn_meeting, btn_workshop, btn_classroom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_meeting = findViewById(R.id.btn_meeting);
        btn_classroom=findViewById(R.id.btn_classroom);
        btn_workshop=findViewById(R.id.btn_workshop);

        btn_workshop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                workshop();
            }
        });

        btn_meeting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Meeting();
            }
        });

        btn_classroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                classroom();
            }
        });
    }

    public  void Meeting(){
        Intent intent = new Intent(this, Meetings.class);
        startActivity(intent);
    }

    public void workshop(){
        Intent intent = new Intent(this, Workshop.class);
        startActivity(intent);
    }

    public void classroom(){
        Intent intent = new Intent(this, ClassRoom.class);
        startActivity(intent);
    }


}
