package demo.java.features.java10.localvariabletypeinference;

import java.util.List;

public class LocalVariableInferenceDemo {

    public static void main(String[] args) {
        var name = "Josh";
        var list = List.of("Josh", "Joy", "Joel");
        System.out.println(name.toUpperCase());
        list.stream().forEach(System.out::println);
        System.out.println(name instanceof String); // true
        System.out.println(list instanceof List); // true
    }
}
