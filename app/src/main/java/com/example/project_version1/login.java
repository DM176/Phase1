package com.example.project_version1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class login extends AppCompatActivity {


        ImageView show;
        Button login;
        TextView newhere;
        TextView forgot;
        EditText Email;
        EditText password;
        CheckBox Show;
        Boolean checked;
       
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);
            show=(ImageView) findViewById(R.id.imageView);
            checked=true;
            newhere=(TextView) findViewById(R.id.newmember);
            Email=(EditText) findViewById(R.id.email);
            password=(EditText) findViewById(R.id.password);
            login=(Button)findViewById(R.id.log);
            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent L=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(L);
                }
            });
            newhere.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v)
                {
                    Intent L=new Intent(getApplicationContext(),Signup.class);
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
