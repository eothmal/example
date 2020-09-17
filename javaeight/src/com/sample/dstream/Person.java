package com.sample.dstream;

public class Person {

    public enum Gender {
        Female,
        Male
    }

    private String name;
    private Gender gender;
    private int age;
    private String city;

    public Person(String name, Gender gender, int age, String city) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
