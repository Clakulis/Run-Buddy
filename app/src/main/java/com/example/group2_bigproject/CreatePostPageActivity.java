package com.example.group2_bigproject;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.bumptech.glide.Glide;

public class CreatePostPageActivity extends AppCompatActivity {
    private SharedPreferencesHelper spHelper;
    TextView createPostPageBackButton;
    TextView createPostButton;
    ConstraintLayout createPostResultDisplay;
    ConstraintLayout createPostRouteDisplay;
    EditText contentEditText;
    TextView resultDisplayDetailText;
    TextView routeNameTextView;
    private String userID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_post_page);
        spHelper = new SharedPreferencesHelper(this);
        userID = spHelper.getSessionID();
        createPostPageBackButton = findViewById(R.id.createPostPageBackButton);
        createPostButton = findViewById(R.id.createPostButton);
        createPostResultDisplay = findViewById(R.id.createPostResultDisplay);
        createPostRouteDisplay = findViewById(R.id.createPostRouteDisplay);
        contentEditText = findViewById(R.id.contentEditText);
        resultDisplayDetailText = findViewById(R.id.resultDisplayDetailText);
        routeNameTextView = findViewById(R.id.routeNameTextView);

        String format = getIntent().getStringExtra("format");
        String routeID = getIntent().getStringExtra("routeID");
        Log.d("ROUTE ID IS FROM CREATEPOST", routeID);

        if(format.equals("result")){
            createPostResultDisplay.setVisibility(View.VISIBLE);
        } else {
            createPostRouteDisplay.setVisibility(View.VISIBLE);
        }
        createPostPageBackButton.setOnClickListener(v -> finish());
        createPostButton.setOnClickListener(v -> finish());
    }
}