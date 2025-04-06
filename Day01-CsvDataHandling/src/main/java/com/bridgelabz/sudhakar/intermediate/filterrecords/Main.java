package com.bridgelabz.sudhakar.intermediate.filterrecords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "/Users/siddhu/Desktop/cg-tut/Week5/Day01-CsvDataHandling/src/main/resources/Read.csv";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line = bufferedReader.readLine();
            String[] strings = line.split(",");
            System.out.printf("%-10s%-20s%-5s%-5s%n",strings[0],strings[1],strings[2],strings[3]);


            while ((line = bufferedReader.readLine()) != null){


                strings = line.split(",");
                if(Integer.parseInt(strings[3]) > 80) {
                    System.out.printf("%-10s%-20s%-5s%-5s%n",strings[0],strings[1],strings[2],strings[3]);

                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
