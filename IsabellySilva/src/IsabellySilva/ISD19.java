package IsabellySilva;
import java.util.Scanner;

public class ISD19 {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("* Aluno: Isabelly Silva Dias - RA ? ");
        System.out.println("* Classe ISD19 - Verificar se um número é primo (FOR)");
        System.out.println("******************************************");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        boolean ehPrimo = true;

        if (num <= 1) {
            ehPrimo = false;
        } else {
            // Verifica divisores de 2 até num - 1
            for (int i = 2; i < num; i++) { 
                if (num % i == 0) {
                    ehPrimo = false;
                    break; 
                }
            }
        }

        if (ehPrimo) {
            System.out.println("O número " + num + " é PRIMO.");
        } else {
            System.out.println("O número " + num + " NÃO é primo.");
        }
    }
}