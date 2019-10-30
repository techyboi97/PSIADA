package com.example.psiada3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button member_button;
    public Button delegate_button;
    public Button advisor_button;

    public void member(){
        member_button = findViewById(R.id.member);
        member_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent password_page_nav = new Intent(MainActivity.this, MemberPassword.class);

                startActivity(password_page_nav);

            }
        });
    }

    public void delegate(){
        delegate_button = findViewById(R.id.delegate);
        delegate_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent delegate_page_nav = new Intent(MainActivity.this, DelegateResources.class);

                startActivity(delegate_page_nav);

            }
        });
    }

    public void advisor(){
        advisor_button = findViewById(R.id.advisor);
        advisor_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent password_page_nav = new Intent(MainActivity.this, AdvisorResources.class);

                startActivity(password_page_nav);

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        member();
        delegate();
        advisor();
    }
}
