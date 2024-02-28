package demo.java.features.java8.optional;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        Arrays.asList("Josh", "Joy", "Joel").stream()
                .map(Student::new)
                .map(s -> s.getAssignedElective().orElse("GENERAL"))
                .forEach(System.out::println);

    }

}


class Student {

    private String name;
    private String assignedElective = null;

    Student(String name) {
        this.name = name;
    }

    public Optional<String> getAssignedElective() {
        if(this.name.equals("Joel")) {
            this.assignedElective = "Writing";
        }
        return Optional.ofNullable(this.assignedElective);
    }

}
