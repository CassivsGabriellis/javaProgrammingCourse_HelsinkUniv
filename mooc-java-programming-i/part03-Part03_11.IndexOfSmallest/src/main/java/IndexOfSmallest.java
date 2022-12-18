
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);

        }

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int minNumber = list.get(0);
        int numIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (minNumber > list.get(i)) {
                minNumber = list.get(i);
                numIndex = i;
            }
        }
        
        System.out.println("Smallest number: " + minNumber);
        System.out.println("Found at index: " + numIndex);
    }
}
