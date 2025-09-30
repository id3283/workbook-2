import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateParsingDemo {
    public static void main(String[] args) {
        String userInput;
        DateTimeFormatter formatter;

        userInput = "10-05-1968";

        formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        LocalDate birthDay = LocalDate.parse(userInput, formatter);

        System.out.println("birthday is: " + birthDay);
    }
}
