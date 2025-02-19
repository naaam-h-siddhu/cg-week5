package com.bridgelabz.sudhakar.handsonpractice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Iterator;
import java.util.Map;

public class ReadKeyValue {
    public static void main(String[] args) throws Exception{
        File file = new File("/Users/siddhu/Desktop/cg-tut/Week5/Day02-Json/src/main/resources/sample.json");
        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode jsonNode = objectMapper.readTree(file);
        if(jsonNode.isArray()){
            for(JsonNode element: jsonNode){
                Iterator<Map.Entry<String,JsonNode>> fields = element.fields();
                while(fields.hasNext()){
                    Map.Entry<String,JsonNode> field = fields.next();
                    System.out.println("Key : "+field.getKey()+" Value: "+field.getValue());

                }
                System.out.println();
            }
        }

    }
}
