package com.example.foododer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static com.example.foododer.Order.Map2;

public class Beverages extends AppCompatActivity {
    int Special_tea_count=0;
    int Hot_coffee_count=0;
    int Cold_coffee_count=0;
    int Choco_creme_count=0;
    int Rajbhog_cout=0;
    int Lassi_count=0;
    int Hot_chocolate_count=0;
    int Mango_shake_count=0;
    int Chocolate_shake_count=0;
    int St_shake_count=0;

    String Special_tea="";
    String Hot_coffee="";
    String Cold_coffee="";
    String Choco_creme="";
    String Rajbhog="";
    String Lassi="";
    String Hot_chocolate="";
    String Mango_shake="";
    String Chocolate_shake="";
    String St_shake="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverages);
    }
    public void Process(View view){
        //EditText pizza=findViewById(R.id.);
        if(Special_tea_count >0) {
            TextView a = findViewById(R.id.Special_tea_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Special Tea", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }

            if (Hot_coffee_count > 0) {
                TextView a = findViewById(R.id.hot_coffee_order);
                String str = a.getText().toString();
                int b = Integer.parseInt(str);
                Order o = new Order("Hot Coffee", b);
                DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
                myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
            }
            if (Cold_coffee_count > 0) {
                TextView a = findViewById(R.id.cold_coffee_order);
                String str = a.getText().toString();
                int b = Integer.parseInt(str);
                Order o = new Order("Cold Coffee", b);
                DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
                myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
            }
            if (Choco_creme_count > 0) {
                TextView a = findViewById(R.id.choco_creme_order);
                String str = a.getText().toString();
                int b = Integer.parseInt(str);
                Order o = new Order("Choco Creme", b);
                DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
                myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
            }
            if (Rajbhog_cout > 0) {
                TextView a = findViewById(R.id.rajbhog_order);
                String str = a.getText().toString();
                int b = Integer.parseInt(str);
                Order o = new Order("Rajbhog", b);
                DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
                myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
            }
            if (Lassi_count > 0) {
                TextView a = findViewById(R.id.lassi_order);
                String str = a.getText().toString();
                int b = Integer.parseInt(str);
                Order o = new Order("Lassi", b);
                DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
                myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
            }
            if (Hot_chocolate_count > 0) {
                TextView a = findViewById(R.id.hot_chocolate_order);
                String str = a.getText().toString();
                int b = Integer.parseInt(str);
                Order o = new Order("Hot Chocolate", b);
                DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
                myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
            }
            if (Mango_shake_count > 0) {
                TextView a = findViewById(R.id.mango_shake_order);
                String str = a.getText().toString();
                int b = Integer.parseInt(str);
                Order o = new Order("Mango Shake", b);
                DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
                myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
            }
            if (Chocolate_shake_count > 0) {
                TextView a = findViewById(R.id.chocolate_shake_order);
                String str = a.getText().toString();
                int b = Integer.parseInt(str);
                Order o = new Order("Chocolate shake", b);
                DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
                myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
            }
            if (St_shake_count > 0) {
                TextView a = findViewById(R.id.st_shake_order);
                String str = a.getText().toString();
                int b = Integer.parseInt(str);
                Order o = new Order("Strawberry Shake", b);
                DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
                myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
            }

             Intent intend=new Intent(this,Thankyou.class);
            startActivity(intend);
          //  Map2.clear();
        }








    public void MM(View view){
        if(Special_tea_count >0) {
            TextView a = findViewById(R.id.Special_tea_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Special Tea", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }

        if (Hot_coffee_count > 0) {
            TextView a = findViewById(R.id.hot_coffee_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Hot Coffee", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (Cold_coffee_count > 0) {
            TextView a = findViewById(R.id.cold_coffee_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Cold Coffee", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (Choco_creme_count > 0) {
            TextView a = findViewById(R.id.choco_creme_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Choco Creme", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (Rajbhog_cout > 0) {
            TextView a = findViewById(R.id.rajbhog_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Rajbhog", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (Lassi_count > 0) {
            TextView a = findViewById(R.id.lassi_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Lassi", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (Hot_chocolate_count > 0) {
            TextView a = findViewById(R.id.hot_chocolate_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Hot Chocolate", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (Mango_shake_count > 0) {
            TextView a = findViewById(R.id.mango_shake_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Mango Shake", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (Chocolate_shake_count > 0) {
            TextView a = findViewById(R.id.chocolate_shake_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Chocolate shake", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (St_shake_count > 0) {
            TextView a = findViewById(R.id.st_shake_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Strawberry Shake", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }



        Intent intent=new Intent(this,MenuActivity.class);
        startActivity(intent);
    }
    public void Special_tea_inc1(View view){
       Special_tea_count = Special_tea_count + 1;
        TextView a=findViewById(R.id.Special_tea_order);
        a.setText(""+Special_tea_count);

    }
    public void Special_tea_dec1(View view){
        if(Special_tea_count>0)
            Special_tea_count= Special_tea_count -1;
        TextView a=findViewById(R.id.Special_tea_order);
        a.setText(""+Special_tea_count);
    }
    public void Hot_coffee_inc1(View view){
        Hot_coffee_count = Hot_coffee_count + 1;
        TextView a=findViewById(R.id.hot_coffee_order);
        a.setText(""+Hot_coffee_count);

    }
    public void Hot_coffee_dec1(View view){
        if(Hot_coffee_count>0)
            Hot_coffee_count= Hot_coffee_count -1;
        TextView a=findViewById(R.id.hot_coffee_order);
        a.setText(""+Hot_coffee_count);

    }
    public void Cold_coffee_inc1(View view){
        Cold_coffee_count = Cold_coffee_count + 1;
        TextView a=findViewById(R.id.cold_coffee_order);
        a.setText(""+Cold_coffee_count);

    }
    public void Cold_coffee_dec1(View view){
        if(Cold_coffee_count>0)
            Cold_coffee_count= Cold_coffee_count -1;
        TextView a=findViewById(R.id.cold_coffee_order);
        a.setText(""+Cold_coffee_count);

    }
    public void Choco_creme_inc1(View view){
        Choco_creme_count= Choco_creme_count+ 1;
        TextView a=findViewById(R.id.choco_creme_order);
        a.setText(""+Choco_creme_count);

    }
    public void Choco_creme_dec1(View view){
        if(Choco_creme_count>0)
            Choco_creme_count= Choco_creme_count -1;
        TextView a=findViewById(R.id.choco_creme_order);
        a.setText(""+Choco_creme_count);

    }
    public void Rajbhog_inc1(View view){
        Rajbhog_cout= Rajbhog_cout+ 1;
        TextView a=findViewById(R.id.rajbhog_order);
        a.setText(""+Rajbhog_cout);

    }
    public void Rajbhog_dec1(View view){
        if(Rajbhog_cout>0)
            Rajbhog_cout= Rajbhog_cout -1;
        TextView a=findViewById(R.id.rajbhog_order);
        a.setText(""+Rajbhog_cout);

    }
    public void Lassi_inc1(View view){
        Lassi_count= Lassi_count+ 1;
        TextView a=findViewById(R.id.lassi_order);
        a.setText(""+Lassi_count);

    }
    public void Lassi_dec1(View view){
        if(Lassi_count>0)
            Lassi_count= Lassi_count -1;
        TextView a=findViewById(R.id.lassi_order);
        a.setText(""+Lassi_count);

    }
    public void Hot_chocolate_inc1(View view){
        Hot_chocolate_count= Hot_chocolate_count+ 1;
        TextView a=findViewById(R.id.hot_chocolate_order);
        a.setText(""+Hot_chocolate_count);

    }
    public void Hot_chocolate_dec1(View view){
        if(Hot_chocolate_count>0)
            Hot_chocolate_count= Hot_chocolate_count-1;
        TextView a=findViewById(R.id.hot_chocolate_order);
        a.setText(""+Hot_chocolate_count);

    }
    public void chocolate_shake_inc1(View view){
        Chocolate_shake_count= Chocolate_shake_count+ 1;
        TextView a=findViewById(R.id.chocolate_shake_order);
        a.setText(""+Chocolate_shake_count);

    }
    public void chocolate_shake_dec1(View view){
        if(Chocolate_shake_count>0)
            Chocolate_shake_count= Chocolate_shake_count-1;
        TextView a=findViewById(R.id.chocolate_shake_order);
        a.setText(""+Chocolate_shake_count);

    } public void Mango_inc1(View view){
        Mango_shake_count= Mango_shake_count+ 1;
        TextView a=findViewById(R.id.mango_shake_order);
        a.setText(""+Mango_shake_count);

    }
    public void Mango_dec1(View view){
        if(Mango_shake_count>0)
            Mango_shake_count= Mango_shake_count-1;
        TextView a=findViewById(R.id.mango_shake_order);
        a.setText(""+Mango_shake_count);

    } public void st_inc1(View view){
        St_shake_count= St_shake_count+ 1;
        TextView a=findViewById(R.id.st_shake_order);
        a.setText(""+St_shake_count);

    }
    public void st_dec1(View view){
        if(St_shake_count>0)
            St_shake_count= St_shake_count-1;
        TextView a=findViewById(R.id.st_shake_order);
        a.setText(""+St_shake_count);

    }



}
