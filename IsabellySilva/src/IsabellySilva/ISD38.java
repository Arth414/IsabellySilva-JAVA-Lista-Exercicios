package IsabellySilva;
import java.util.Scanner;

public class ISD38 {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("* Aluno: Isabelly Silva Dias - RA ? ");
        System.out.println("* Classe ISD38 - Confirmar saída com 's' (DO-WHILE)");
        System.out.println("******************************************");
        
        Scanner scanner = new Scanner(System.in);
        char sair;

        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("Programa em execução...");
            System.out.print("Deseja SAIR? (s/n): ");
            // Lê a linha e pega o primeiro caractere em minúsculo
            sair = scanner.nextLine().toLowerCase().charAt(0);
            
            if (sair != 's' && sair != 'n') {
                 System.out.println("Entrada inválida. Digite 's' para sim ou 'n' para não.");
            }
            
        } while (sair != 's');

        System.out.println("Saindo do programa. Tchau!");
    }
}