package com.mycompany.custom.i.ninth;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.Collection;

public class MainRetentionRuntimeTest {
    public static void main(String[] args) throws IllegalAccessException, IllegalAccessException {
        com.mycompany.custom.i.ninth.ComputerScienceStudent scStudent = new com.mycompany.custom.i.ninth.ComputerScienceStudent("John");
        com.mycompany.custom.i.ninth.ElectricalEngineeringStudent eeStudent1 = new com.mycompany.custom.i.ninth.ElectricalEngineeringStudent("Laura");
        com.mycompany.custom.i.ninth.ElectricalEngineeringStudent eeStudent2 = new com.mycompany.custom.i.ninth.ElectricalEngineeringStudent("Catalina");

        Collection<com.mycompany.custom.i.ninth.Person> collection = Arrays.asList(scStudent, eeStudent1, eeStudent2);

        printDetailsStudents(collection);
    }

    private static void printDetailsStudents(Collection<com.mycompany.custom.i.ninth.Person> collection)
            throws IllegalArgumentException, IllegalAccessException {

        for (com.mycompany.custom.i.ninth.Person p : collection) {

            System.out.println("\nChecking Person: " + p);

            Annotation[] annotations = p.getClass().getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof com.mycompany.custom.i.ninth.Major) {
                    com.mycompany.custom.i.ninth.Major major = (com.mycompany.custom.i.ninth.Major) annotation;

                    System.out.println("Specialization: " + major.specialization());
                }
            }

        }
    }

}
