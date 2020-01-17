package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;


public class MainActivity extends AppCompatActivity {

    Button buttonAdd, buttonSub, buttonDiv, buttonMul;
    public static final String EXTRA_MESSAGE = "com.example.simplecalculator.MESSAGE";
    EditText eNum1, eNum2, result;
    //float NumOne, NumTwo;

    //boolean add, sub, mult, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDiv = (Button) findViewById(R.id.buttondiv);

        final Button buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText editView1 = (EditText) findViewById(R.id.eNum1);
                int n1 = Integer.parseInt(editView1.getText().toString());
                EditText editView2 = (EditText) findViewById(R.id.eNum2);

                int n2 = Integer.parseInt(editView2.getText().toString());
                int sum = n1+n2;
                Intent intent = new Intent(MainActivity.this, DisplayMessageActivity.class);
                intent.putExtra(EXTRA_MESSAGE, Integer.toString(sum));
                startActivity(intent);
                TextView ans = (TextView) findViewById(R.id.result);
                ans.setText(Integer.toString(sum));
                // your handler code here
            }
        });

        final Button buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonSub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText editView1 = (EditText) findViewById(R.id.eNum1);
                int n1 = Integer.parseInt(editView1.getText().toString());
                EditText editView2 = (EditText) findViewById(R.id.eNum2);

                int n2 = Integer.parseInt(editView2.getText().toString());
                int sum = n1-n2;
                Intent intent = new Intent(MainActivity.this, DisplayMessageActivity.class);
                intent.putExtra(EXTRA_MESSAGE, Integer.toString(sum));
                startActivity(intent);
                TextView ans = (TextView) findViewById(R.id.result);
                ans.setText(Integer.toString(sum));
                // your handler code here
            }
        });

        final Button buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonMul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText editView1 = (EditText) findViewById(R.id.eNum1);
                int n1 = Integer.parseInt(editView1.getText().toString());
                EditText editView2 = (EditText) findViewById(R.id.eNum2);

                int n2 = Integer.parseInt(editView2.getText().toString());
                int sum = n1*n2;
                Intent intent = new Intent(MainActivity.this, DisplayMessageActivity.class);
                intent.putExtra(EXTRA_MESSAGE, Integer.toString(sum));
                startActivity(intent);
                TextView ans = (TextView) findViewById(R.id.result);
                ans.setText(Integer.toString(sum));
                // your handler code here
            }
        });

        final Button buttonDiv = (Button) findViewById(R.id.buttondiv);
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText editView1 = (EditText) findViewById(R.id.eNum1);
                int n1 = Integer.parseInt(editView1.getText().toString());
                EditText editView2 = (EditText) findViewById(R.id.eNum2);

                int n2 = Integer.parseInt(editView2.getText().toString());
                int sum = n1/n2;
                Intent intent = new Intent(MainActivity.this, DisplayMessageActivity.class);
                intent.putExtra(EXTRA_MESSAGE, Integer.toString(sum));
                startActivity(intent);
                TextView ans = (TextView) findViewById(R.id.result);
                ans.setText(Integer.toString(sum));
                // your handler code here
            }
        });
    }




    }

