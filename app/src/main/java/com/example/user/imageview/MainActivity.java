package com.example.user.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    ImageView iv1;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 =(Button) findViewById(R.id.btn1);
        iv1 = (ImageView) findViewById(R.id.iv1);
    }

    public void btnclick(View view) {
        Random rnd= new Random();
        x=rnd.nextInt(3)+1;
        btn1.setText(""+x);
        if (x==1)
            iv1.setImageResource(R.drawable.dog1);
        if (x==2)
            iv1.setImageResource(R.drawable.dog2);
        if (x==3)
            iv1.setImageResource(R.drawable.dog3);

    }
}
