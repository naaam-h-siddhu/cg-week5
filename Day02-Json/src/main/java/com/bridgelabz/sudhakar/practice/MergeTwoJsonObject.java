package com.bridgelabz.sudhakar.practice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeTwoJsonObject {
    public static void main(String[] args) throws Exception {
        String json1 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        String json2 = "{\"age\":35, \"email\":\"john.doe@example.com\"}";

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode1 = objectMapper.readTree(json1);
        JsonNode jsonNode2 = objectMapper.readTree(json2);

        ObjectNode objectNode = (jsonNode1).deepCopy();
        objectNode.setAll((ObjectNode) jsonNode2);

        String mergedJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(objectNode);
        System.out.println(mergedJson);


    }
}
