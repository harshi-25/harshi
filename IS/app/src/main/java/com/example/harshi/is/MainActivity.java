package com.example.harshi.is;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    public Button button;
    public void init(){

       button= (Button)findViewById(R.id.button);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {


               Intent ise = new Intent(MainActivity.this,Main2Activity.class);

            startActivity(ise);

           }
       });




    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();

    }
}
