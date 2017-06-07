package com.romeotutorial.ex08;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String totul;
                EditText editText1 = (EditText)findViewById(R.id.editText);
                EditText editText2 = (EditText)findViewById(R.id.editText2);
                EditText editText3 = (EditText)findViewById(R.id.editText3);
                EditText editText4 = (EditText)findViewById(R.id.editText4);
                EditText editText5 = (EditText)findViewById(R.id.editText6);
                totul = "Nume :" + " " + editText1.getText() + " " + "Prenume :"  +  " " + editText2.getText() +
                        " " + "Varsta: " + " " + editText3.getText()
                        + " " + "Sex: " + " " + editText4.getText() + " " +"Ocupatie: " + " " + editText5.getText() ;
                Toast.makeText(getApplicationContext(),totul ,Toast.LENGTH_LONG).show();

            }
        });
    }
}
