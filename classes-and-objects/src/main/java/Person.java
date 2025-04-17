public class Person {
    private String name;
    private int age;
    private int energy;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.energy = 100;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getEnergy() {
        return this.energy;
    }

    public void work(int hours) {
        this.energy -= (hours * 10);
    }

    public void sleep(int hours) {
        this.energy += (hours * 10);
    }

    public void eat() {
        this.energy += 20;
    }
}