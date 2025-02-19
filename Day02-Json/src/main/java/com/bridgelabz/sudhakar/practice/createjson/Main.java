package com.bridgelabz.sudhakar.practice.createjson;

import org.json.JSONArray;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        JSONArray objects= new JSONArray();
        jsonObject.put("name","Siddhu Singh");
        jsonObject.put("age",21);
        objects.put("Math");
        objects.put("Physics");
        objects.put("Biology");
        jsonObject.put("subjects",objects);
        System.out.println(jsonObject.toString(2));
    }
}
