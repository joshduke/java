package demo.java.features.java15.TextBlocks;

import demo.java.features.java14.RecordClass.StudentData;

import java.util.List;
import java.util.stream.Stream;

public class TextBlockDemo {

    public static void main(String[] args) {
        String payload = """
                "request": {
                    "age": %d,
                    "name": %s
                }
                """;
        StudentData student1 = new StudentData("Josh", 35, "Computer Science");
        StudentData student2 = new StudentData("Joy", 34, "Commerce");
        var students = List.of(student1, student2);
        students.stream()
                .map(student -> payload.formatted(student.age(), student.studentName()))
                .forEach(System.out::println);
    }

}
