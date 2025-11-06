package IsabellySilva;
import java.util.Scanner;

public class ISD24 {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("* Aluno: Isabelly Silva Dias - RA ? ");
        System.out.println("* Classe ISD24 - Verificar se um número é positivo (WHILE)");
        System.out.println("******************************************");
        
        Scanner scanner = new Scanner(System.in);
        int numero = -1; // Inicializa com valor não positivo

        System.out.println("Digite números até inserir um POSITIVO (> 0).");
        
        while (numero <= 0) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
            
            if (numero <= 0) {
                System.out.println("O número precisa ser positivo. Tente novamente.");
            }
        }

        System.out.println("\nVocê digitou o número positivo: " + numero);
    }
}