package com.example.harshi.is;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    public Button button1;
    public void init(){
        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri newUri = Uri.parse("http://www.rithassan.org");

                Intent home = new Intent(Intent.ACTION_VIEW, newUri);

                startActivity(home);

            }
        });


    }


    public Button button2;
    public void init1() {

        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gallery = new Intent(Main2Activity.this, Main5Activity.class);

                startActivity(gallery);
            }

        });

    }




    public Button button3;
    public void init2() {

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent news = new Intent(Main2Activity.this, Main4Activity.class);

                startActivity(news);
            }


        });


    }


    public Button button4;
    public void init3() {

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent faq = new Intent(Main2Activity.this, Main3Activity.class);

                startActivity(faq);
            }


        });


    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        init();

        init1();

        init2();

        init3();
    }
}
