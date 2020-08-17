package com.example.calculator;

import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, clear, mul, div, add, sub, result, del, sqroot, point, perc;
    EditText inputText;
    float v1, v2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.themeColor));
        }
        perc = findViewById(R.id.percentage);
        point = findViewById(R.id.point);
        sqroot = findViewById(R.id.squareroot);
        del = findViewById(R.id.backspace);
        result = findViewById(R.id.result);
        mul = findViewById(R.id.multiply);
        div = findViewById(R.id.divide);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.subtract);
        clear = findViewById(R.id.clear);
        b0 = findViewById(R.id.zero);
        b1 = findViewById(R.id.one);
        b2 = findViewById(R.id.two);
        b3 = findViewById(R.id.three);
        b4 = findViewById(R.id.four);
        b5 = findViewById(R.id.five);
        b6 = findViewById(R.id.six);
        b7 = findViewById(R.id.seven);
        b8 = findViewById(R.id.eight);
        b9 = findViewById(R.id.nine);
        inputText = findViewById(R.id.inputText);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText() + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText() + "0");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int l = inputText.getText().length();
                if(l>0){
                    if(inputText.getText().charAt(l-1) == 'X' || inputText.getText().charAt(l-1) == '/'){
                        inputText.setText(inputText.getText() + "");
                    }
                    else{
                        v1 = Float.parseFloat(String.valueOf(inputText.getText()));
                        inputText.setText(inputText.getText() + "X");
                    }
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText() + "/");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText() + "+");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText() + "-");
            }
        });
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ToDo: Add functions
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText("");
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = inputText.getText().toString();
                if(x.isEmpty()){
                    inputText.setText("");
                }
                else{
                    inputText.setText(x.substring(0, x.length()-1));
                }
            }
        });
        sqroot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = getString(R.string.sqr_root);
                inputText.setText(inputText.getText() + x);
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText() + ".");
            }
        });
        perc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText() + "%");
            }
        });
    }
}