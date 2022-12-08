
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("First number? ");
        int firstNum = scanner.nextInt();
        System.out.print("Last number? ");
        int lastNum = scanner.nextInt();
        
        int sum = 0;
        
        while (firstNum <= lastNum) {
            sum += firstNum; // sum = sum + firstNUm //sum = 3
            firstNum++;
        }
        
        System.out.println("The sum is: " + sum);
    }
}
