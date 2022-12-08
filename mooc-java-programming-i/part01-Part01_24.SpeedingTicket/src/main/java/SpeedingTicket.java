
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give speed:");
        int valor = Integer.valueOf(scanner.nextLine());
        if (valor > 120) {
            System.out.println("Speeding ticket!");
        }
        else {
            System.out.println("Drive safely!");
        }
    }
}
