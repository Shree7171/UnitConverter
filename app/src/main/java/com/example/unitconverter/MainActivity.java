package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView t1,t2;
Button b1;
EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.textView);
        t2 = findViewById(R.id.result);
        b1 = findViewById(R.id.button);
        ed = findViewById(R.id.editText);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double kilos_entered;
                kilos_entered = Double.parseDouble(ed.getText().toString());
                convert(kilos_entered);

                t2.setText(""+convert(kilos_entered)+" ");
            }
        });
    }
    public  double convert(double kilos)
    {
        double pounds = kilos*2.20462;
        return pounds;

    }
}