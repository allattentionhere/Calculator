package com.allattentionhere.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class CalculatorActivity extends Activity implements View.OnClickListener {

    TextView txt_display;
    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, btn_add, btn_sub, btn_multiply, btn_divide, btn_clear, btn_dot, btn_equal;

    //val1 and val2 are 2 inputs.
    Float val1 = null, val2 = null;

    //flag is used to check if previous result was infinity. It will set display value to empty if true.
    boolean add, sub, div, mul, flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        init();
        setListener();

    }

    //initialize layout elements
    public void init() {
        txt_display = (TextView) findViewById(R.id.txt_display);

        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_add = (Button) findViewById(R.id.btn_add);
        btn_sub = (Button) findViewById(R.id.btn_sub);
        btn_multiply = (Button) findViewById(R.id.btn_multiply);
        btn_divide = (Button) findViewById(R.id.btn_divide);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_dot = (Button) findViewById(R.id.btn_dot);
        btn_equal = (Button) findViewById(R.id.btn_equal);

    }

    //set onclick listener for layout elements
    public void setListener() {
        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);

        btn_add.setOnClickListener(this);
        btn_sub.setOnClickListener(this);
        btn_multiply.setOnClickListener(this);
        btn_divide.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        btn_dot.setOnClickListener(this);
        btn_equal.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn_0:
                if (flag == true) {
                    txt_display.setText("");
                    flag = false;
                }
                txt_display.setText(txt_display.getText() + "0");

                break;
            case R.id.btn_1:
                if (flag == true) {
                    txt_display.setText("");
                    flag = false;
                }
                txt_display.setText(txt_display.getText() + "1");

                break;
            case R.id.btn_2:
                if (flag == true) {
                    txt_display.setText("");
                    flag = false;
                }
                txt_display.setText(txt_display.getText() + "2");

                break;
            case R.id.btn_3:
                if (flag == true) {
                    txt_display.setText("");
                    flag = false;
                }
                txt_display.setText(txt_display.getText() + "3");

                break;
            case R.id.btn_4:
                if (flag == true) {
                    txt_display.setText("");
                    flag = false;
                }
                txt_display.setText(txt_display.getText() + "4");

                break;
            case R.id.btn_5:
                if (flag == true) {
                    txt_display.setText("");
                    flag = false;
                }
                txt_display.setText(txt_display.getText() + "5");

                break;
            case R.id.btn_6:
                if (flag == true) {
                    txt_display.setText("");
                    flag = false;
                }
                txt_display.setText(txt_display.getText() + "6");

                break;
            case R.id.btn_7:
                if (flag == true) {
                    txt_display.setText("");
                    flag = false;
                }
                txt_display.setText(txt_display.getText() + "7");

                break;
            case R.id.btn_8:
                if (flag == true) {
                    txt_display.setText("");
                    flag = false;
                }
                txt_display.setText(txt_display.getText() + "8");

                break;
            case R.id.btn_9:
                if (flag == true) {
                    txt_display.setText("");
                    flag = false;
                }
                txt_display.setText(txt_display.getText() + "9");

                break;
            case R.id.btn_dot:
                if (flag == true) {
                    txt_display.setText("");
                    flag = false;
                    break;
                }
                txt_display.setText(txt_display.getText() + ".");

                break;
            case R.id.btn_add:
                if (flag == true) {
                    txt_display.setText("0.0");
                    flag = false;
                }
                //check if input is empty
                if (txt_display.getText().toString().trim().length() > 0) {
                    val1 = Float.parseFloat(txt_display.getText() + "");
                    add = true;
                    txt_display.setText(null);
                }
                break;

            case R.id.btn_sub:
                if (flag == true) {
                    txt_display.setText("0.0");
                    flag = false;
                }
                if (txt_display.getText().toString().trim().length() > 0) {
                    val1 = Float.parseFloat(txt_display.getText() + "");
                    sub = true;
                    txt_display.setText(null);
                }
                break;

            case R.id.btn_multiply:
                if (flag == true) {
                    txt_display.setText("0.0");
                    flag = false;
                }
                if (txt_display.getText().toString().trim().length() > 0) {
                    val1 = Float.parseFloat(txt_display.getText() + "");
                    mul = true;
                    txt_display.setText(null);
                }
                break;

            case R.id.btn_divide:
                if (flag == true) {
                    txt_display.setText("0.0");
                    flag = false;
                }
                if (txt_display.getText().toString().trim().length() > 0) {
                    val1 = Float.parseFloat(txt_display.getText() + "");
                    div = true;
                    txt_display.setText(null);
                }
                break;
            case R.id.btn_equal:
                if (flag == true) {
                    txt_display.setText("");
                    flag = false;
                }
                if (txt_display.getText().toString().trim().length() > 0) {
                    val2 = Float.parseFloat(txt_display.getText() + "");
                    if (add == true) {
                        txt_display.setText(val1 + val2 + "");
                       //reset boolean variable
                        add = false;
                    }
                    if (sub == true) {
                        txt_display.setText(val1 - val2 + "");
                        sub = false;
                    }
                    if (mul == true) {
                        txt_display.setText(val1 * val2 + "");
                        mul = false;
                    }
                    if (div == true) {
                        if (val2 == 0.0f) {
                            flag = true;
                        }
                        txt_display.setText(val1 / val2 + "");
                        div = false;
                    }
                }
                break;
            case R.id.btn_clear:
                txt_display.setText("");
                val1 = null;
                val2 = null;
                break;

        }
    }
}
