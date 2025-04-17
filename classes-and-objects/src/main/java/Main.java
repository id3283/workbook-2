public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Michael", 23);
        System.out.println("Mike's energy: " + p1.getEnergy());

        p1.work(14);
        System.out.println("Mike's energy: " + p1.getEnergy());

    }
}
