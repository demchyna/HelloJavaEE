package com.softserve.academy.model;

public class Person {
    private static int amount = 1;

    private int id;
    private String name;
    private int age;

    public Person() {
        this.id = amount++;
    }

    public Person(String name, int age) {
        this.id = amount++;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
