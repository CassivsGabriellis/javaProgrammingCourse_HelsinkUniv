
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double inputtedNumbers = 0;
        double averagePositive = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number > 0) {
                sum = sum + number;
                inputtedNumbers = inputtedNumbers + 1;
                averagePositive = sum / inputtedNumbers;
            }
        }

        if (inputtedNumbers == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println("Average of the positive numbers: " + averagePositive);
        }
    }
}
