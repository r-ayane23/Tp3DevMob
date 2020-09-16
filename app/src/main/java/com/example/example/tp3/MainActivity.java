package com.example.example.tp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView result;
    double c1;
    int pointeur=0;
    String a;
    String b;
    double res=0;
    ArrayList<String> array_List = new ArrayList() ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=null;
        result= (TextView)findViewById(R.id.textView);
    }

    public void zero(View view) {
        a=result.getText().toString();
        result.setText(a + "0");
        array_List.add("0");
    }
    public void plus(View view) {
        a=result.getText().toString();
        c1=Integer.parseInt(a);
        pointeur=1;
        result.setText(a+"+");
        array_List.add("+");
    }
    public void un(View view){
        a=result.getText().toString();
        result.setText(a+"1");
        array_List.add("1");
    }
}
