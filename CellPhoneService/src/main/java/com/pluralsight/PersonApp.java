package com.pluralsight;

public class PersonApp {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Siphathisile");
        p1.setAge(20);


        String dave = "Dave";
        Person person = new Person(dave,56);

        System.out.println("person's name is " + p1.getName());
    }
}
