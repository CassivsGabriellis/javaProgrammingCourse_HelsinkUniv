
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        
        Scanner scanner = new Scanner(System.in);
        Statistics totalSum = new Statistics();
        Statistics sumEvenNumbers = new Statistics();
        Statistics sumOddNumbers = new Statistics();
                
        System.out.println("Enter numbers: ");
        
        while (true) {
            int number = scanner.nextInt();
            
            if (number < 0) {
                break;
            }
            
            totalSum.addNumber(number);
            
            if (number % 2 == 0) {
                sumEvenNumbers.addNumber(number);
            } else {
                sumOddNumbers.addNumber(number);
            }
        }
        
        System.out.println("Sum: " + totalSum.sum());
        System.out.println("Sum of even numbers: " + sumEvenNumbers.sum());
        System.out.println("Sum of odd numbers: " + sumOddNumbers.sum());
    }
}
