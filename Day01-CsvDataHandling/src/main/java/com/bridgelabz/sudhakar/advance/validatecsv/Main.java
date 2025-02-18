package com.bridgelabz.sudhakar.advance.validatecsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Main {
    private static final String emailRegex = "[a-zA-Z0-9._]+@[a-zA-Z.]+\\.[a-z]{2,}";
    private static final String phoneRegex = "[1-9]\\d{9}";
    public static boolean isValidPhone(String phone){
        return Pattern.matches(phoneRegex,phone);
    }
    public static boolean isValidEmail(String email){
        return Pattern.matches(emailRegex,email);
    }
    public static void main(String[] args) {
        String path = "/Users/siddhu/Desktop/cg-tut/Week5/Day01-CsvDataHandling/src/main/resources/sample2.csv";


        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line = bufferedReader.readLine();
            String[] columns = line.split(",");
            System.out.printf("%-30s%-15s%-35s%-30s%n",columns[0],columns[1],columns[2],"Remarks");
            System.out.println();
            while((line = bufferedReader.readLine())!= null){
                columns = line.split(",");
                if(!isValidPhone(columns[1]) && !isValidEmail(columns[2])){
                    System.out.printf("%-30s%-15s%-30s%-30s%n",columns[0],columns[1],columns[2],"Invalid Phone and " +
                            "Email");

                } else if (!isValidEmail(columns[2])) {
                    System.out.printf("%-30s%-15s%-35s%-30s%n",columns[0],columns[1],columns[2],"Invalid " +
                            "Email");
                } else if (!isValidPhone(columns[1])) {
                    System.out.printf("%-30s%-15s%-35s%-30s%n",columns[0],columns[1],columns[2],"Invalid Phone");

                }


            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
