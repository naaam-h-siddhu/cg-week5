package com.bridgelabz.sudhakar.handsonpractice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;

public class MergeTwoJsonFiles {
    public static void main(String[] args)throws  Exception {
        String path1 = "/Users/siddhu/Desktop/cg-tut/Week5/Day02-Json/src/main/resources/file1.json";
        String path2 ="/Users/siddhu/Desktop/cg-tut/Week5/Day02-Json/src/main/resources/file2.json";
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode node1 = objectMapper.readTree(new File(path1));
        JsonNode node2 = objectMapper.readTree(new File(path2));

        if(node1.isArray() && node2.isArray()){
            ArrayNode arrayNode = objectMapper.createArrayNode();
            arrayNode.addAll((ArrayNode) node1);
            arrayNode.addAll((ArrayNode) node2);
            String mergedJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(arrayNode);
            System.out.println(mergedJson);
        }
        else {
            ObjectNode node = (node1).deepCopy();
            node.setAll((ObjectNode) node2);
            String mergedJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(node);
            System.out.println(mergedJson);
        }


    }
}
