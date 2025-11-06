package IsabellySilva;
import java.util.Scanner;

public class ISD06 {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("* Aluno: Isabelly Silva Dias - RA ? ");
        System.out.println("* Classe ISD06 - Múltiplo de 3 e/ou 5");
        System.out.println("******************************************");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("O número é múltiplo de 3 e de 5.");
        } else if (numero % 3 == 0) {
            System.out.println("O número é múltiplo de 3.");
        } else if (numero % 5 == 0) {
            System.out.println("O número é múltiplo de 5.");
        } else {
            System.out.println("O número não é múltiplo de 3 nem de 5.");
        }
    }
}