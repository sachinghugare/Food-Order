package com.example.foododer;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OderDtaile extends AppCompatActivity {
  TextView view1;
    EditText text,text1,text2,text3;
    final ArrayList<Map>arrayList=new ArrayList<Map>(50);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oder_dtaile);

    }

    public void retrive(View view)
    {

        FirebaseDatabase database=FirebaseDatabase.getInstance();
        DatabaseReference myref=database.getReference().child("Orderdetaile").child("1234567890").child("Lassi");

        myref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Integer v=dataSnapshot.getValue(Integer.class);

                 String str=new String(String.valueOf(v));
                Toast.makeText(getApplicationContext()," "+str,Toast.LENGTH_LONG).show();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }

    public void retrive1(View view)
    {
        final int c = 0;

        FirebaseDatabase database=FirebaseDatabase.getInstance();
        DatabaseReference ref=database.getReferenceFromUrl(Conf.url);
       ref.addListenerForSingleValueEvent(new ValueEventListener() {
           @Override
           public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
               for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
                   Map<String, String> map = (Map) postSnapshot.getValue();
                   if (map != null) {
                       int message = map.size();
                       arrayList.add(map);
                       //String userName = map.get("Username");
                       Toast.makeText(getApplicationContext(),""+message,Toast.LENGTH_LONG).show();
                       int str=arrayList.size();
                       Toast.makeText(getApplicationContext(),"ArrayList Length"+str,Toast.LENGTH_LONG).show();

                   }
               }
           }

           @Override
           public void onCancelled(@NonNull DatabaseError databaseError) {

           }
       });
    }

    public void data(View view)
    {
        int count=0;
        view1=findViewById(R.id.textView7);
       // text1=findViewById(R.id.editText8);
       // text2=findViewById(R.id.editText9);
       // text3=findViewById(R.id.editText10);
              view1.setText("  Oder Detaile \n"+arrayList.get(0).toString()+"\n\n\n"+arrayList.get(1).toString()+"\n\n\n"+arrayList.get(2).toString());


      for(Map map:arrayList)
      {
          //text.setText("\n"+arrayList.get(0).toString()+"\n"+arrayList.get(1).toString()+"\n"+arrayList.get(2).toString());




      }


    }


}
