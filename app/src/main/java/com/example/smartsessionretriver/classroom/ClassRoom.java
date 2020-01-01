package com.example.smartsessionretriver.classroom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.smartsessionretriver.R;

public class ClassRoom extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_room);
        recyclerView = findViewById(R.id.classRoom_recyclerViews);


    }
}
