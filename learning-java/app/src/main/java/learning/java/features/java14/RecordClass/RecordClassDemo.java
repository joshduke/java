package demo.java.features.java14.RecordClass;

import java.util.List;

public class RecordClassDemo {
    public static void main(String[] args) {
        StudentData student1 = new StudentData("Josh", 35, "Computer Science");
        StudentData student2 = new StudentData("Joy", 34, "Commerce");
        var students = List.of(student1, student2);
        students.stream().map(studentData -> studentData.studentName()).forEach(System.out::println);
    }
}