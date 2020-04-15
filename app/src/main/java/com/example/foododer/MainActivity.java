package com.example.foododer;

import android.content.Intent;
import android.graphics.PostProcessor;
import android.nfc.Tag;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.ChildEventListener;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    public static final String TAG="Your name";
    EditText text1,text2,text5;
    String value;
    public static String id="";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //FirebaseDatabase database = FirebaseDatabase.getInstance();
        //DatabaseReference myRef = database.getReference();

        //myRef.setValue("Hello Ganesh");

    }


    public void click(View view) {
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }




      public static class Post{

        public String password=" ";
        Post()
        {
            this.password="";

        }
        Post(String str2)
        {
            this.password =str2;

        }
    }
    public void Check(View view)
    {
        text1=findViewById(R.id.editText);
        text2=findViewById(R.id.editText2);


         final String str1,str2;
        final boolean[] n = {false};
        str1=text1.getText().toString();
        str2=text2.getText().toString();
         id = str1;

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference().child("userdetails").child(id);
        if (!TextUtils.isEmpty(str1) && !TextUtils.isEmpty(str2)) {
            if (str1.length() != 10) {
                Toast.makeText(getApplicationContext(), "Enter 10 digit Mob No ", LENGTH_LONG).show();
            } else {
                myRef.addValueEventListener(new ValueEventListener() {


                    public void onDataChange(DataSnapshot dataSnapshot) {
                        boolean p=dataSnapshot.exists();
                        if(p) {
                            Post post = dataSnapshot.getValue(Post.class);
                            if (post.password.isEmpty())
                                Toast.makeText(getApplicationContext(), "User name invalied", LENGTH_LONG).show();
                            else if ((post.password).equals(str2)) {
                                text1.setText("");
                                text2.setText("");
                                Toast.makeText(getApplicationContext(), "Login Sucessfully", LENGTH_LONG).show();
                                n[0]=true;
                            }
                            if(n[0])
                            {
                                Intent intent=new Intent(getApplicationContext(),MenuActivity.class);
                                startActivity(intent);

                            }

                        }else {
                            Toast.makeText(getApplicationContext(), "Please Check The Details Or Sign IN", LENGTH_LONG).show();
                        }

                    }


                    public void onCancelled(DatabaseError error) {
                        // Failed to read value
                        // Log.d(TAG, "Failed to read value.", error.toException());
                        Toast.makeText(getApplicationContext(), "Please Sign Up First", LENGTH_LONG).show();

                    }
                });

                //  Toast.makeText(this, "Login Sucessfully", LENGTH_LONG).show();
            }
            }
        else{
                Toast.makeText(this, "Please Fill All Detaile", LENGTH_LONG).show();
            }

    }

    public void admin(View view)
    {
        Intent intend=new Intent(this,AdminLogin.class);
        startActivity(intend);
    }
}
