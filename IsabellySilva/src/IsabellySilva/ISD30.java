package IsabellySilva;
import java.util.Scanner;

public class ISD30 {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("* Aluno: Isabelly Silva Dias - RA ? ");
        System.out.println("* Classe ISD30 - Menu até escolher sair (WHILE)");
        System.out.println("******************************************");
        
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Opção A");
            System.out.println("2. Opção B");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            
            // Verifica se a entrada é um inteiro
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
            } else {
                System.out.println("Entrada inválida. Digite um número.");
                scanner.next(); // Limpa a entrada inválida
                continue;
            }
            
            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a Opção A. Continuando...");
                    break;
                case 2:
                    System.out.println("Você escolheu a Opção B. Continuando...");
                    break;
                case 3:
                    System.out.println("Encerrando o programa. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha entre 1, 2 ou 3.");
            }
        }
    }
}