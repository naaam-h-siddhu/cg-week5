package com.bridgelabz.sudhakar.IplCensorAnalyzer;

public class Main {
    public static void main(String[] args)throws Exception {
        final String csvPath = "/Users/siddhu/Desktop/cg-tut/Week5/Day02-Json/src/main/resources/IplRecords.csv";
        final String modifiedCsvPath = "/Users/siddhu/Desktop/cg-tut/Week5/Day02-Json/src/main/resources" +
                "/IplRecordsModified.csv";
        CsvCensor.censorCsvContent(csvPath,modifiedCsvPath);
    }
}
