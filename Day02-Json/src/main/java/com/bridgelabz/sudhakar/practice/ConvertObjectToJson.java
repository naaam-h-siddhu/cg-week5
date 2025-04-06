package com.bridgelabz.sudhakar.practice;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

class Car{
    private String name;
    private String engine;
    private String brand;
    private int numberOfWheels;

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public String getBrand() {
        return brand;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public Car(String name, String engine, String brand, int numberOfWheels) {
        this.name = name;
        this.engine = engine;
        this.brand = brand;
        this.numberOfWheels = numberOfWheels;
    }
}
public class ConvertObjectToJson {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Alto","V2 Diesel","Maruti",4));
        cars.add(new Car("Hector","V6 Petrol","MG",4));
        cars.add(new Car("Scorpio","V6 Petrol","Mahindra",4));

        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject = new JSONObject();
        for(Car car: cars){
            String name = car.getName();
            String engine = car.getEngine();
            String brand = car.getBrand();
            int numberOfWheels = car.getNumberOfWheels();
            jsonObject.put("Name",name);
            jsonObject.put("Engine",engine);
            jsonObject.put("Brand",brand);
            jsonObject.put("Number of Wheels",numberOfWheels);
            jsonArray.put(jsonObject);
        }
        System.out.println(jsonArray.toString(2));
    }
}
