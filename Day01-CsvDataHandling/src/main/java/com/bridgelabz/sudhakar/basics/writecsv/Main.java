package com.bridgelabz.sudhakar.basics.writecsv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "/Users/siddhu/Desktop/cg-tut/Week5/Day01-CsvDataHandling/src/main/resources/written1.csv";
        String[] content = {
                "ID,Name,Age,Marks",
                "1,Siddhu Singh,21,87",
                "2,Yuvraj Singh,21,90",
                "3,Manish Jha,23,93",
                "4,Prinshu Singh,21,98"
        };
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))){
            for(String string: content){
                bufferedWriter.write(string+"\n");

            }
            System.out.println("File successfully written !");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
