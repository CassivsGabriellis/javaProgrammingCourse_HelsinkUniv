
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String entry = scanner.nextLine();
            if (entry.isEmpty()) {
                break;
            }
            String[] wordsToSplit = entry.split("\\s+");
            System.out.println(wordsToSplit[0]);
        }
    }
}
