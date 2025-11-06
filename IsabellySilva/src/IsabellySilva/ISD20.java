package IsabellySilva;
import java.util.Scanner;

public class ISD20 {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("* Aluno: Isabelly Silva Dias - RA ? ");
        System.out.println("* Classe ISD20 - Números de Fibonacci (FOR)");
        System.out.println("******************************************");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de termos de Fibonacci (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("O número de termos deve ser positivo.");
            return;
        }

        long t1 = 0, t2 = 1;
        System.out.print("Sequência de Fibonacci com " + n + " termos: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(t1 + (i < n ? ", " : ""));

            long proximoTermo = t1 + t2;
            t1 = t2;
            t2 = proximoTermo;
        }
        System.out.println();
    }
}