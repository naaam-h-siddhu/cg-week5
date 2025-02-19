package com.bridgelabz.sudhakar.handsonpractice;
import com.fasterxml.jackson.databind.JsonNode;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import java.io.File;

public class ConvertJsonToXml {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(
                new File("/Users/siddhu/Desktop/cg-tut/Week5/Day02-Json/src/main/resources/sample.json"));

        XmlMapper xmlMapper = new XmlMapper();

        // 1. For a single JSON object (not an array):
        if (jsonNode.isObject()) {
            xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true); // Add XML declaration
            String xml = xmlMapper.writeValueAsString(jsonNode);
            xmlMapper.writeValue(
                    new File("/Users/siddhu/Desktop/cg-tut/Week5/Day02-Json/src/main/resources/sample.xml"),
                    jsonNode);
            System.out.println(xml);
        }

        // 2. For a JSON array of objects (more common):
        if (jsonNode.isArray()) {
            // Create a wrapper object with a custom root element name
            ObjectNode wrapper = objectMapper.createObjectNode();
            wrapper.set("employees", jsonNode); // "employees" is the root element name

            xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true); // Add XML declaration
            String xml = xmlMapper.writeValueAsString(wrapper);
            xmlMapper.writeValue(
                    new File("/Users/siddhu/Desktop/cg-tut/Week5/Day02-Json/src/main/resources/sample.xml"),
                    wrapper);
            System.out.println(xml);
        }
    }
}