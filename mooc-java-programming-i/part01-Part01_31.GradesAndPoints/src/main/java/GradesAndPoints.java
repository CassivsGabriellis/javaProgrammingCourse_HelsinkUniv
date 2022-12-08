
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]:");
        int point = Integer.valueOf(scan.nextLine());
        if (point < 0) {
            System.out.println("Grade: Impossible!");
        } else if (point <= 49) {
            System.out.println("Grade: Failed!");
        } else if (point >= 50 && point <= 59) {
            System.out.println("Grade: 1");
        } else if (point >= 60 && point <= 69) {
            System.out.println("Grade: 2");
        } else if (point >= 70 && point <= 79) {
            System.out.println("Grade: 3");
        } else if (point >= 80 && point <= 89) {
            System.out.println("Grade: 4");
        } else if (point >= 90 && point <= 100) {
            System.out.println("Grade: 5");
        } else if (point > 100) {
            System.out.println("Grade: Incredible!");
        } else {
            System.out.println("You're not a student!");
        }
    }
}
