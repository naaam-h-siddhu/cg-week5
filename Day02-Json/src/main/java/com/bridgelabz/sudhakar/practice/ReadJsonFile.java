package com.bridgelabz.sudhakar.practice;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

public class ReadJsonFile {
    public static void main(String[] args) throws  Exception{

        ObjectMapper objectMapper = new ObjectMapper();
        List<Employee> employees = objectMapper.readValue(new File("/Users/siddhu/Desktop/cg-tut/Week5/Day02-Json/src/main/resources/sample.json"), new TypeReference<List<Employee>>() {
        });
        for(Employee employee: employees){
            System.out.println(employee.toString());

        }

    }
}
@JsonIgnoreProperties(ignoreUnknown = true) // Ignore unknown properties
class Employee{
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void setEmail(String email) {
        this.email = email;
    }
}