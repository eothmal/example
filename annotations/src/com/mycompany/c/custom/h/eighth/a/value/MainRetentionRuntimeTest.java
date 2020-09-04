package com.mycompany.c.custom.h.eighth.a.value;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.Collection;

public class MainRetentionRuntimeTest {
    public static void main(String[] args) throws IllegalAccessException, IllegalAccessException {
        ComputerScienceStudent scStudent = new ComputerScienceStudent("John");
        ElectricalEngineeringStudent eeStudent1 = new ElectricalEngineeringStudent("Laura");
        ElectricalEngineeringStudent eeStudent2 = new ElectricalEngineeringStudent("Catalina");

        Collection<Person> collection = Arrays.asList(scStudent, eeStudent1, eeStudent2);

        printDetailsStudents(collection);
    }

    private static void printDetailsStudents(Collection<Person> collection)
            throws IllegalArgumentException, IllegalAccessException {

        for (Person p : collection) {

            System.out.println("\nChecking Person: " + p);

            Annotation[] annotations = p.getClass().getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof Major) {
                    Major major = (Major) annotation;

                    System.out.println("Specialization: " + major.value());
                }
            }

        }
    }

}
