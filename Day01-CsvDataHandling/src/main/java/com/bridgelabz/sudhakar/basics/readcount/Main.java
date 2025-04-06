package com.bridgelabz.sudhakar.basics.readcount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "/Users/siddhu/Desktop/cg-tut/Week5/Day01-CsvDataHandling/src/main/resources/machine-readable" +
                "-business-employment-data-sep-2024-quarter.csv";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            int count = 0;
            String line;
            while((line = bufferedReader.readLine())!=null){
                count++;
            }
            System.out.println("Number of rows in csv file = "+(count-1));
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
