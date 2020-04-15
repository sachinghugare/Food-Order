package com.example.foododer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

import static com.example.foododer.Order.Map2;

public class Italian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian2);
    }
    public void Process(View view){
        //EditText pizza=findViewById(R.id.);
        Order o=new Order("pizza",6);
        DatabaseReference myRef= FirebaseDatabase.getInstance().getReference();
        myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        Map2.clear();

        Intent intend=new Intent(this,Thankyou.class);
        startActivity(intend);
    }
    public void MM(View view){
        Order o=new Order("pizza",6);
        Intent intent=new Intent(this,MenuActivity.class);
        startActivity(intent);

    }
}
