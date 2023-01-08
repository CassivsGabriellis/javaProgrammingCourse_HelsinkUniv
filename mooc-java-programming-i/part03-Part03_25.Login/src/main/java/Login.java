
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String positiveAlert = "You have successfully logged in!";
        String negativeAlert = "Incorrect username or password!";
        
        System.out.print("Enter username: ");
        String user = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        if (user.equals("alex") && password.equals("sunshine")) {
            System.out.println(positiveAlert);
        } else if (user.equals("emma") && password.equals("haskell")) {
            System.out.println(positiveAlert);
        } else {
            System.out.println(negativeAlert);
        }

    }
}
