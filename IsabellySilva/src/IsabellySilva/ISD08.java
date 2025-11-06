package IsabellySilva;
import java.util.Scanner;

public class ISD08 {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("* Aluno: Isabelly Silva Dias - RA ? ");
        System.out.println("* Classe ISD08 - Login simples");
        System.out.println("******************************************");
        
        Scanner scanner = new Scanner(System.in);
        final String USUARIO_CORRETO = "alv_admin";
        final String SENHA_CORRETA = "12345";

        System.out.print("Usuário: ");
        String usuario = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        if (usuario.equals(USUARIO_CORRETO) && senha.equals(SENHA_CORRETA)) {
            System.out.println("Acesso concedido! Bem-vindo(a), " + USUARIO_CORRETO + ".");
        } else {
            System.out.println("Credenciais inválidas. Acesso negado.");
        }
    }
}