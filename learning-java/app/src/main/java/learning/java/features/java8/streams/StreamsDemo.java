package learning.java.features.java8.streams;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsDemo {

    public static void main(String[] args) {

        // Skip
        List<String> names = List.of("James", "Benny", "Benny", "Sam", "Sam", "David", "Sam");
        names.stream().skip(2).forEach(System.out::println);
        // limit
        names.stream().limit(2).forEach(System.out::println);

        System.out.println("Sorted List ---");
        // Sorted
        names.stream().sorted().forEach(System.out::println);

        names.stream().collect(Collectors.toMap(Function.identity(), String::length, (integer, integer2) -> integer2 + integer)).forEach((k,v) -> {
            System.out.println(k + " :: " + v);
        });

        String input = "ABCAACBMCKA";

        System.out.println(List.of(input.chars().map(c -> (char) c).count()));
        input.chars().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.toMap(Function.identity(), String::length, (length, preLen) -> length+preLen))
                .forEach((k,v) -> {
                    System.out.println(k + " :: " + v);
                });

//                .collect(Collectors.toMap(Function.identity(), String::length, (currentLen, prevLen) -> currentLen + prevLen)).forEach((k,v) -> {
//            System.out.println(k + " :: " + v);
//        });
    }
}
