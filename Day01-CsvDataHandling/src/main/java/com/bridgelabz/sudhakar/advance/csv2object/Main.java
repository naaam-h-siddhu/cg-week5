package com.bridgelabz.sudhakar.advance.csv2object;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Student{
    private int id;
    private String name;
    private int age;
    private int marks;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMarks() {
        return marks;
    }

    public Student(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
}
public class Main {
    public static void main(String[] args) {
        String path = "/Users/siddhu/Desktop/cg-tut/Week5/Day01-CsvDataHandling/src/main/resources/sample1.csv";
        List<Student> students = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line = bufferedReader.readLine();
            while((line = bufferedReader.readLine())!= null){
                String[] columns = line.split(",");
                int id = Integer.valueOf(columns[0]);
                String name = columns[1];
                int age = Integer.valueOf(columns[2]);
                int marks = Integer.valueOf(columns[3]);
                students.add(new Student(id,name,age,marks));

            }
        }catch (IOException e){
            e.printStackTrace();
        }
        for(Student student: students){
            System.out.println(student.toString());
        }
    }
}
