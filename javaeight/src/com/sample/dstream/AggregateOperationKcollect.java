package com.sample.dstream;

import java.util.*;
import java.util.stream.Collectors;

public class AggregateOperationKcollect {

    private static class Averager {
        private int total = 0;
        private int count = 0;

        public double average() {
            return count > 0 ? (double) total / count : 0;
        }

        public void accumulate(int i) {
            total += i;
            count++;
        }

        public void combine(Averager other) {
            total += other.total;
            count += other.count;
        }
    }

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

        Averager averageCollect = collection.stream()
                .filter(person -> person.getGender() == Person.Gender.Male)
                .map(person -> person.getAge())
                .collect(Averager::new, Averager::accumulate, Averager::combine);

        System.out.println("\nAverage age of makes: " + averageCollect.average());

        Map<Person.Gender, List<Person>> genderListMap = collection.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        for (Map.Entry<Person.Gender, List<Person>> entry : genderListMap.entrySet()) {
            System.out.println(entry);
        }

        System.out.println("\nList by cities: ");
        Map<String, List<Person>> citiesListMap = collection.stream()
                .collect(Collectors.groupingBy(Person::getCity));

        for (Map.Entry<String, List<Person>> entry : citiesListMap.entrySet()) {
            System.out.println(entry);
        }

        System.out.println("\nAverage age by cities: ");
        Map<String, Double> citiesAverageAgeListMap = collection.stream()
                .collect(Collectors.groupingBy(Person::getCity, Collectors.averagingInt(Person::getAge)));

        for (Map.Entry<String, Double> entry : citiesAverageAgeListMap.entrySet()) {
            System.out.println(entry);
        }

    }
}
