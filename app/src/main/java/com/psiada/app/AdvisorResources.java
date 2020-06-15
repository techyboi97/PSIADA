package com.psiada.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdvisorResources extends AppCompatActivity {

    public Button face_button;
    public Button insta_button;
    public Button contact_button;
    public Button food_button;
    public Button room_button;
    public Button social_button;
    public Button map_button;
    public Button charity_button;
    public Button merchandise_button;
    public Button form_button;
    public Button guide_button;

    public void guide_nav(){
        guide_button=findViewById(R.id.guide);
        guide_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent guide_n = new Intent(Intent.ACTION_VIEW);
                guide_n.setData(Uri.parse(getString(R.string.advisor_guide_url)));
                startActivity(guide_n);
            }
        });
    }

    public void face_nav(){
        face_button=findViewById(R.id.face);
        face_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent face_n = new Intent(Intent.ACTION_VIEW);
                face_n.setData(Uri.parse(getString(R.string.face_url)));
                startActivity(face_n);
            }
        });
    }

    public void insta_nav(){
        insta_button=findViewById(R.id.insta);
        insta_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent insta_n = new Intent(Intent.ACTION_VIEW);
                insta_n.setData(Uri.parse(getString(R.string.insta_url)));
                startActivity(insta_n);
            }
        });
    }

    public void merch_nav(){
        merchandise_button=findViewById(R.id.merch);
        merchandise_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent merch_n = new Intent(Intent.ACTION_VIEW);
                merch_n.setData(Uri.parse(getString(R.string.merch_url)));
                startActivity(merch_n);
            }
        });
    }

    public void form_nav(){
        form_button=findViewById(R.id.form);
        form_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form_n = new Intent(Intent.ACTION_VIEW);
                form_n.setData(Uri.parse(getString(R.string.advisor_form_url)));
                startActivity(form_n);
            }
        });
    }

    public void charity_nav(){
        charity_button=findViewById(R.id.charity);
        charity_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent charity_n = new Intent(Intent.ACTION_VIEW);
                charity_n.setData(Uri.parse(getString(R.string.charity_url)));
                startActivity(charity_n);
            }
        });
    }

    public void social_nav(){
        social_button=findViewById(R.id.social);
        social_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent social_n = new Intent(Intent.ACTION_VIEW);
                social_n.setData(Uri.parse(getString(R.string.social_url)));
                startActivity(social_n);
            }
        });
    }

    public void map_nav(){
        map_button=findViewById(R.id.map);
        map_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent map_n = new Intent(Intent.ACTION_VIEW);
                map_n.setData(Uri.parse(getString(R.string.map_url)));
                startActivity(map_n);
            }
        });
    }

    public void room_nav(){
        room_button=findViewById(R.id.sched);
        room_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent room_n = new Intent(Intent.ACTION_VIEW);
                room_n.setData(Uri.parse(getString(R.string.room_url)));
                startActivity(room_n);
            }
        });
    }

    public void contact(){
        contact_button=findViewById(R.id.contact);
        contact_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent con_n = new Intent(Intent.ACTION_VIEW);
                con_n.setData(Uri.parse(getString(R.string.contact_url)));
                startActivity(con_n);
            }
        });
    }

    public void food_nav(){
        food_button=findViewById(R.id.food);
        food_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent food_n = new Intent(Intent.ACTION_VIEW);
                food_n.setData(Uri.parse(getString(R.string.foodurl)));
                startActivity(food_n);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advisor_resources);
        face_nav();
        insta_nav();
        form_nav();
        merch_nav();
        food_nav();
        map_nav();
        contact();
        room_nav();
        charity_nav();
        social_nav();
        guide_nav();
    }
}
