package com.bridgelabz.sudhakar.intermediate.searchrecord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "/Users/siddhu/Desktop/cg-tut/Week5/Day01-CsvDataHandling/src/main/resources/employees.csv";
        String name = "Siddharth Joshi";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line = bufferedReader.readLine();
            String[] columns = line.split(",");

            System.out.printf("%-20s%-20s%-5s%n",columns[0],columns[1],columns[2]);
            System.out.println();
            while ((line = bufferedReader.readLine()) != null) {

                columns = line.split(",");
                if(columns[0].equals(name)){
                    System.out.printf("%-20s%-20s%-5s%n",columns[0],columns[1],columns[2]);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
