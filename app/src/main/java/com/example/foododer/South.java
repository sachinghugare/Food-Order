package com.example.foododer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static com.example.foododer.Order.Map2;

public class South extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_south2);
    }


    int plain_dosa_count = 0;
    int cheese_dosa_count = 0;
    int masala_dosa_count = 0;
    int papaer_dosa_count = 0;
    int my_dosa_cout = 0;
    int idli_count = 0;
    int medu_vada_count = 0;
    int uttapa_count = 0;
    int ch_uttapa_count = 0;
    int on_uttapa_count = 0;



    public void Process(View view){
        if (plain_dosa_count > 0) {
            TextView a = findViewById(R.id.palin_dosa_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Plain Dosa", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }

        if (cheese_dosa_count > 0) {
            TextView a = findViewById(R.id.cheese_dosa_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("cheese dosa", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (masala_dosa_count > 0) {
            TextView a = findViewById(R.id.masala_dosa_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("masala dosa", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (papaer_dosa_count > 0) {
            TextView a = findViewById(R.id.papaer_dosa_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("papaer dosa", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (my_dosa_cout> 0) {
            TextView a = findViewById(R.id.my_dosa_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Myth dosa", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (idli_count> 0) {
            TextView a = findViewById(R.id.idli_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Idli ", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (medu_vada_count > 0) {
            TextView a = findViewById(R.id.medu_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("medu vada", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (uttapa_count > 0) {
            TextView a = findViewById(R.id.uttapa_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Uttapa", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (ch_uttapa_count > 0) {
            TextView a = findViewById(R.id.cheesse_uttapa_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Cheesse Uttapa", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (on_uttapa_count > 0) {
            TextView a = findViewById(R.id.on_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Onion Uttapa ", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        //  Map2.clear();
        Intent intend=new Intent(this,Thankyou.class);
        startActivity(intend);
    }


    public void plain_dosa_inc(View view) {
        plain_dosa_count = plain_dosa_count+ 1;
        TextView a = findViewById(R.id.palin_dosa_order);
        a.setText("" + plain_dosa_count);

    }

    public void plain_dosa_dec(View view) {
        if (plain_dosa_count > 0)
           plain_dosa_count= plain_dosa_count - 1;
        TextView a = findViewById(R.id.palin_dosa_order);
        a.setText("" + plain_dosa_count);
    }

    public void cheese_dosa_inc(View view) {
        cheese_dosa_count = cheese_dosa_count + 1;
        TextView a = findViewById(R.id.cheese_dosa_order);
        a.setText("" + cheese_dosa_count );

    }

    public void cheese_dosa_dec(View view) {
        if (cheese_dosa_count  > 0)
            cheese_dosa_count  = cheese_dosa_count  - 1;
        TextView a = findViewById(R.id.cheese_dosa_order);
        a.setText("" +cheese_dosa_count );
    }

    public void masala_dosa_inc(View view) {
        masala_dosa_count =masala_dosa_count + 1;
        TextView a = findViewById(R.id.masala_dosa_order);
        a.setText("" + masala_dosa_count );

    }

    public void masala_dosa_dec(View view) {
        if (masala_dosa_count  > 0)
            masala_dosa_count  = masala_dosa_count  - 1;
        TextView a = findViewById(R.id.masala_dosa_order);
        a.setText("" + masala_dosa_count );

    }

    public void paper_dosa_inc(View view) {
        papaer_dosa_count = papaer_dosa_count  + 1;
        TextView a = findViewById(R.id.papaer_dosa_order);
        a.setText("" + papaer_dosa_count );

    }

    public void paper_dosa_dec(View view) {
        if (papaer_dosa_count  > 0)
            papaer_dosa_count  = papaer_dosa_count  - 1;
        TextView a = findViewById(R.id.papaer_dosa_order);
        a.setText("" + papaer_dosa_count );

    }

    public void my_dosa_inc(View view) {
        my_dosa_cout= my_dosa_cout+ 1;
        TextView a = findViewById(R.id.my_dosa_order);
        a.setText("" + my_dosa_cout);

    }

    public void my_dosa_dec(View view) {
        if (my_dosa_cout > 0)
            my_dosa_cout= my_dosa_cout - 1;
        TextView a = findViewById(R.id.my_dosa_order);
        a.setText("" +my_dosa_cout);

    }

    public void idli_inc(View view) {
        idli_count =  idli_count + 1;
        TextView a = findViewById(R.id.idli_order);
        a.setText("" +  idli_count);

    }

    public void idli_dec(View view) {
        if ( idli_count > 0)
            idli_count = idli_count - 1;
        TextView a = findViewById(R.id.idli_order);
        a.setText("" + idli_count);

    }

    public void medu_vada_inc(View view) {
        medu_vada_count =  medu_vada_count+ 1;
        TextView a = findViewById(R.id.medu_order);
        a.setText("" + medu_vada_count);

    }

    public void medu_vada_dec(View view) {
        if ( medu_vada_count > 0)
            medu_vada_count =  medu_vada_count - 1;
        TextView a = findViewById(R.id.medu_order);
        a.setText("" + medu_vada_count);

    }

    public void uttapa_inc(View view) {
        uttapa_count =  uttapa_count  + 1;
        TextView a = findViewById(R.id.uttapa_order);
        a.setText("" +  uttapa_count );

    }

    public void uttapa_dec(View view) {
        if ( uttapa_count  > 0)
            uttapa_count  =  uttapa_count  - 1;
        TextView a = findViewById(R.id.uttapa_order);
        a.setText("" + uttapa_count );

    }

    public void ch_uttapa_inc(View view) {
        ch_uttapa_count =ch_uttapa_count + 1;
        TextView a = findViewById(R.id.cheesse_uttapa_order);
        a.setText("" +ch_uttapa_count);

    }

    public void ch_uttapa_dec(View view) {
        if (ch_uttapa_count > 0)
            ch_uttapa_count= ch_uttapa_count - 1;
        TextView a = findViewById(R.id.cheesse_uttapa_order);
        a.setText("" +ch_uttapa_count);

    }

    public void on_uttapa_inc(View view) {
        on_uttapa_count = on_uttapa_count + 1;
        TextView a = findViewById(R.id.on_order);
        a.setText("" + on_uttapa_count);

    }

    public void on_uttapa_dec(View view) {
        if (on_uttapa_count > 0)
            on_uttapa_count= on_uttapa_count - 1;
        TextView a = findViewById(R.id.on_order);
        a.setText("" + on_uttapa_count);

    }

    public void MM(View view){

        if (plain_dosa_count > 0) {
            TextView a = findViewById(R.id.palin_dosa_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Plain Dosa", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }

        if (cheese_dosa_count > 0) {
            TextView a = findViewById(R.id.cheese_dosa_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("cheese dosa", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (masala_dosa_count > 0) {
            TextView a = findViewById(R.id.masala_dosa_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("masala dosa", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (papaer_dosa_count > 0) {
            TextView a = findViewById(R.id.papaer_dosa_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("papaer dosa", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (my_dosa_cout> 0) {
            TextView a = findViewById(R.id.my_dosa_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Myth dosa", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (idli_count> 0) {
            TextView a = findViewById(R.id.idli_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Idli ", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (medu_vada_count > 0) {
            TextView a = findViewById(R.id.medu_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("medu vada", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (uttapa_count > 0) {
            TextView a = findViewById(R.id.uttapa_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Uttapa", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (ch_uttapa_count > 0) {
            TextView a = findViewById(R.id.cheesse_uttapa_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Cheesse Uttapa", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (on_uttapa_count > 0) {
            TextView a = findViewById(R.id.on_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Onion Uttapa ", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        Intent intent=new Intent(this,MenuActivity.class);
        startActivity(intent);
    }
}
