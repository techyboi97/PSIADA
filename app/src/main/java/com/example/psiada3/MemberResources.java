package com.example.psiada3;

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
    public Button who_button;
    public Button punc_button;
    public Button web_button;
    public Button cal_button;
    public Button inte_button;

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
                String face_url = "https://www.facebook.com/PSIADA/";
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
                String insta_url = "https://www.instagram.com/pennstatemun/?hl=en";
                Intent insta_n = new Intent(Intent.ACTION_VIEW);
                insta_n.setData(Uri.parse(insta_url));
                startActivity(insta_n);
            }
        });
    }

    public void we_are(){
        who_button=findViewById(R.id.who);
        who_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String who_link = "https://documentcloud.adobe.com/link/track?uri=urn%3Aaaid%3Ascds%3AUS%3A4d529b43-1083-4deb-81d3-b69036447138";
                Intent whoIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(who_link));
                startActivity(whoIntent);
            }
        });
    }

    public void website(){
        web_button=findViewById(R.id.website);
        web_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String web_link = "https://psiada.org/";
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(web_link));
                startActivity(webIntent);
            }
        });
    }

    public void calendar(){
        cal_button=findViewById(R.id.cal);
        cal_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cal_link = "https://calendar.google.com/calendar/embed?src=psiada.org_c11g5i1fhf26hsp2er760urrc8@group.calendar.google.com&ctz=America/New_York";
                Intent calIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(cal_link));
                startActivity(calIntent);
            }
        });
    }

    public void inte(){
        inte_button=findViewById(R.id.inte);
        inte_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inte_link = "https://docs.google.com/forms/d/e/1FAIpQLSeW1eDKTxNAvnoPkn-jhtctfQL9NYbiUClnqunzvZ43dxWFvA/viewform";
                Intent inteIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(inte_link));
                startActivity(inteIntent);
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
        we_are();
        website();
        calendar();
        inte();
    }
}
