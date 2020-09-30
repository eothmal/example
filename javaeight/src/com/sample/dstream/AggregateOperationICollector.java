package com.sample.dstream;

import java.util.*;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;

public class AggregateOperationICollector {
    public static void main(String[] args) {

        Collection<Person> collection = new ArrayList<>();
        collection.add(new Person("Amir", Person.Gender.Male, 26, "Seattle"));
        collection.add(new Person("Baker", Person.Gender.Male, 42, "New York"));
        collection.add(new Person("Claire", Person.Gender.Female, 35, "San Fransisco"));
        collection.add(new Person("Darius", Person.Gender.Male, 32, "San Jose"));
        collection.add(new Person("Esmeralda", Person.Gender.Female, 24, "Salt Lake City"));
        collection.add(new Person("Ferry", Person.Gender.Male, 45, "Boston"));
        collection.add(new Person("George", Person.Gender.Male, 39, "New York"));
        collection.add(new Person("Hasan", Person.Gender.Male, 29, "Seattle"));
        collection.add(new Person("Irina", Person.Gender.Female, 43, "Boston"));
        collection.add(new Person("Julia", Person.Gender.Female, 29, "New York"));

        List<String> citiesList = collection.stream()
                .filter(person -> person.getGender() == Person.Gender.Male)
                .map(person -> person.getCity())
                .collect(Collectors.toList());

        System.out.println("\nList of cities of (males): " + citiesList);

        Set<String> citiesSet = collection.stream()
                .filter(person -> person.getGender() == Person.Gender.Male)
                .map(person -> person.getCity())
                .collect(Collectors.toSet());

        System.out.println("\nSet of cities of (males): " + citiesSet);

        Set<String> citiesTreeSet = collection.stream()
                .filter(person -> person.getGender() == Person.Gender.Male)
                .map(person -> person.getCity())
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println("\nTreeSet of cities of (males): " + citiesTreeSet);

        String nameString = collection.stream()
                .filter(person -> person.getGender() == Person.Gender.Female)
                .map(Person::getName)
                .collect(Collectors.joining(", "));

        System.out.println("\nComa separated names: " + nameString);

        //method reference :: example Person::getAge
        double averageAge = collection.stream()
                .filter(person -> person.getGender() == Person.Gender.Female)
                .collect(Collectors.averagingInt(Person::getAge));

        System.out.println("\nAverage age for females: " + averageAge);

        IntSummaryStatistics summaryStatistics = collection.stream()
                .filter(person -> person.getGender() == Person.Gender.Female)
                .collect(Collectors.summarizingInt(Person::getAge));

        System.out.println("\nSummary statistics for females: " + summaryStatistics);

    }
}
