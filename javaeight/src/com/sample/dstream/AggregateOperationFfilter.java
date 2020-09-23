package com.sample.dstream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Function;

public class AggregateOperationFfilter {
    public static void main(String[] args) {

        Collection<Person> collection = new ArrayList<>();
        collection.add(new Person("Amir", Person.Gender.Male, 26, "Sestle"));
        collection.add(new Person("Bakar", Person.Gender.Male, 42, "New York"));
        collection.add(new Person("Cici", Person.Gender.Female, 35, "San Fransisco"));
        collection.add(new Person("Darius", Person.Gender.Male, 32, "San Jose"));
        collection.add(new Person("Esteralda", Person.Gender.Female, 24, "Salt Lake City"));
        collection.add(new Person("Ferry", Person.Gender.Male, 45, "Boston"));

        collection.stream()
                .filter(p -> p.getGender() == Person.Gender.Male)
                .map(new Function<Person, String>() {
                    public String apply(Person p){
                        return p.getName() +", " + p.getCity();
                    }
                })
                .forEach(new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        System.out.println(s);
                    }
                });
        System.out.println("\nWith Lambda: ");
        collection.stream()
                .filter(p -> p.getGender() == Person.Gender.Male)
                .map(p -> p.getName() + ", " + p.getCity())
                .forEach(s -> System.out.println(s));


        System.out.println("\nWith Lambda to Female to upper: ");
        collection.stream()
                .filter(p -> p.getGender() == Person.Gender.Female)
                .map(p -> p.getName() + ", " + p.getCity())
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));

        System.out.println("\nWith Lambda to Female to method references: ");
        collection.stream()
                .filter(p -> p.getGender() == Person.Gender.Female)
                .map(p -> p.getName() + ", " + p.getCity())
                .map(String::toUpperCase)
                .forEach(s -> System.out.println(s));

        System.out.println("\nWith Lambda to Male age in int: ");
        collection.stream()
                .filter(p -> p.getGender() == Person.Gender.Male)
                .mapToInt(p -> p.getAge())
                .forEach(s -> System.out.println(s));


        System.out.println("\nWith Lambda to Male age in long: ");
        collection.stream()
                .filter(p -> p.getGender() == Person.Gender.Male)
                .mapToLong(p -> p.getAge())
                .forEach(s -> System.out.println(s));

        System.out.println("\nWith Lambda to Male age in double: ");
        collection.stream()
                .filter(p -> p.getGender() == Person.Gender.Male)
                .mapToDouble(p -> p.getAge())
                .forEach(s -> System.out.println(s));

    }
}
