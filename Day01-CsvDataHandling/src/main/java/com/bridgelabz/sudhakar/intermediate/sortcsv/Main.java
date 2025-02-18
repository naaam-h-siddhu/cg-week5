package com.bridgelabz.sudhakar.intermediate.sortcsv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
    private String name;
    private String department;
    private double salary;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
public class Main {

    public static void main(String[] args) {
        String path = "/Users/siddhu/Desktop/cg-tut/Week5/Day01-CsvDataHandling/src/main/resources/employees.csv";
        List<Employee> employeeList = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line = bufferedReader.readLine();
            while((line = bufferedReader.readLine())!=null){
                String[] columns = line.split(",");
                String name  = columns[0].trim();
                String department = columns[1].trim();
                double salary = Double.valueOf(columns[2].trim());
                employeeList.add(new Employee(name,department,salary));
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        Collections.sort(employeeList, Comparator.comparingDouble(Employee::getSalary).reversed());
        System.out.println("Top 5 salaries: ");
        int i = 0;
        for(Employee employee : employeeList){
            System.out.println(employee.toString());
            i++;
            if(i== 5) break;
        }
    }
}
