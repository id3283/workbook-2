package com.pluralsight;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    //region getters/setters
    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //endregion
}
