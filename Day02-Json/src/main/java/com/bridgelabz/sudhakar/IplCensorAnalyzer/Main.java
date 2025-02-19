package com.bridgelabz.sudhakar.IplCensorAnalyzer;

import com.fasterxml.jackson.databind.JsonNode;

public class Main {
    public static void main(String[] args)throws Exception {
        final String csvPath = "/Users/siddhu/Desktop/cg-tut/Week5/Day02-Json/src/main/resources/IplRecords.csv";
        final String modifiedCsvPath = "/Users/siddhu/Desktop/cg-tut/Week5/Day02-Json/src/main/resources" +
                "/IplRecordsModified.csv";
        CsvCensor.censorCsvContent(csvPath,modifiedCsvPath);

        final String jsonPath = "/Users/siddhu/Desktop/cg-tut/Week5/Day02-Json/src/main/resources/IplRecord.json";
        final String jsonPathModified ="/Users/siddhu/Desktop/cg-tut/Week5/Day02-Json/src/main/resources" +
                "/IplRecordModified" +
                ".json";
        JsonCensor.censorJsonContent(jsonPath,jsonPathModified);
    }
}
