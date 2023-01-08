
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;

        while (true) {
            String entry = scanner.nextLine();
            if (entry.isEmpty()) {
                break;
            }
            String[] parts = entry.split(",");
            int age = Integer.parseInt(parts[1].trim());
            if (age > oldestAge) {
                oldestAge = age;
            }
        }
        
        System.out.println("Age of the oldest: " + oldestAge);
    }
}
