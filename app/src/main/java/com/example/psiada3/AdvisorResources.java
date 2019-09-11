package com.example.psiada3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdvisorResources extends AppCompatActivity {

    public Button face_button;
    public Button insta_button;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advisor_resources);
        face_nav();
        insta_nav();
    }
}
