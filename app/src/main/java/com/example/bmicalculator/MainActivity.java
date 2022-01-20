package com.example.bmicalculator;
import android.app.MediaRouteButton;
import android.content.Context;
import android.content.Intent;
import android.os.Build;


import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStructure;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import java.text.DecimalFormat;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {
    public Context context;

    TextView txt;
    RadioGroup radiogrp;
    RadioButton radioButton;
    Button btn;
    private Object Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText weight = (EditText) findViewById(R.id.weight);
        final EditText height = (EditText) findViewById(R.id.height);
        final TextView txt = (TextView) findViewById(R.id.result);

       /* myButtonListenerMethod();
        radiogrp = findViewById(R.id.radiogrp);
        btn = findViewById(R.id.btn);
        txt = findViewById(R.id.txt);
*/

/*
    }

    public void myButtonListenerMethod() {
        Button button = findViewById(R.id.btn);
*/

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                String str1 = height.getText().toString();
                String str2 = weight.getText().toString();

              /*  int id = radiogrp.getCheckedRadioButtonId();
                radioButton = findViewById(id);
                txt.setText("" + radioButton.getText());*/

                if (TextUtils.isEmpty(str1)) {
                    height.setError("Please Enter Your Height");
                    height.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(str2)) {
                    weight.setError("Please Enter Your Weight");
                    weight.requestFocus();
                    return;
                }
                float height = Float.parseFloat(str1)/100;
                float weight = Float.parseFloat(str2);
                float bmiValue = calculateBMI(height, weight);
                String bmiInterpretation = interpretBMI(bmiValue);
                txt.setText(String.valueOf(bmiValue + "-" + bmiInterpretation));
            }
        });
    }

            /*    {
                if (!TextUtils.isEmpty(height.getText().toString() && !TextUtils.isEmpty(weight.getText().toString())))
                    ;
                ViewStructure result;
                result.setVisibility(View.VISIBLE);
                result.setText(height.getText().toString());
                result.setText(weight.getText().toString());
            }else

            {
                Toast.makeText(context, "Please enter something", Toast.LENGTH_LONG).show();
                MediaRouteButton result;
                result.setVisibility(View.GONE);
            }*/

    private float calculateBMI(float height, float weight) {
        return (float) (weight / (height * height));
    }

    private String interpretBMI(float bmiValue) {


       /* final EditText heightText = findViewById(R.id.height);
        String heightStr = heightText.getText().toString();
        double height = Double.parseDouble(heightStr);
        double heightM = height / 100;
        final EditText weightText = findViewById(R.id.weight);
        String weightStr = weightText.getText().toString();
        double weight = Double.parseDouble(weightStr);
        double BMI = (weight) / (heightM * heightM);
        DecimalFormat df = new DecimalFormat("#.#");
        double BMI_trimmed = Double.parseDouble(df.format(BMI));
        final TextView BMIResult = findViewById(R.id.result);
        BMIResult.setText(Double.toString(BMI_trimmed));
        String BMI_Cat;*/


        if (bmiValue < 16) {
            return "Very severely underweight";
        } else if (bmiValue < 18.5) {
            return "Under Weight";
        } else if (bmiValue < 25) {
            return "Normal";
        } else if (bmiValue < 30) {
            return "Over Weight";
        } else {
            return "Obese";
        }
    }


     /*   final TextView BMICategory = findViewById(R.id.bmiCat);
        BMICategory.setText(BMI_Cat);*/




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater= getMenuInflater();
        menuInflater.inflate(R.menu.options_menu_items,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id=item.getItemId();

        if(id==R.id.item1){
            Intent intent=new Intent(MainActivity.this, BmiChart.class);
            startActivity (intent);
            return true;
        }
        else if(id==R.id.item2){
            Intent intent=new Intent(MainActivity.this,BmiSuggestion.class);
            startActivity(intent);
            return true;
        }
        else if(id==R.id.item3) {
            Intent intent = new Intent(MainActivity.this, About.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);

        /*switch(item.getItemId()){
            case R.id.item1:
                Toast.makeText(this,"Please select items",Toast.LENGTH_SHORT).show();

                return true;

                case R.id.item2:
                    Toast.makeText(this,"Please select items",Toast.LENGTH_SHORT).show();
                    return true;


                 case R.id.item3:
                  Toast.makeText(this,"Please select items",Toast.LENGTH_SHORT).show();
                  return true;


        }
        return super.onOptionsItemSelected(item);*/

    }


}
