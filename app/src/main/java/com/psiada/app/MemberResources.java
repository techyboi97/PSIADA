package com.psiada.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MemberResources extends AppCompatActivity {

    public Button phunc_button;
    public Button face_button;
    public Button insta_button;
    public Button punc_button;
    public Button web_button;
    public Button cal_button;
    public Button inte_button;
    public Button contact_button;

    public void phunc_nav(){
        phunc_button = findViewById(R.id.phunc);
        phunc_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent phunc_page_nav = new Intent(MemberResources.this, PhuncResources.class);

                startActivity(phunc_page_nav);

            }
        });
    }

    public void punc_nav(){
        punc_button = findViewById(R.id.punc);
        punc_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent punc_page_nav = new Intent(MemberResources.this, PuncResources.class);

                startActivity(punc_page_nav);

            }
        });
    }

    public void face_nav(){
        face_button=findViewById(R.id.face);
        face_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent face_n = new Intent(Intent.ACTION_VIEW);
                face_n.setData(Uri.parse(getString(R.string.psiada_face_url)));
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
                insta_n.setData(Uri.parse(getString(R.string.psiada_insta_url)));
                startActivity(insta_n);
            }
        });
    }


    public void website(){
        web_button=findViewById(R.id.website);
        web_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.web_link)));
                startActivity(webIntent);
            }
        });
    }

    public void calendar(){
        cal_button=findViewById(R.id.cal);
        cal_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.cal_link)));
                startActivity(calIntent);
            }
        });
    }

    public void inte(){
        inte_button=findViewById(R.id.integrity);
        inte_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inteIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.inte_link)));
                startActivity(inteIntent);
            }
        });
    }

    public void contact(){
        contact_button=findViewById(R.id.contact);
        contact_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String con_link = "mailto:president@psiada.org";
                Intent conIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(con_link));
                startActivity(conIntent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_resources);
        phunc_nav();
        punc_nav();
        face_nav();
        insta_nav();
        website();
        calendar();
        inte();
        contact();
    }
}
