package IsabellySilva;
import java.util.Scanner;

public class ISD26 {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("* Aluno: Isabelly Silva Dias - RA ? ");
        System.out.println("* Classe ISD26 - Número primo com while (WHILE)");
        System.out.println("******************************************");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        boolean ehPrimo = true;
        
        if (num <= 1) {
            ehPrimo = false;
        } else {
            int i = 2;
            while (i < num) { 
                if (num % i == 0) {
                    ehPrimo = false;
                    break; 
                }
                i++;
            }
        }

        if (ehPrimo) {
            System.out.println("O número " + num + " é PRIMO.");
        } else {
            System.out.println("O número " + num + " NÃO é primo.");
        }
    }
}