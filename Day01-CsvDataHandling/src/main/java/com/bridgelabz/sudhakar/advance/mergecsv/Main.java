package com.bridgelabz.sudhakar.advance.mergecsv;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String student1 = "/Users/siddhu/Desktop/cg-tut/Week5/Day01-CsvDataHandling/src/main/resources/student1.csv";
        String student2 = "/Users/siddhu/Desktop/cg-tut/Week5/Day01-CsvDataHandling/src/main/resources/student2.csv";
        String studentMaster= "/Users/siddhu/Desktop/cg-tut/Week5/Day01-CsvDataHandling/src/main/resources/studentMaster.csv";


        try(BufferedReader bufferedReader1 = new BufferedReader(new FileReader(student1));
        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(student2));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(studentMaster))){

            bufferedReader1.readLine();
            Map<String, String[]> map = new HashMap<>();
            String line;
            while((line = bufferedReader1.readLine()) != null){
                String[] columns = line.split(",");
                map.put(columns[0].trim(),columns);
            }
            bufferedReader2.readLine();
            bufferedWriter.write("Id,Name,Age,Marks,Grade");
            bufferedWriter.newLine();
            while((line = bufferedReader2.readLine())!= null){
                String[] columns2 = line.split(",");
                String id = columns2[0].trim();
                String[] columns1 = map.get(id);
                bufferedWriter.write(id+","+columns1[1]+","+columns1[2]+","+columns2[1]+","+columns2[2]);
                bufferedWriter.newLine();
            }
            System.out.println("Csv merged Successfully !!");



        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
