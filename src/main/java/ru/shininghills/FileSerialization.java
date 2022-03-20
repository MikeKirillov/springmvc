package ru.shininghills;

import ru.shininghills.dto.StudentData;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileSerialization {
    public static void main(String[] args) throws Exception {
        StudentData studentData = new StudentData();
        studentData.setFirstName("Mike");
        studentData.setLastName("King");
        studentData.setGrade(5);

        String path = "/Users/michaelkirillov/Desktop/mike.data";

        // writing to the file
        /*try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(
                Paths.get(path)))) {
            objectOutputStream.writeObject(studentData);
            objectOutputStream.flush();
        }*/

        // reading from the file
        ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(
                Paths.get(path)));
        StudentData o = (StudentData) objectInputStream.readObject();
        System.out.println(o.getFirstName());
        System.out.println(o.getLastName());
        System.out.println(o.getGrade());
    }
}
