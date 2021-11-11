package com.wik4apps.it460_002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    EditText et;
    TextView tv;
    Button btn;
    Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.edit_text_name);
        tv = findViewById(R.id.textview_say_hi);
        sp = findViewById(R.id.spinner);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("MYTAG2020",String.valueOf(i));
                //btn.setText();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        btn = findViewById(R.id.button_hi);
        btn.setOnClickListener((view) -> {
            String name = et.getText().toString();
            String greeting = (String) sp.getSelectedItem();
            tv.setText(String.format("%s   %s", greeting, name));
        });

    }

    /*public void OnHi(View view) {
        String name = et.getText().toString();
        tv.setText("Hi "+name);
        //Button n = (Button) view;


    }*/

    /*@Override
    public void onClick(View view) {
        String name = et.getText().toString();
        tv.setText("Hi "+name);
    }*/
}