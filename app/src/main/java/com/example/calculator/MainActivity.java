package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView firstview,secondview;
    String secondvalue,operator;
    double num1,num2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstview=findViewById(R.id.firstTextViewId);
        secondview=findViewById(R.id.secondTextViewId);
    }



    public void digitFunction(View view) {
        secondvalue= secondview.getText().toString();
        if(view.getId()==R.id.zeroBtnId){
            if(secondvalue.equals("0")){
                secondview.setText("0");
            }else{
                secondview.setText(secondvalue+"0");
            }
        }
        else if(view.getId()==R.id.oneBtnId){
            if(secondvalue.equals("0")){
                secondview.setText("1");
            }else{
                secondview.setText(secondvalue+"1");
            }
        }
        else if(view.getId()==R.id.twoBtnId){
            if(secondvalue.equals("0")){
                secondview.setText("2");
            }else{
                secondview.setText(secondvalue+"2");
            }
        }
       else if(view.getId()==R.id.threeBtnId){
            if(secondvalue.equals("0")){
                secondview.setText("3");
            }else{
                secondview.setText(secondvalue+"3");
            }
        }
       else if(view.getId()==R.id.fourBtnId){
            if(secondvalue.equals("0")){
                secondview.setText("4");
            }else{
                secondview.setText(secondvalue+"4");
            }
        }
       else if(view.getId()==R.id.fiveBtnId){
            if(secondvalue.equals("0")){
                secondview.setText("5");
            }else{
                secondview.setText(secondvalue+"5");
            }
        }
       else if(view.getId()==R.id.sixBtnId){
            if(secondvalue.equals("0")){
                secondview.setText("6");
            }else{
                secondview.setText(secondvalue+"6");
            }
        }
       else if(view.getId()==R.id.sevenBtnId){
            if(secondvalue.equals("0")){
                secondview.setText("7");
            }else{
                secondview.setText(secondvalue+"7");
            }
        }
       else if(view.getId()==R.id.eightBtnId){
            if(secondvalue.equals("0")){
                secondview.setText("8");
            }else{
                secondview.setText(secondvalue+"8");
            }
        }
       else if(view.getId()==R.id.nineBtnId){
            if(secondvalue.equals("0")){
                secondview.setText("9");
            }else{
                secondview.setText(secondvalue+"9");
            }
        }
    }

    public void logicFunction(View view) {
        secondvalue=secondview.getText().toString();
        num1=Double.parseDouble(secondvalue);
        if (view.getId()==R.id.addBtnId){
            operator="+";
        }
        else if (view.getId()==R.id.subBtnId){
            operator="-";
        }
        else if (view.getId()==R.id.mulBtnId){
            operator="*";
        }
        else{
            operator="/";
        }
        firstview.setText(secondvalue+operator);
        secondview.setText("0");
    }

    public void resultFunction(View view) {
        secondvalue=secondview.getText().toString();
        num2=Double.parseDouble(secondvalue);
        if (operator.equals("+")){
            result=num1+num2;
        }
       else if (operator.equals("-")){
            result=num1-num2;
        }
        else if (operator.equals("*")){
            result=num1*num2;
        }
        else{
            result=num1/num2;
        }
        firstview.setText(" "+num1+" "+operator+num2+"=");
        secondview.setText(" "+result);
    }
    public void clearFunction(View view) {
        firstview.setText("");
        secondview.setText("0");
        num1=0;
        num2=0;
    }
}