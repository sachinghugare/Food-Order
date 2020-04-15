package com.example.foododer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Order {

   final static   Map<String,Integer>Map2=new HashMap<String, Integer>();
   final static ArrayList<Map>array=new ArrayList<Map>();
Order(){}
    Order(String a,int b){
        Map2.put(a,b);
        //Map2.put("Sandwich",5);
        array.add(Map2);

    }
}
