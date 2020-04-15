package com.example.foododer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static com.example.foododer.Order.Map2;

public class China extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_china2);
    }

    int noodles_count = 0;
    int m_noodles_count = 0;
    int s_noodles_count = 0;
    int f_noodles_count = 0;
    int hakka_noodle_cout = 0;
    int noodles_soup_count = 0;
    int f_rice_count = 0;
    int s_rice_count = 0;
    int m_rice_count = 0;
    int ch_bhel_count = 0;

    String noodles = "";
    String m_noodles = "";
    String s_noodles = "";
    String f_noodles = "";
    String hakka_noodles = "";
    String noodle_soup = "";
    String fried_rice = "";
    String s_rice = "";
    String m_rice = "";
    String ch_bhel = "";

    public void Process(View view) {

        if (noodles_count > 0) {
            TextView a = findViewById(R.id.noodles_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Noodles", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }

        if (m_noodles_count > 0) {
            TextView a = findViewById(R.id.m_n_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Manchurian Noodles", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (s_noodles_count > 0) {
            TextView a = findViewById(R.id.s_n_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Schezwan Noodles", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (f_noodles_count > 0) {
            TextView a = findViewById(R.id.fried_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Fried Noodles", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (hakka_noodle_cout > 0) {
            TextView a = findViewById(R.id.hakka_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Hakka Noodles", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (noodles_soup_count > 0) {
            TextView a = findViewById(R.id.n_soup_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Noodles Soup", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (f_rice_count > 0) {
            TextView a = findViewById(R.id.fried_rice_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Fried Rice", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (s_rice_count > 0) {
            TextView a = findViewById(R.id.s_rice_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Schezwan Rice", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (m_rice_count > 0) {
            TextView a = findViewById(R.id.m_rice_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Manchurian Rice", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (ch_bhel_count > 0) {
            TextView a = findViewById(R.id.ch_bhel_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Chinese Bhel", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
      //  Map2.clear();
        Intent intend=new Intent(this,Thankyou.class);
        startActivity(intend);

    }

    public void noodles_inc(View view) {
        noodles_count = noodles_count + 1;
        TextView a = findViewById(R.id.noodles_order);
        a.setText("" + noodles_count);

    }

    public void noodles_dec(View view) {
        if (noodles_count > 0)
            noodles_count = noodles_count - 1;
        TextView a = findViewById(R.id.noodles_order);
        a.setText("" + noodles_count);
    }

    public void m_noodle_inc(View view) {
        m_noodles_count = m_noodles_count + 1;
        TextView a = findViewById(R.id.m_n_order);
        a.setText("" + m_noodles_count);

    }

    public void m_noodle_dec(View view) {
        if (m_noodles_count > 0)
            m_noodles_count = m_noodles_count - 1;
        TextView a = findViewById(R.id.m_n_order);
        a.setText("" + m_noodles_count);
    }

    public void s_nooodle_inc(View view) {
        s_noodles_count = s_noodles_count + 1;
        TextView a = findViewById(R.id.s_n_order);
        a.setText("" + s_noodles_count);

    }

    public void s_nooodle_dec(View view) {
        if (s_noodles_count > 0)
            s_noodles_count = s_noodles_count - 1;
        TextView a = findViewById(R.id.s_n_order);
        a.setText("" + s_noodles_count);

    }

    public void f_noodle_inc(View view) {
        f_noodles_count = f_noodles_count + 1;
        TextView a = findViewById(R.id.fried_order);
        a.setText("" + f_noodles_count);

    }

    public void f_noodle_dec(View view) {
        if (f_noodles_count > 0)
            f_noodles_count = f_noodles_count - 1;
        TextView a = findViewById(R.id.fried_order);
        a.setText("" + f_noodles_count);

    }

    public void hakka_inc1(View view) {
        hakka_noodle_cout = hakka_noodle_cout + 1;
        TextView a = findViewById(R.id.hakka_order);
        a.setText("" + hakka_noodle_cout);

    }

    public void hakka_dec(View view) {
        if (hakka_noodle_cout > 0)
            hakka_noodle_cout = hakka_noodle_cout - 1;
        TextView a = findViewById(R.id.hakka_order);
        a.setText("" + hakka_noodle_cout);

    }

    public void n_s_inc(View view) {
        noodles_soup_count = noodles_soup_count + 1;
        TextView a = findViewById(R.id.n_soup_order);
        a.setText("" + noodles_soup_count);

    }

    public void n_s_dec(View view) {
        if (noodles_soup_count > 0)
            noodles_soup_count = noodles_soup_count - 1;
        TextView a = findViewById(R.id.n_soup_order);
        a.setText("" + noodles_soup_count);

    }

    public void f_rice_inc(View view) {
        f_rice_count = f_rice_count + 1;
        TextView a = findViewById(R.id.fried_rice_order);
        a.setText("" + f_rice_count);

    }

    public void f_rice_dec(View view) {
        if (f_rice_count > 0)
            f_rice_count = f_rice_count - 1;
        TextView a = findViewById(R.id.fried_rice_order);
        a.setText("" + f_rice_count);

    }

    public void s_rice_inc(View view) {
        s_rice_count = s_rice_count + 1;
        TextView a = findViewById(R.id.s_rice_order);
        a.setText("" + s_rice_count);

    }

    public void s_rice_dec1(View view) {
        if (s_rice_count > 0)
            s_rice_count = s_rice_count - 1;
        TextView a = findViewById(R.id.s_rice_order);
        a.setText("" + s_rice_count);

    }

    public void m_rice_inc(View view) {
        m_rice_count = m_rice_count + 1;
        TextView a = findViewById(R.id.m_rice_order);
        a.setText("" + m_rice_count);

    }

    public void m_rice_dec(View view) {
        if (m_rice_count > 0)
            m_rice_count = m_rice_count - 1;
        TextView a = findViewById(R.id.m_rice_order);
        a.setText("" + m_rice_count);

    }

    public void ch_bhel_inc(View view) {
        ch_bhel_count = ch_bhel_count + 1;
        TextView a = findViewById(R.id.ch_bhel_order);
        a.setText("" + ch_bhel_count);

    }

    public void ch_bhel_dec(View view) {
        if (ch_bhel_count > 0)
            ch_bhel_count = ch_bhel_count - 1;
        TextView a = findViewById(R.id.ch_bhel_order);
        a.setText("" + ch_bhel_count);

    }


    public void MM(View view){
        if (noodles_count > 0) {
            TextView a = findViewById(R.id.noodles_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Noodles", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }

        if (m_noodles_count > 0) {
            TextView a = findViewById(R.id.m_n_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Manchurian Noodles", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (s_noodles_count > 0) {
            TextView a = findViewById(R.id.s_n_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Schezwan Noodles", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (f_noodles_count > 0) {
            TextView a = findViewById(R.id.fried_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Fried Noodles", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (hakka_noodle_cout > 0) {
            TextView a = findViewById(R.id.hakka_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Hakka Noodles", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (noodles_soup_count > 0) {
            TextView a = findViewById(R.id.n_soup_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Noodles Soup", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (f_rice_count > 0) {
            TextView a = findViewById(R.id.fried_rice_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Fried Rice", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (s_rice_count > 0) {
            TextView a = findViewById(R.id.s_rice_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Schezwan Rice", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (m_rice_count > 0) {
            TextView a = findViewById(R.id.m_rice_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Manchurian Rice", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (ch_bhel_count > 0) {
            TextView a = findViewById(R.id.ch_bhel_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            Order o = new Order("Chinese Bhel", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        Intent intent=new Intent(this,MenuActivity.class);
        startActivity(intent);
    }
}

