package com.example.foododer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
    }
    public void italian(View view){
        Intent intent=new Intent(this,Italian.class);
        startActivity(intent);
    }
    public void China(View view){
        Intent intent=new Intent(this,China.class);
        startActivity(intent);
    }
    public void South(View view){
        Intent intent=new Intent(this,South.class);
        startActivity(intent);
    }
    public void Beverages(View view){
        Intent intent=new Intent(this,Beverages.class);
        startActivity(intent);
    }

}
