import java.util.Scanner;

public class AddressBuilder {
    static Scanner scanner = new Scanner(System.in);
    static StringBuilder builder = new StringBuilder();

    public static void main(String[] args) {

        System.out.println("Please provide the following info:");

        System.out.print("Enter full name: "); // -> prompt
        String input = scanner.nextLine();

        // Building output
        builder.append(input + "\n\n");

        builder.append("Billing Address:\n");
        getAddress("billing");

        builder.append("\nShipping Address:\n");
        getAddress("shiping");

        System.out.println("-------- OUTPUT --------");
        System.out.println(builder.toString());
    }

    static void getAddress(String addressName) {
        String input;
        System.out.printf("Enter %s street: ", addressName);
        input = scanner.nextLine();
        builder.append(input + "\n"); // append billing street

        System.out.printf("Enter %s city: ", addressName);
        input = scanner.nextLine();
        builder.append(input + ", "); // append city

        System.out.printf("Enter %s state: ", addressName);
        input = scanner.nextLine();
        builder.append(input + " "); // append state

        System.out.printf("Enter %s zip: ", addressName);
        input = scanner.nextLine();
        builder.append(input + "\n"); // append zip
    }

    static String getStringFromUser(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();
        return userInput;
    }
}
