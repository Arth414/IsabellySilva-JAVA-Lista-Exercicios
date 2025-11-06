package IsabellySilva;
import java.util.Scanner;

public class ISD39 {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("* Aluno: Isabelly Silva Dias - RA ? ");
        System.out.println("* Classe ISD39 - Validar número entre 1 e 5 (DO-WHILE)");
        System.out.println("******************************************");
        
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número entre 1 e 5: ");
            numero = scanner.nextInt();
            
            if (numero < 1 || numero > 5) {
                System.out.println("Número fora do intervalo. Tente novamente.");
            }
        } while (numero < 1 || numero > 5);

        System.out.println("\nNúmero validado com sucesso: " + numero);
    }
}