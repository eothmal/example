package com.mycompany.c.custom.e.fifth;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collection;

public class MainRetentionRuntimeTest {
    public static void main(String[] args) throws IllegalAccessException {

        Person p1 = new Person();
        p1.setType(Person.Type.STUDENT);
        p1.setName("John");

        Person p2 = new Person();
        p1.setType(Person.Type.STAFF);

        Person p3 = new Person();
        p3.setName("Lucy");

        System.out.println("Person1: " + p1);
        System.out.println("Person2: " + p2);
        System.out.println("Person3: " + p2);

        Collection<Person> collection = Arrays.asList(p1, p2, p3);

        checkRequiredFields(collection);
    }

    private static void checkRequiredFields(Collection<Person> collection) throws IllegalAccessException {

        // NOTE: This give you access to all fields even
        // private fields in a class
        Field[] fields = Person.class.getDeclaredFields();

        for (Person p : collection) {
            System.out.println("\nChecking person: " + p);

            for (Field field : fields) {

                if (Modifier.isPrivate(field.getModifiers())) {

                    // NOTE: This is needed to be able to access private fields
                    // from code
                    field.setAccessible(true);

                    Annotation[] annotations = field.getDeclaredAnnotations();
                    for (Annotation annotation : annotations) {

                        if (annotation instanceof Required) {

                            System.out.println("Checking field: " + field.getName());
                            if (field.get(p) == null) {
                                System.out.println("Required field: " +
                                        field.getName() + " does not have a valid value");
                            }
                        }
                    }
                }
            }
        }
    }
}
