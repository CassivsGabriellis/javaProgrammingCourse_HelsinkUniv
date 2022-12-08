
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbersQuant = 0;
        double numbersAve = 0;
        int even = 0;
        int odd = 0;
        
        System.out.println("Give numbers:");
        
        while (true) {
            //System.out.println("Give numbers:");
            int numbers = scanner.nextInt();
            
            if (numbers == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            
            if (numbers % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            
            sum += numbers;
            numbersQuant++;
            numbersAve = sum / (double) numbersQuant;
            
        }
        
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbersQuant);
        System.out.println("Average: " + numbersAve);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
