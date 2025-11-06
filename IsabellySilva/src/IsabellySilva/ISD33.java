package IsabellySilva;
import java.util.Scanner;

public class ISD33 {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("* Aluno: Isabelly Silva Dias - RA ? ");
        System.out.println("* Classe ISD33 - Menu com opção de sair (DO-WHILE)");
        System.out.println("******************************************");
        
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Mensagem");
            System.out.println("2 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            if (opcao == 1) {
                System.out.println("Você escolheu a mensagem!");
            } else if (opcao != 2) {
                System.out.println("Opção inválida. Escolha 1 ou 2.");
            }
            
        } while (opcao != 2);

        System.out.println("Programa encerrado por opção do usuário.");
    }
}