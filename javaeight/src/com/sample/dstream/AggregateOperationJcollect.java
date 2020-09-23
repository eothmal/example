package com.sample.dstream;

import java.util.*;
import java.util.stream.Collectors;

public class AggregateOperationJcollect {
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

        List<String> citiesList = collection.stream()
                .filter(person -> person.getGender() == Person.Gender.Male)
                .map(Person::getCity)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        System.out.println("\nList of cities (males): " + citiesList);

        Set<String> citiesSet = collection.stream()
                .filter(person -> person.getGender() == Person.Gender.Male)
                .map(person -> person.getCity())
                .collect(HashSet::new, HashSet::add, HashSet::addAll);

        System.out.println("\nSet of cities (males): " + citiesSet);

    }
}
