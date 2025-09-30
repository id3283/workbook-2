import java.util.Scanner;

public class FullNameGenerator {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        String fullName = "";

        fullName = getFirstName();
        fullName = maybeAddMiddleName(fullName);
        fullName = addLastName(fullName);
        fullName = maybeAddSuffix(fullName);

        System.out.println(fullName);
    }

    static String getFirstName() {
        String firstName = getStringFromUser("Please enter your first name: ");
        return firstName;
    }

    static String maybeAddMiddleName(String fullName) {
        String middleName = getStringFromUser("Please enter your middle name: ");
        if (!middleName.isBlank() ) {
            fullName = fullName + " " + middleName.trim();
        }
        return fullName;
    }

    static String addLastName(String namePart) {
        String lastName = getStringFromUser("Please enter your last name: ");
        namePart = namePart + " " + lastName.trim();
        return namePart;
    }

    static String maybeAddSuffix(String nameToThisPoint) {
        String suffix = getStringFromUser("Please enter Suffix: ");
        if (!suffix.isBlank()) {
            nameToThisPoint = nameToThisPoint + ", " + suffix.trim();
        }
        return nameToThisPoint;
    }

    private static String getStringFromUser(String prompt) {
        System.out.println(prompt);
        String userInput = myScanner.nextLine();
        return userInput;
    }
}
