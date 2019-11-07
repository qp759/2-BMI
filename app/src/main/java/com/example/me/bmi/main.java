package com.example.me.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class main extends AppCompatActivity {


    private EditText edit_height,edit_weight;
    private Button bt;
    private TextView BMI;
    private float getheight,getweight,MyBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            edit_height = (EditText)findViewById(R.id.edit_height);
            edit_weight = (EditText)findViewById(R.id.edit_weight);
            BMI = (TextView)findViewById(R.id.textView);
            bt = (Button)findViewById(R.id.button);
            bt.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View v) {

                    String TmpHeight = edit_height.getText().toString();
                    String TmpWeight = edit_weight.getText().toString();

                    getheight = Float.parseFloat(TmpHeight);
                    getweight = Float.parseFloat(TmpWeight);

                    getheight = getheight/100;
                    MyBMI = getweight / (getheight * getheight);
                    BMI.setText("Your BMI : "+MyBMI);
                    edit_height.setText("");
                    edit_weight.setText("");

                }
            });
    }
}
