
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Last number? ");
        int n = scanner.nextInt();
        
        int contador = 0;
        int soma = 0;
        
        while (n >= contador) {
            soma += contador;
            contador++;
        }
        
        System.out.println("The sum is " + soma);
    }
}
