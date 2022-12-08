
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int inputtedNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number != 0) {
                sum = sum + number;
                inputtedNumbers = inputtedNumbers + 1;
            }
        }
        
        System.out.println("Number of numbers: " + inputtedNumbers);
        System.out.println("Sum of the numbers: " + sum);
    }
}
