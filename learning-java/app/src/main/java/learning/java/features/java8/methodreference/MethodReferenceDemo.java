package demo.java.features.java8.methodreference;

import java.util.Arrays;

public class MethodReferenceDemo {

    public static void main(String[] args) {
        Arrays.asList("Josh", "Joy", "Joel Williams").stream().map(Person::new).forEach(Person::printNameInCAPS);
    }

}


class Person {

    private String name;

    Person(String name) {
        this.name = name;
    }

    public void printNameInCAPS() {
        System.out.println(this.name.toUpperCase());
    }

}