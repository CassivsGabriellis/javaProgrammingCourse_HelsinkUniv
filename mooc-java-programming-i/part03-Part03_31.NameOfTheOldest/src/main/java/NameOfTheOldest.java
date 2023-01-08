
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldestAge = 0;
        String nameOfTheOldest = "";

        while (true) {
            String entry = scanner.nextLine();
            if (entry.isEmpty()) {
                break;
            }
            String[] parts = entry.split(",");
            int age = Integer.parseInt(parts[1].trim());
            if (age > oldestAge) {
                oldestAge = age;
                nameOfTheOldest = parts[0].trim();
            }
        }
        System.out.println("Name of the oldest: " + nameOfTheOldest);
    }
}
