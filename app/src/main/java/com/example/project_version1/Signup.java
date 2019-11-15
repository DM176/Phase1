package com.example.project_version1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Signup extends AppCompatActivity {

    boolean checked;
    ImageView show;
    TextView Conditions;
    EditText password;
    TextView SignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Conditions=(TextView) findViewById(R.id.tv3);
        show=(ImageView) findViewById(R.id.imageView2);
        password=(EditText) findViewById(R.id.editText2);
        SignIn=(TextView)findViewById(R.id.AlreadyMember);
        checked=true;
        Conditions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent L=new Intent(getApplicationContext(),terms_and_conditions.class);
                startActivity(L);
            }
        });
        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent L=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(L);
            }
        });
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checked==true)
                {
                    password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    checked=false;
                }
                else
                {
                    password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    checked=true;
                }

            }
        });
    }
}
