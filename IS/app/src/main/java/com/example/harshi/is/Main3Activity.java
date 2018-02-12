package com.example.harshi.is;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {


    public void dise(View view) {
        Intent dise = new Intent(Main3Activity.this, Main6Activity.class);
        startActivity(dise);
    }

    public void sendFeedback(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:harshithharshi253@gmail.cpm.com"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Ecses Feedback");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(Intent.createChooser(intent, "Send Feedback"));
        }
    }


    TextView tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        tv2 = (TextView)findViewById(R.id.tv2);

        loadText();

    }

    private void loadText() {

        String s = "hello!!! \n " +
                "Information Technology is committed to provide precise, complete and relevant information to the modern society in all practices. Our motive is to meet and fulfill the growing demands of market by providing best quality services through well-skilled and highly qualified engineers. In order to facilitate the students for gaining true knowledge, skills and personality, we provide a standardized, well managed, state-of-the-art infrastructure. Main emphasis is imparting practical knowledge in students. Regular workshops are conducted to update the technical skills of students by the faculty and industrial experts. Developing on-demand live projects is a regular task." +
                "thank you... ";


        tv2.setMovementMethod(new ScrollingMovementMethod());
        tv2.setText(s);
    }

    }

