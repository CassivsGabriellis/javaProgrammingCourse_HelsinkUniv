
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalYears = 0;
        int numEntries = 0;
        String longestName = "";
        
        while (true) {
            String entry = scanner.nextLine();
            if (entry.isEmpty()) {
                break;
            }
            
            String[] parts = entry.split(",");
            int birthYear = Integer.parseInt(parts[1].trim());
            totalYears += birthYear;
            numEntries++;
            String name = parts[0].trim();
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }
        
        double averageYears = (double) totalYears / numEntries;
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageYears);
    }
}
