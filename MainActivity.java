package com.example.myfitnessapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myfitnessapp.R;

public class MainActivity extends AppCompatActivity {

    String[] exercises = {"Push-ups", "Squats", "Lunges", "Plank", "Jump Rope", "Burpees", "Cycling", "Running"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView exerciseListView = findViewById(R.id.exerciseListView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, exercises);
        exerciseListView.setAdapter(adapter);

        exerciseListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedExercise = exercises[position];
                Toast.makeText(MainActivity.this, "Let's do " + selectedExercise, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

