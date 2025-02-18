package com.bridgelabz.sudhakar.advance.detectduplicates;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String path = "/Users/siddhu/Desktop/cg-tut/Week5/Day01-CsvDataHandling/src/main/resources/sample1.csv";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line = bufferedReader.readLine();
            String[] columns = line.split(",");
            System.out.printf("%-5s%-10s%-10s%-10s%n",columns[0],columns[1],columns[2],columns[3]);
            Set<String> set = new HashSet<>();
            while((line = bufferedReader.readLine()) != null){
                columns = line.split(",");
                if(set.contains(columns[0])){
                    System.out.printf("%-5s%-10s%-10s%-10s%n",columns[0],columns[1],columns[2],columns[3]);

                }
                set.add(columns[0]);

            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
