package com.example.jiejun.androidhelloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void leftBtnClick(View view) {
        Button btn=(Button)findViewById(R.id.leftButton);
        Toast.makeText(this, "Left Button Clicked",Toast.LENGTH_SHORT).show();
    }

    public void rightBtnClick(View view) {
        Button btn=(Button)findViewById(R.id.rightButton);
        Toast.makeText(this, "Right Button Clicked",Toast.LENGTH_SHORT).show();
    }
}
