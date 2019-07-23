package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btndivide;
    private Button btndot;
    private Button btnmultiply;
    private Button btnminus;
    private Button btnplus;
    private Button btnans;
    private TextView text;
    private char ACTION;
    private final char Add = '+';
    private final char Sub = '-';
    private final char div = '/';
    private final char mul = 'x';



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btn0 = (Button)findViewById(R.id.btn0);
        btndot = (Button)findViewById(R.id.btndot);
        btndivide = (Button)findViewById(R.id.btndivide);
        btnmultiply = (Button)findViewById(R.id.btnmultiply);
        btnplus = (Button)findViewById(R.id.btnplus);
        btnminus = (Button)findViewById(R.id.btnminus);
        btnans = (Button)findViewById(R.id.btnans);
        text = (TextView)findViewById(R.id.text);


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                set_text(0);
//                if (text.length() == 0) {
//                    text.setText(text.getText().toString() + "0");
//                }
//                else {
//                    String[] symbol = {"+", "-", "*", "%"};
//
//
//                    String textString = text.getText().toString();
//                    String SubString = textString.substring(textString.length() - 1);
//                    boolean newline = false;
//                    for (int i = 0; i < symbol.length; i++) {
//                        if (SubString.equals(symbol[i])) {
//                            newline = true;
//                            break;
//                        }
//
//                    }
//
//                    if (newline) {
//                        text.setText(text.getText().toString() + "\n0");
//
//                    } else {
//                        text.setText(text.getText().toString() + "0");
//                    }
//
//                }

//
//                    String textString = text.getText().toString();
//                    String SubString = textString.substring(textString.length() - 1 );
//                        if(SubString.equals("+") || SubString.equals("-") ){
//                            text.setText(text.getText().toString() + "\n0");
//
//                        }
//                        else {
//                            text.setText(text.getText().toString() + "0");
//                        }


                //                int len = textString.length();
                //                String l = String.valueOf(len);
                //                text.setText(l);

//                String SubString = textString.substring(textString.length() -1 );
//
//
//                if(textString.length() > 2)
//                {
//                    if(SubString.equals("+") || SubString.equals("-") ){
//                        text.setText(text.getText().toString() + "\n0");
//                    }
//                    else {
//                        text.setText(text.getText().toString() + "0");
//                    }
//
//                }
//                else{
//                    text.setText("ok");
//                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                set_text(1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                set_text(2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                set_text(3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                set_text(4);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                set_text(5);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                set_text(6);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                set_text(7);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                set_text(8);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                set_text(9);
            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + ".");
            }
        });

        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double val1 = Double.parseDouble(text.getText().toString());
                text.setText(text.getText().toString() + " x");
                ACTION = mul;
            }
        });

        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double val1 = Double.parseDouble(text.getText().toString());
                text.setText(text.getText().toString() + " /");
                ACTION = div;
            }
        });

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double val1 = Double.parseDouble(text.getText().toString());
                text.setText(text.getText().toString() + " +");
                ACTION = Add;
            }
        });

        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double val1 = Double.parseDouble(text.getText().toString());
                text.setText(text.getText().toString() + " -");
                ACTION = Sub;
            }
        });


        btnans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textString = text.getText().toString();
                double ans =0;

                String[] numbers = textString.split("\n");
                numbers[0] = numbers[0].substring(0 , numbers.length);

                text.setText(String.valueOf(numbers[0].length()));

                double val1 =Double.parseDouble(numbers[0]);
                double val2 =Double.parseDouble(numbers[1]);

                switch(ACTION){
                    case Add:
                        ans = val1 + val2;
                        text.setText(String.valueOf(ans));
                        break;
                    case Sub:
                        ans = val1 - val2;
                        text.setText(String.valueOf(ans));
                        break;
                    case mul:
                        ans = val1 * val2;
                        text.setText(String.valueOf(ans));
                        break;
                    case div:
                        ans = val1 / val2;
                        text.setText(String.valueOf(ans));
                        break;

                }

            }
        });

    }



    public void set_text(int input_number){

        if (text.length() == 0) {
            text.setText(text.getText().toString() + input_number);
        }
        else {
            String[] symbol = {"+", "-", "/", "x"};


            String textString = text.getText().toString();
            String SubString = textString.substring(textString.length() - 1);
            boolean newline = false;
            for (int i = 0; i < symbol.length; i++) {
                if (SubString.equals(symbol[i])) {
                    newline = true;
                    break;
                }

            }

            if (newline) {
                text.setText(text.getText().toString() + "\n" + input_number);

            } else {
                text.setText(text.getText().toString() + input_number);
            }

        }

    }

    public void clear(View view) {
        text.setText("0");
    }
}
