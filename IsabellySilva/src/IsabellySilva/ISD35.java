package IsabellySilva;
import java.util.Scanner;

public class ISD35 {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("* Aluno: Isabelly Silva Dias - RA ? ");
        System.out.println("* Classe ISD35 - Número positivo obrigatório (DO-WHILE)");
        System.out.println("******************************************");
        
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número POSITIVO: ");
            numero = scanner.nextInt();
            
            if (numero <= 0) {
                System.out.println("Número inválido. Deve ser maior que zero.");
            }
        } while (numero <= 0);

        System.out.println("\nNúmero positivo digitado: " + numero);
    }
}