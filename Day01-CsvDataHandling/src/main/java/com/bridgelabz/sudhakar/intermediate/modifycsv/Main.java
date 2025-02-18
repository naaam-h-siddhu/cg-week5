package com.bridgelabz.sudhakar.intermediate.modifycsv;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String path = "/Users/siddhu/Desktop/cg-tut/Week5/Day01-CsvDataHandling/src/main/resources/employees.csv";
        String newPath = "/Users/siddhu/Desktop/cg-tut/Week5/Day01-CsvDataHandling/src/main/resources" +
                "/UpdatedEmployees.csv";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newPath))){

            String line = bufferedReader.readLine();
            bufferedWriter.write(line+"\n");

            while((line =bufferedReader.readLine()) != null){
                String[] columns = line.split(",");
                System.out.println(line);
                if(columns[1].equals("IT")){
                    double salary = Double.valueOf(columns[2]);
                    salary = salary+(double)(salary * 0.01);
                    columns[2] = String.valueOf(salary);
                }
                bufferedWriter.write(columns[0]+","+columns[1]+","+columns[2]+"\n");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

