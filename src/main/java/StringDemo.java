@SuppressWarnings("StringEquality")
public class StringDemo {


    public static void main(String[] args) {
        int i1 = 5;

        String s1 = "  string1\t";


        s1 = s1.trim();

        String s2 = "";

        System.out.printf("s1 is \"%s\"    s2 is \"%s\" \n", s1, s2);
        System.out.println("result of == " + (s1 == s2) );
        System.out.println("result of .equals " + (s1.equals(s2)) );


    }
    public static void sayHi() {
        System.out.println("hi");
    }
}
