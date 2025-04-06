package com.bridgelabz.sudhakar.basics.readcsv;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String path = "/Users/siddhu/Desktop/cg-tut/Week5/Day01-CsvDataHandling/src/main/resources/sample1.csv";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line;
            while((line = bufferedReader.readLine()) != null){
                String[] cells = line.split(",");
                System.out.printf("%-10s %-20s %-5s %-5s%n",cells[0],cells[1],cells[2],cells[3]);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
