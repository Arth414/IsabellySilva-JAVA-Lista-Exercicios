package IsabellySilva;
import java.util.Scanner;

public class ISD34 {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("* Aluno: Isabelly Silva Dias - RA ? ");
        System.out.println("* Classe ISD34 - Pedir senha até acertar (DO-WHILE)");
        System.out.println("******************************************");
        
        Scanner scanner = new Scanner(System.in);
        final String SENHA_CORRETA = "1111";
        String senhaDigitada;

        System.out.println("Tente digitar a senha correta.");

        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine();
            
            if (!senhaDigitada.equals(SENHA_CORRETA)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (!senhaDigitada.equals(SENHA_CORRETA));

        System.out.println("\nAcesso liberado!");
    }
}