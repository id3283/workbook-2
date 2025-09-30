package oop;

public class OopDemo {

    public static void main(String[] args) {

        Person p1 = new Person("Humza", 25);
        Person p2 = p1;

        System.out.println("p1 name: " + p1.personsName + " p1: age: " + p1.age);
    }
}
