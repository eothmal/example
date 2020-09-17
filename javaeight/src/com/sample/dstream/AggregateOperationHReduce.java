package com.sample.dstream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.IntBinaryOperator;

public class AggregateOperationHReduce {
    public static void main(String[] args) {

        Collection<Person> collection = new ArrayList<>();
        collection.add(new Person("Amir", Person.Gender.Male, 26, "Sestle"));
        collection.add(new Person("Bakar", Person.Gender.Male, 42, "New York"));
        collection.add(new Person("Cici", Person.Gender.Female, 35, "San Fransisco"));
        collection.add(new Person("Darius", Person.Gender.Male, 32, "San Jose"));
        collection.add(new Person("Esteralda", Person.Gender.Female, 24, "Salt Lake City"));
        collection.add(new Person("Ferry", Person.Gender.Male, 45, "Boston"));

        double maxFemaleAge = collection.stream()
                .filter(person -> person.getGender() == Person.Gender.Female)
                .mapToInt(p -> p.getAge())
                .reduce(0, new IntBinaryOperator() {
                    @Override
                    public int applyAsInt(int left, int right) {
                        if (left >= right){
                            return left;
                        }
                        return right;
                    }
                });
        System.out.println("\nMax female age: " + maxFemaleAge);

        int minMaleAge = collection.stream()
                .filter(person -> person.getGender() == Person.Gender.Male)
                .mapToInt(p -> p.getAge())
                .reduce(Integer.MAX_VALUE, (left, right) -> left <= right ? left : right);

        System.out.println("\nMin male age: " + minMaleAge);

        double sumFemaleAge = collection.stream()
                .filter(person -> person.getGender() == Person.Gender.Female)
                .mapToInt(p -> p.getAge())
                .reduce(0, (left, right) -> left + right);

        System.out.println("\nSum female age: " + sumFemaleAge);
    }
}
