package IsabellySilva;
import java.util.Scanner;

public class ISD04 {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("* Aluno: Isabelly Silva Dias - RA ? ");
        System.out.println("* Classe ISD04 - Pode votar?");
        System.out.println("******************************************");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Você pode votar (Voto obrigatório).");
        } else if (idade >= 16) {
            System.out.println("Você pode votar (Voto facultativo).");
        } else {
            System.out.println("Você não pode votar.");
        }
    }
}