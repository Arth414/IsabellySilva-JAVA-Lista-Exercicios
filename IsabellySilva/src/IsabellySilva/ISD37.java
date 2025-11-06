package IsabellySilva;
import java.util.Scanner;

public class ISD37 {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("* Aluno: Isabelly Silva Dias - RA ? ");
        System.out.println("* Classe ISD37 - Soma até o número ser múltiplo de 10 (DO-WHILE)");
        System.out.println("******************************************");
        
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;

        System.out.println("Digite números. A soma será exibida ao digitar um MÚLTIPLO de 10.");

        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
            
            if (numero % 10 != 0) {
                soma += numero;
            }
            // O loop encerra se o número for múltiplo de 10
        } while (numero % 10 != 0);

        System.out.println("\nNúmero digitado para encerrar: " + numero);
        System.out.println("Soma total dos números (excluindo o múltiplo de 10): " + soma);
    }
}