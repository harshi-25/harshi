package com.example.harshi.is;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        tv = (TextView)findViewById(R.id.textView7);

        loadText();

    }

    private void loadText() {

        String s = "hello!!! \n " +
                "[1](Kannada: ರಾಜೀವ್ ತಾಂತ್ರಿಕ ಮಹಾವಿದ್ಯಾಲಯ),is a Private Technical co-educational Engineering College located in Hassan, Karnataka.\n"+
                "[2] It is one of the four Engineering colleges in Hassan City and one of the five in Hassan District. It was started as one in the galaxy of Technical Colleges in the year 2008.\n"+
                "[3] Rajeev Institute of Technology in Hassan was established under the aegis of Rajeev Education Trust.\n"+
                "[4] The institution is affiliated with the Visvesvaraya Technological University in Belgaum. The college is built on a campus of about 21 acres and is a technical education center.\n " +
                "[5]thank you... ";


        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText(s);
    }
}
