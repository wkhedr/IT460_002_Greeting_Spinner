package com.wik4apps.it460_002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        String[] greetings = getResources().getStringArray(R.array.greetings);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
               btn.setText(String.format("****Say %s****",greetings[i]));
                Log.e("MainActivity",greetings[i]);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        btn = findViewById(R.id.button_hi);
        btn.setOnClickListener((view) -> {
            String name = et.getText().toString();
            String greeting = (String) sp.getSelectedItem();

            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_SUBJECT,greeting);
            intent.putExtra(Intent.EXTRA_TEXT,name);
            intent.setType("text/plain");
            startActivity(intent);
            /*Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("NAME",name);
            intent.putExtra("GR",greeting);
            startActivity(intent);*/
            //tv.setText(String.format("c%s   %s", greeting, name));
        });

    }

}