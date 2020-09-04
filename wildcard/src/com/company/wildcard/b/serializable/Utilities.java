package com.company.wildcard.b.serializable;

import java.io.*;

public class Utilities {

    public static <K extends Comparable<K> & Serializable,
            V extends Comparable<V> & Serializable>
    void saveLarger(Pair<K, V> pair1, Pair<K, V> pair2) throws IOException {

        Pair<K, V> larger = null;
        if (pair1.compareTo(pair2) > 0) {
            larger = pair1;
        } else {
            larger = pair2;
        }

        String fileName = "src\\larger_pair.txt";

        try (ObjectOutputStream objOut = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(fileName)))) {
            objOut.writeObject(larger);

        } finally {
            System.out.println("Completed writing to larger_pair.txt");
        }

    }

    public static <K extends Comparable<K> & Serializable,
            V extends Comparable<V> & Serializable>
    Pair<K, V> readLarger() throws IOException {

        String fileName = "src\\larger_pair.txt";

        try (ObjectInputStream objIn = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(fileName)))) {

            @SuppressWarnings("unchecked")
            Pair<K, V> larger = (Pair<K, V>) objIn.readObject();

            return larger;

        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
            System.out.println("Throw when the class read in using readObject is not found");
        } finally {
            System.out.println("Completed reading from large_pair.txt");
        }

        return null;
    }
}
