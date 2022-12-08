
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to? ");
        int numWhereTo = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int numWhereFrom = Integer.valueOf(scanner.nextLine());
        
        for (int i = numWhereFrom; i <= numWhereTo; i++) {
            System.out.println(i);
        }
    }
}
