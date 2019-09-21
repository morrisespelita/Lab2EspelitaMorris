package com.espelita.lab2espelitamorris;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText etCourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        etCourse = findViewById(R.id.editText9);
    }

    public void validate(View v){
        SharedPreferences sp = getSharedPreferences("myData", MODE_PRIVATE);
        String course1SP = sp.getString("course1", null);
        String course2SP = sp.getString("course2", null);
        String course3SP = sp.getString("course3", null);
        String course4SP = sp.getString("course4", null);
        String course5SP = sp.getString("course5", null);
        String course6SP = sp.getString("course6", null);
        String course7SP = sp.getString("course7", null);
        String course8SP = sp.getString("course8", null);
        String course = etCourse.getText().toString();
        if(course.equals(course1SP) || course.equals(course2SP) || course.equals(course3SP) || course.equals(course4SP) || course.equals(course5SP) || course.equals(course6SP) || course.equals(course7SP) || course.equals(course8SP)){
            Toast.makeText(this, "Course is found in UST...", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Course is not found in UST...", Toast.LENGTH_LONG).show();
        }
    }

    public void prevPage(View v){
        Intent i = new Intent(this, MainActivity.class);
        
        startActivity(i);
    }
}
