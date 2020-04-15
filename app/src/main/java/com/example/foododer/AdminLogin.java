package com.example.foododer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AdminLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);
    }

    EditText text1,text2;
    public void sign(View view)
    {
        text1=findViewById(R.id.editText6);
        text2=findViewById(R.id.editText7);
        String str1="",str2="";
        str1=text1.getText().toString();
        str2=text2.getText().toString();
         if(!TextUtils.isEmpty(str1) && !TextUtils.isEmpty(str2)) {
             if (str1.equals("admin") && str2.equals("admin")) {
                 text1.setText("");
                 text2.setText("");
                 Intent intend = new Intent(this, OderDtaile.class);
                 startActivity(intend);
             } else {
                 Toast.makeText(this, "Please Enter Correct Information", Toast.LENGTH_LONG);
             }
         }
         else
             Toast.makeText(this,"Enter All Detaile",Toast.LENGTH_LONG);
    }
}
