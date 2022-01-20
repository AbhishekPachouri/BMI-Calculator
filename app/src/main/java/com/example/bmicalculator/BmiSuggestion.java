package com.example.bmicalculator;

import android.content.Intent;
import android.graphics.Color;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BmiSuggestion extends AppCompatActivity {

    Button button1, button2 ,button3,button4;
    View tvshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_suggestion);

        button1 =findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        tvshow=findViewById(R.id.tvshow);



        /*button=(Button) findViewById(R.id.button);*/
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
       /*         Intent intent=new Intent(BmiSuggestion.this,Normal.class);
                startActivity(intent);
*/
                TextView tvshow=(TextView)findViewById(R.id.tvshow);

                button1.setBackgroundColor(Color.GREEN);
                button1.setTextColor(Color.WHITE);
                tvshow.setText("A Normal BMI score is one that falls between 18.5 and 24.5 .This indicates that a person is within the normal weight range for his/her height.A BMI chart is used to categorize a person as underweight,normal,overweight and obese.");
            }
        });

       /* button=(Button) findViewById(R.id.button1);*/
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* Intent intent=new Intent(BmiSuggestion.this,UnderWeight.class);
                startActivity(intent);*/
                TextView tvshow=(TextView)findViewById(R.id.tvshow);

                button2.setBackgroundColor(Color.GREEN);
                button2.setTextColor(Color.WHITE);
                tvshow.setText("Under weight although being lean can often be healthy, being underweight can be a concern if it's the result of poor nutrition or if you are pregnant or have other health concerns.So,if you're underweight, see your doctor or dietitian for an evalution.Together, you can plan how to meet your goal weight .");


            }
        });
       /* button=(Button) findViewById(R.id.button2);*/
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              /*  Intent intent=new Intent(BmiSuggestion.this,OverWeight.class);
                startActivity(intent);*/
                TextView tvshow=(TextView)findViewById(R.id.tvshow);

                button3.setBackgroundColor(Color.GREEN);
                button3.setTextColor(Color.WHITE);
                tvshow.setText("Over weight getting down to a healthy weight my require a weight-loss program that includes behavioral changes.The good news is that even small weight losses can improve many of these issues,Marshall-Bergman says-a loss as small as 5% to 10% of total body weight.");

            }
        });
       /* button=(Button) findViewById(R.id.button3);*/
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            /*    Intent intent=new Intent(BmiSuggestion.this,Obese.class);
                startActivity(intent);*/
                TextView tvshow=(TextView)findViewById(R.id.tvshow);

                button4.setBackgroundColor(Color.GREEN);
                button4.setTextColor(Color.WHITE);
                tvshow.setText("A Obese people who are overweight can be considered healthy if their waist size is less than 35 inches for women or 40 inches for men, and if they do not have two or more of the following conditions: High blood pressure,High blood sugar,High cholesterol.");

            }
        });

    }
}