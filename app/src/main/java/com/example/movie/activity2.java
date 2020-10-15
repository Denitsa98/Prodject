package com.example.movie;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class activity2 extends AppCompatActivity {

    TextView name2, genre2, year2, actor2, resume2;
    ImageView image2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        ActionBar actionBar = getSupportActionBar();

         name2 = findViewById(R.id.textV);
         genre2 = findViewById(R.id.textV2);
         year2 = findViewById(R.id.textV3);
         actor2 = findViewById(R.id.textV4);
         resume2 = findViewById(R.id.textV5);
         image2 = findViewById(R.id.imageV2);

         Intent intent=getIntent();

         String name=intent.getStringExtra("iTitle");
         String genre=intent.getStringExtra("iGenre");
         String year=intent.getStringExtra("iYear");
         String actor=intent.getStringExtra("iActor");
         String resume=intent.getStringExtra("iResume");
         String imageURL=intent.getStringExtra("iImage");

         actionBar.setTitle(name);

         name2.setText(name);
         genre2.setText(genre);
         year2.setText(year);
         actor2.setText(actor);
         resume2.setText(resume);
         Picasso.get().load(imageURL).into(image2);
    }
}
