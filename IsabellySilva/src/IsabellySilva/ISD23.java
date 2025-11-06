package IsabellySilva;
import java.util.Scanner;

public class ISD23 {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("* Aluno: Isabelly Silva Dias - RA ? ");
        System.out.println("* Classe ISD23 - Senha correta (WHILE)");
        System.out.println("******************************************");
        
        Scanner scanner = new Scanner(System.in);
        final String SENHA_CORRETA = "4321";
        String senhaDigitada = "";

        System.out.println("Tente adivinhar a senha!");
        
        while (!senhaDigitada.equals(SENHA_CORRETA)) {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine();
            
            if (!senhaDigitada.equals(SENHA_CORRETA)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        }

        System.out.println("\nSenha correta! Acesso liberado.");
    }
}