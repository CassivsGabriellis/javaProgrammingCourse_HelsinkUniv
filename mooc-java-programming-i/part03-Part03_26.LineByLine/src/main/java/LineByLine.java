
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String words = scanner.nextLine();
            
            if (words.isEmpty()) {
                break;
            }
            
            String[] wordsToSplit = words.split("\\s+");
            for (String word: wordsToSplit) {
                System.out.println(word);
            }
        }
        
    }
}
