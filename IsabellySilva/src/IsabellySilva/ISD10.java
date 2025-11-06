package IsabellySilva;
import java.util.Scanner;

public class ISD10 {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("* Aluno: Isabelly Silva Dias - RA ? ");
        System.out.println("* Classe ISD10 - Ano bissexto");
        System.out.println("******************************************");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        boolean bissexto = false;

        // Regra do ano bissexto
        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
            bissexto = true;
        }

        if (bissexto) {
            System.out.println("O ano " + ano + " É um ano bissexto.");
        } else {
            System.out.println("O ano " + ano + " NÃO é um ano bissexto.");
        }
    }
}