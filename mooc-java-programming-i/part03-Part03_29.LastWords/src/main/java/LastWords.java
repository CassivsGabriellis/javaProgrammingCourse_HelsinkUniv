
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String entry = scanner.nextLine();
            if (entry.isEmpty()) {
                break;
            }

            String[] parts = entry.split("\\s+");
            System.out.println(parts[parts.length - 1]);
        }

    }
}
