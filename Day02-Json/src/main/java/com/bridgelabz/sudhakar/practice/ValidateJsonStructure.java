package com.bridgelabz.sudhakar.practice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

import java.io.File;

public class ValidateJsonStructure {
    public static void main(String[] args)throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(new File("/Users/siddhu/Desktop/cg-tut/Week5/Day02-Json/src/main" +
                "/resources/schema.json"));
        JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
        JsonSchema schema = factory.getJsonSchema(jsonNode);

        JsonNode jsonData = objectMapper.readTree(new File("/Users/siddhu/Desktop/cg-tut/Week5/Day02-Json/src/main" +
                "/resources/sample.json"));
        if(schema.validate(jsonData).isSuccess()){
            System.out.println("Json is valid !!");
        }
        else System.out.println("Invalid Json");

    }
}
