package com.sample.dstream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AggregateOperationL {


    public static void main(String[] args) {

        Collection<Person> collection = new ArrayList<>();
        collection.add(new Person("Amir", Person.Gender.Male, 26, "Seattle"));
        collection.add(new Person("Bakar", Person.Gender.Male, 42, "New York"));
        collection.add(new Person("Cici", Person.Gender.Female, 35, "San Fransisco"));
        collection.add(new Person("Darius", Person.Gender.Male, 32, "San Jose"));
        collection.add(new Person("Esmeralda", Person.Gender.Female, 24, "Salt Lake City"));
        collection.add(new Person("Ferry", Person.Gender.Male, 45, "Boston"));
        collection.add(new Person("Gagu", Person.Gender.Male, 39, "New York"));
        collection.add(new Person("Hasan", Person.Gender.Male, 29, "Seattle"));
        collection.add(new Person("Irina", Person.Gender.Female, 43, "Boston"));
        collection.add(new Person("Julia", Person.Gender.Female, 29, "New York"));

        collection.parallelStream()
                .filter(person -> person.getGender() == Person.Gender.Female)
                .map(person -> person.getName() + ", " + person.getCity())
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));

    }
}
