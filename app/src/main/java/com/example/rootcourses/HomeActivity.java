package com.example.rootcourses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
 Button androidButton , iosButton , fullStackButton ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        androidButton = findViewById(R.id.android_button);
        iosButton = findViewById(R.id.ios_button);
        fullStackButton = findViewById(R.id.full_stack_button);

        androidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, CourseActivity.class);
                intent.putExtra("courseContext", getString(R.string.android_course));
                intent.putExtra("imageId", R.drawable.android);
                startActivity(intent);
            }
        });

        iosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, CourseActivity.class);
                intent.putExtra("courseContext", getString(R.string.ios_course));
                intent.putExtra("imageId", R.drawable.ios);
                startActivity(intent);
            }
        });

        fullStackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, CourseActivity.class);
                intent.putExtra("courseContext", getString(R.string.full_stack_course));
                intent.putExtra("imageId", R.drawable.full_stack);
                startActivity(intent);
            }
        });
    }
}