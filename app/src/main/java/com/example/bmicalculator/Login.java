package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText name,email,password,mobileno;
    Button button;
    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String Name = "nameKey";
    public static final String Phone = "phoneKey";
    public static final String Email = "emailKey";
    public static final String Password="passwordKey";

    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

            name=(EditText)findViewById(R.id.name);
            email=(EditText)findViewById(R.id.email);
            password=(EditText)findViewById(R.id.password);
            mobileno=(EditText)findViewById(R.id.phoneno);

            button=(Button)findViewById(R.id.button);
            sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String n  = name.getText().toString();
                    String ph  = email.getText().toString();
                    String e  = password.getText().toString();
                    String f=mobileno.getText().toString();
                    if (TextUtils.isEmpty(n)) {
                        name.setError("Please Enter Your Name");
                        name.requestFocus();
                        return;
                    }
                        if (TextUtils.isEmpty(ph)) {
                            email.setError("Please Enter Your E-mail");
                            email.requestFocus();
                            return;
                        }
                            if (TextUtils.isEmpty(e)) {
                                password.setError("Please Enter Your Password");
                                password.requestFocus();
                                return;
                            }
                                if (TextUtils.isEmpty(f)) {
                                    mobileno.setError("Please Enter Your Mobile No");
                                    mobileno.requestFocus();
                                    return;
                                }



                    Intent intent=new Intent(Login.this, SplashScreen2.class);
                    startActivity (intent);
                    SharedPreferences.Editor editor = sharedpreferences.edit();

                    editor.putString(Name, n);
                    editor.putString(Phone, f);
                    editor.putString(Email, ph);
                    editor.putString(Password,e);
                    editor.commit();
                    Toast.makeText(Login.this ,"Thanks", Toast.LENGTH_SHORT).show();
                }
            });
        }

    }


