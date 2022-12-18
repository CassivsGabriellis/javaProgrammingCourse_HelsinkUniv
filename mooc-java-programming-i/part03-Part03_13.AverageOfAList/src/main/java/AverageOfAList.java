
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        ArrayList<Integer> list = new ArrayList<>();
        
        int sum = 0;
        int values = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
            sum += input;
            values++;
        }

        // Then it computes the average of the numbers on the list
        // and prints it.
        double average = (double) sum / values;
        System.out.println("Average: " + average);

    }
}
