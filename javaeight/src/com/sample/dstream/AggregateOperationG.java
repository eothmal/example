package com.sample.dstream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Function;

public class AggregateOperationG {
    public static void main(String[] args) {

        Collection<Person> collection = new ArrayList<>();
        collection.add(new Person("Amir", Person.Gender.Male, 26, "Sestle"));
        collection.add(new Person("Bakar", Person.Gender.Male, 42, "New York"));
        collection.add(new Person("Cici", Person.Gender.Female, 35, "San Fransisco"));
        collection.add(new Person("Darius", Person.Gender.Male, 32, "San Jose"));
        collection.add(new Person("Esteralda", Person.Gender.Female, 24, "Salt Lake City"));
        collection.add(new Person("Ferry", Person.Gender.Male, 45, "Boston"));


        double averageAgeOfMales = collection.stream()
                .filter(person -> person.getGender() == Person.Gender.Male)
                .mapToInt(p -> p.getAge())
                .average()
                .getAsDouble();

        System.out.println("Average age of males: " + averageAgeOfMales);

        double maxAgeOfFemales = collection.stream()
                .filter(person -> person.getGender() == Person.Gender.Female)
                .mapToInt(p -> p.getAge())
                .max()
                .getAsInt();

        System.out.println("Average age of females: " + maxAgeOfFemales);

        double sumAgeOfFemales = collection.stream()
                .filter(person -> person.getGender() == Person.Gender.Female)
                .mapToInt(p -> p.getAge())
                .sum();

        System.out.println("sum age of females: " + sumAgeOfFemales);
    }
}
