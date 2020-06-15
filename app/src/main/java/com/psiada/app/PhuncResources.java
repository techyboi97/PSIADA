package com.psiada.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PhuncResources extends AppCompatActivity {

    public Button face_button;
    public Button insta_button;
    public Button contact_button;
    public Button survival_button;
    public Button map_button;
    public Button policies_button;
    public Button social_button;
    public Button room_button;


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

    public void survival_nav(){
        survival_button=findViewById(R.id.survival);
        survival_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sur_n = new Intent(Intent.ACTION_VIEW);
                sur_n.setData(Uri.parse(getString(R.string.survival_url)));
                startActivity(sur_n);
            }
        });
    }

    public void policies_nav(){
        policies_button=findViewById(R.id.pol);
        policies_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pol_n = new Intent(Intent.ACTION_VIEW);
                pol_n.setData(Uri.parse(getString(R.string.pol_url)));
                startActivity(pol_n);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phunc_resources);
        face_nav();
        insta_nav();
        contact();
        room_nav();
        map_nav();
        social_nav();
        policies_nav();
        survival_nav();
    }
}
