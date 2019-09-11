package com.example.psiada3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AdvisorPassword extends AppCompatActivity {

    public Button submit_button;
    public EditText passwordInput;
    String password;

    public String globalPassword = "WeAreMentors";

    public void submit(){
        submit_button = findViewById(R.id.submit);
        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                passwordInput = (EditText) findViewById(R.id.password);
                password = passwordInput.getText().toString();

                if (password.equals(globalPassword)) {
                    Intent password_page_nav = new Intent(AdvisorPassword.this, AdvisorResources.class);

                    startActivity(password_page_nav);
                }
            };
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advisor_password);
        submit();
    }
}
