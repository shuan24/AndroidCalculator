package com.example.basicandroidcalculator;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual, myButton;
    EditText calEditText;

    Double mValueOne, mValueTwo;

    boolean calAddition, calSubtract, calMultiplication, calDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = findViewById(R.id.eraseButton);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        calEditText = (EditText) findViewById(R.id.edt1);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = calEditText.getText().toString();
                if (!TextUtils.isEmpty(text)) {
                    String newText = text.substring(1, text.length()); //delete from left
                    //or
                    String newText1 = text.substring(0, text.length() - 1); //delete from right
                    calEditText.setText(newText);
                    calEditText.setSelection(newText.length());
                    //or
                    calEditText.setText(newText1);
                    calEditText.setSelection(newText1.length());

                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calEditText.setText(calEditText.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calEditText.setText(calEditText.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calEditText.setText(calEditText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calEditText.setText(calEditText.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calEditText.setText(calEditText.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calEditText.setText(calEditText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calEditText.setText(calEditText.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calEditText.setText(calEditText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calEditText.setText(calEditText.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calEditText.setText(calEditText.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = calEditText.getText().toString();
                if (!TextUtils.isEmpty(text)) {
                    mValueOne = Double.parseDouble(calEditText.getText() + "");
                    calAddition = true;
                    calEditText.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = calEditText.getText().toString();
                if (!TextUtils.isEmpty(text)) {
                    mValueOne = Double.parseDouble(calEditText.getText() + "");
                    calSubtract = true;
                    calEditText.setText(null);
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = calEditText.getText().toString();
                if (!TextUtils.isEmpty(text)) {
                    mValueOne = Double.parseDouble(calEditText.getText() + "");
                    calMultiplication = true;
                    calEditText.setText(null);
                }
            }
        });
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = calEditText.getText().toString();
                if (!TextUtils.isEmpty(text)) {
                    mValueOne = Double.parseDouble(calEditText.getText() + "");
                    calDivision = true;
                    calEditText.setText(null);
                }
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = calEditText.getText().toString();
                if (!TextUtils.isEmpty(text)) {
                    mValueTwo = Double.parseDouble(calEditText.getText() + "");

                    if (calAddition == true) {
                        calEditText.setText(mValueOne + mValueTwo + "");
                        calAddition = false;
                    }

                    if (calSubtract == true) {
                        calEditText.setText(mValueOne - mValueTwo + "");
                        calSubtract = false;
                    }

                    if (calMultiplication == true) {
                        calEditText.setText(mValueOne * mValueTwo + "");
                        calMultiplication = false;
                    }

                    if (calDivision == true) {
                        calEditText.setText(mValueOne / mValueTwo + "");
                        calDivision = false;
                    }
                }
            }

        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calEditText.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calEditText.setText(calEditText.getText() + ".");
            }
        });
    }
}