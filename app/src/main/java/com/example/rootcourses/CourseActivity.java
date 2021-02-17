package com.example.rootcourses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class CourseActivity extends AppCompatActivity {
 TextView courseContext ;
 ImageView courseImage ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        courseContext = findViewById(R.id.course_text);
        courseImage = findViewById(R.id.course_image);
      Log.e("e","data is"+ getIntent().getStringExtra("courseContext"));
      courseContext.setText(getIntent().getStringExtra("courseContext"));
      courseImage.setImageResource(getIntent().getIntExtra("imageId",-1));
    }

}