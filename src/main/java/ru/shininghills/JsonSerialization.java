package ru.shininghills;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.shininghills.dto.StudentData;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;

public class JsonSerialization {
    public static void main(String[] args) throws Exception {
        StudentData studentData = new StudentData();
        studentData.setFirstName("Mike");
        studentData.setLastName("King");
        studentData.setGrade(5);

        ObjectMapper objectMapper = new ObjectMapper();

        String studentJson = objectMapper.writeValueAsString(studentData);
        String path = "/Users/michaelkirillov/Desktop/mike.json";

        Files.write(Paths.get(path), Collections.singleton(studentJson));

        String rawJson = Files.readString(Paths.get(path));
        StudentData deserialized = objectMapper.readValue(rawJson, StudentData.class);
    }
}
