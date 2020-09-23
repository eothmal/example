package com.sample.dstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class AggregateOperationEfilter {
    public static void main(String[] args) {

        Collection<Person> collection = new ArrayList<>();
        collection.add(new Person("Amir", Person.Gender.Male, 26, "Sestle"));
        collection.add(new Person("Bakar", Person.Gender.Male, 42, "New York"));
        collection.add(new Person("Cici", Person.Gender.Female, 35, "San Fransisco"));
        collection.add(new Person("Darius", Person.Gender.Male, 32, "San Jose"));
        collection.add(new Person("Esteralda", Person.Gender.Female, 24, "Salt Lake City"));
        collection.add(new Person("Ferry", Person.Gender.Male, 45, "Boston"));

        long numMales = collection.stream()
                .filter(person -> person.getGender() == Person.Gender.Male)
                .count();
        System.out.println("\nNumber of males " + numMales);

        long numUnder30 = collection.stream()
                .filter(p -> p.getAge() < 30)
                .count();
        System.out.println("\nNumber under 30:  " + numUnder30);

        collection.stream()
                .filter(p -> p.getGender() == Person.Gender.Male)
                .forEach(new Consumer<Person>() {
                    @Override
                    public void accept(Person person) {
                        System.out.println(person);
                    }
                });
        System.out.println("\nFemales: ");
        collection.stream()
                .filter(p -> p.getGender() == Person.Gender.Female)
                .forEach(p -> System.out.println(p));

    }
}
