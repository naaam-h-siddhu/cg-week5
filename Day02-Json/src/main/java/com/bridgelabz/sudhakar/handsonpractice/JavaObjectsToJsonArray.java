package com.bridgelabz.sudhakar.handsonpractice;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

class ConvertListOfObjectToJsonArray {

    public static void main(String[] args) {
        List<Mobile> mobiles = new ArrayList<>();
        mobiles.add(new Mobile("Samsung",210));
        mobiles.add(new Mobile("Apple",200));
        mobiles.add(new Mobile("Google",180));

        JSONArray jsonArray = new JSONArray();
        for(Mobile mobile: mobiles){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("Name",mobile.getName());
            jsonObject.put("Weight",mobile.getWeight());
            jsonArray.put(jsonObject);
        }
        System.out.println(jsonArray.toString(2));
    }
}
class Mobile{
    public Mobile(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    private String name;
    private int weight;

    @Override
    public String toString() {
        return "Mobile{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
