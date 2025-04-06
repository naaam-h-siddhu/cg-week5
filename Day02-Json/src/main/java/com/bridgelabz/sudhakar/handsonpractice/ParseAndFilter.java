package com.bridgelabz.sudhakar.handsonpractice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class ParseAndFilter {
    public static void main(String[] args)throws  Exception {
        File file = new File("/Users/siddhu/Desktop/cg-tut/Week5/Day02-Json/src/main/resources/sample.json");
        ObjectMapper objectMapper =new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(file);

        if(jsonNode.isArray()){
            for(JsonNode element: jsonNode){
                if(element.get("age").asInt()>25){
                    System.out.println(element.toPrettyString());
                }
            }
        }

    }
}

