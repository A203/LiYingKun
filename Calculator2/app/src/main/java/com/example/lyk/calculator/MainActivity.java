package com.example.lyk.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private Button ADD,SUBTRACT,MULTIPLY,DIVIDE;
    private EditText num1,num2;
    private TextView show;
    //DOUBLE A,B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ADD=(Button)findViewById(R.id.ADD);
        SUBTRACT=(Button)findViewById(R.id.SUBTRACT);
        MULTIPLY=(Button)findViewById(R.id.MULTIPLY);
        DIVIDE=(Button)findViewById(R.id.DIVIDE);
        num1=(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);
        show=(TextView)findViewById(R.id.show);
        ADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a=new Double(num1.getText().toString());
                double b=new Double(num2.getText().toString());
                double resault=a+b;
                show.setText(String.valueOf(resault));
            }
        });
        MULTIPLY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a=new Double(num1.getText().toString());
                double b=new Double(num2.getText().toString());
                double resault=a-b;
                show.setText(String.valueOf(resault));

            }
        });
        SUBTRACT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a=new Double(num1.getText().toString());
                double b=new Double(num2.getText().toString());
                double resault=a*b;
                show.setText(String.valueOf(resault));
            }
        });
        DIVIDE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a=new Double(num1.getText().toString());
                double b=new Double(num2.getText().toString());
                double resault=a/b;
                show.setText(String.valueOf(resault));
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
