package com.psiada.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DelegateResources extends AppCompatActivity {

    public Button face_button;
    public Button insta_button;
    public Button contact_button;
    public Button food_button;
    public Button room_button;
    public Button resouce_button;
    public Button social_button;
    public Button map_button;
    public Button charity_button;
    public Button merchandise_button;
    public Button form_button;

    public void merch_nav(){
        merchandise_button=findViewById(R.id.merch);
        merchandise_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String merch_url = "https://drive.google.com/open?id=1KF8zB-1mcIJbkvkH6fazvgVdA8ZIk_DQhBBd_HyXbUI";
                Intent merch_n = new Intent(Intent.ACTION_VIEW);
                merch_n.setData(Uri.parse(merch_url));
                startActivity(merch_n);
            }
        });
    }

    public void resource_nav(){
        resouce_button=findViewById(R.id.resource);
        resouce_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String res_url = "https://drive.google.com/open?id=16c8HcmlCeuDz_NhrTPCTzbtORgg1AcM3DyDjamOAPa4";
                Intent res_n = new Intent(Intent.ACTION_VIEW);
                res_n.setData(Uri.parse(res_url));
                startActivity(res_n);
            }
        });
    }

    public void form_nav(){
        form_button=findViewById(R.id.form);
        form_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String form_url = "https://docs.google.com/forms/d/e/1FAIpQLSeC3SOQpzCMFVwGWWIGE48l4Z1vLG8wbsTbVSBtFYrl0Hd9vg/viewform";
                Intent form_n = new Intent(Intent.ACTION_VIEW);
                form_n.setData(Uri.parse(form_url));
                startActivity(form_n);
            }
        });
    }

    public void charity_nav(){
        charity_button=findViewById(R.id.charity);
        charity_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String charity_url = "https://drive.google.com/open?id=1KtjL6nCtQ_MsYaaNNLa-FTLPp8K1nv0OzqQLjfNfkA4";
                Intent charity_n = new Intent(Intent.ACTION_VIEW);
                charity_n.setData(Uri.parse(charity_url));
                startActivity(charity_n);
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

    public void food_nav(){
        food_button=findViewById(R.id.food);
        food_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String foodurl = "https://documentcloud.adobe.com/link/track?uri=urn%3Aaaid%3Ascds%3AUS%3Adbd51e07-d9d8-40a8-81b4-7aaa8ab5d4ee";
                Intent food_n = new Intent(Intent.ACTION_VIEW);
                food_n.setData(Uri.parse(foodurl));
                startActivity(food_n);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delegate_resources);
        face_nav();
        insta_nav();
        contact();
        food_nav();
        room_nav();
        map_nav();
        merch_nav();
        social_nav();
        charity_nav();
        form_nav();
        resource_nav();
    }
}
