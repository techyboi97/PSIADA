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
                String face_url = "https://www.facebook.com/phuncpsu/";
                Intent face_n = new Intent(Intent.ACTION_VIEW);
                face_n.setData(Uri.parse(face_url));
                startActivity(face_n);
            }
        });
    }

    public void insta_nav(){
        insta_button=findViewById(R.id.insta);
        insta_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String insta_url = "https://www.instagram.com/phuncvii/";
                Intent insta_n = new Intent(Intent.ACTION_VIEW);
                insta_n.setData(Uri.parse(insta_url));
                startActivity(insta_n);
            }
        });
    }

    public void contact(){
        contact_button=findViewById(R.id.contact);
        contact_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String conurl = "https://drive.google.com/open?id=1XaAaFHX7ObqaBvlLso_-UzKH4-AzPl9ACKdtV2cRI1A";
                Intent con_n = new Intent(Intent.ACTION_VIEW);
                con_n.setData(Uri.parse(conurl));
                startActivity(con_n);
            }
        });
    }

    public void room_nav(){
        room_button=findViewById(R.id.sched);
        room_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String room_url = "https://drive.google.com/open?id=1wLH3quwKNDTPo9bTMljFmW2vi5nUElMxyy7_BAfFnQU";
                Intent room_n = new Intent(Intent.ACTION_VIEW);
                room_n.setData(Uri.parse(room_url));
                startActivity(room_n);
            }
        });
    }

    public void map_nav(){
        map_button=findViewById(R.id.map);
        map_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String map_url = "https://drive.google.com/open?id=1D6jEOOagStCWYLe2dmbTyeptapaGXriZ";
                Intent map_n = new Intent(Intent.ACTION_VIEW);
                map_n.setData(Uri.parse(map_url));
                startActivity(map_n);
            }
        });
    }

    public void social_nav(){
        social_button=findViewById(R.id.social);
        social_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String social_url = "https://drive.google.com/open?id=1JaBN_c-FOe4piB3Iz5Hp5pkbu0MVae1P8lHGL4g5sOU";
                Intent social_n = new Intent(Intent.ACTION_VIEW);
                social_n.setData(Uri.parse(social_url));
                startActivity(social_n);
            }
        });
    }

    public void survival_nav(){
        survival_button=findViewById(R.id.survival);
        survival_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sur_url = "https://drive.google.com/open?id=1VSHkaFqrk6d2AwFpbDYuSRzc9WjyBkxz7aG5Kh0S-Fc";
                Intent sur_n = new Intent(Intent.ACTION_VIEW);
                sur_n.setData(Uri.parse(sur_url));
                startActivity(sur_n);
            }
        });
    }

    public void policies_nav(){
        policies_button=findViewById(R.id.pol);
        policies_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pol_url = "https://drive.google.com/open?id=16c8HcmlCeuDz_NhrTPCTzbtORgg1AcM3DyDjamOAPa4";
                Intent pol_n = new Intent(Intent.ACTION_VIEW);
                pol_n.setData(Uri.parse(pol_url));
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
