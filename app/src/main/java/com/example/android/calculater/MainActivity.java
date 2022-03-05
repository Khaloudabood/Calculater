package com.example.android.calculater;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    double input1 = 0, input2 = 0;
    TextView edt1;
    boolean Addition, Subtraction, Multiplication, Division, mRemainder, decimal;
    Button button0,
    button1, button2, button3, button4,
    button5, button6, button7, button8, button9,
    buttonAdd, buttonSub, buttonMul, buttonDivision,
    buttonEqual, buttonDel, buttonDot, Remainder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        buttonAdd = (Button) findViewById(R.id.sum_button);
        buttonSub = (Button) findViewById(R.id.sub_button);
        buttonMul = (Button) findViewById(R.id.multi_button);
        buttonDivision = (Button) findViewById(R.id.div_button);
        buttonEqual = (Button) findViewById(R.id.equal_button);
        buttonDel = (Button) findViewById(R.id.del_button);
        buttonDot = (Button) findViewById(R.id.dot_button);
        Remainder = (Button) findViewById(R.id.remainder_button);

        edt1 = (TextView) findViewById(R.id.textView);

        button1.setOnClickListener(v -> edt1.setText(edt1.getText() + "1"));
        button2.setOnClickListener(v -> edt1.setText(edt1.getText() + "2"));
        button3.setOnClickListener(v -> edt1.setText(edt1.getText() + "3"));
        button4.setOnClickListener(v -> edt1.setText(edt1.getText() + "4"));
        button5.setOnClickListener(v -> edt1.setText(edt1.getText() + "5"));
        button6.setOnClickListener(v -> edt1.setText(edt1.getText() + "6"));
        button7.setOnClickListener(v -> edt1.setText(edt1.getText() + "7"));
        button8.setOnClickListener(v -> edt1.setText(edt1.getText() + "8"));
        button9.setOnClickListener(v -> edt1.setText(edt1.getText() + "9"));
        button0.setOnClickListener(v -> edt1.setText(edt1.getText() + "0"));

        buttonAdd.setOnClickListener(v -> {
            if (edt1.getText().length() != 0)
            {
                input1 = Float.parseFloat(edt1.getText() + "");
                Addition = true;
                decimal = false;
                edt1.setText(null);
            }
        });
        buttonSub.setOnClickListener(v -> {
            if (edt1.getText().length() != 0){
                input1 = Float.parseFloat(edt1.getText() + "");
                Subtraction = true;
                decimal = false;
                edt1.setText(null);
            }
        });
        buttonMul.setOnClickListener(v -> {
            if (edt1.getText().length() != 0)
            {
                input1= Float.parseFloat(edt1.getText() + "");
                Multiplication = true;
                decimal = false;
                edt1.setText(null);
            }
        });
        buttonDivision.setOnClickListener(v -> {
            if (edt1.getText().length() != 0)
            {
                input1= Float.parseFloat(edt1.getText() + "");
                Division = true;
                decimal = false;
                edt1.setText(null);
            }
        });
        Remainder.setOnClickListener(v -> {
            if (edt1.getText().length() != 0)
            {
                input1= Float.parseFloat(edt1.getText() + "");
                mRemainder = true;
                decimal = false;
                edt1.setText(null);
            }
        });

        buttonEqual.setOnClickListener(v -> {
            if (Addition || Subtraction || Multiplication || Division || mRemainder){
                input2 = Float.parseFloat(edt1.getText() + "");
            }
            if (Addition){

                edt1.setText(input1 + input2 + "");
                Addition = false;
            }
            if (Subtraction){

                edt1.setText(input1 - input2 + "");
                Subtraction = false;
            }
            if (Multiplication){

                edt1.setText(input1 * input2 + "");
                Multiplication = false;
            }
            if (Division){

                edt1.setText(input1 / input2 + "");
                Division = false;
            }
            if (mRemainder){

                edt1.setText(input1 % input2 + "");
                mRemainder = false;
            }
        });

        buttonDel.setOnClickListener(v -> {
            edt1.setText("");
            input1 = 0.0;
            input2 = 0.0;
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (decimal){
                    //do no thing or you can show the error
                }
                else {
                    edt1.setText(edt1.getText() + ".");
                    decimal = true;
                }
            }
        });


    }//end onCreate()
}//end class