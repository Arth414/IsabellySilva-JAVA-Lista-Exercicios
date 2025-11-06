package IsabellySilva;
import java.util.Scanner;

public class ISD05 {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("* Aluno: Isabelly Silva Dias - RA ? ");
        System.out.println("* Classe ISD05 - Notas e aprovação");
        System.out.println("******************************************");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota (P1): ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota (P2): ");
        double n2 = scanner.nextDouble();

        double media = (n1 + n2) / 2;

        System.out.printf("Sua média é: %.2f\n", media);

        if (media >= 7.0) {
            System.out.println("Situação: APROVADO.");
        } else if (media >= 5.0) {
            System.out.println("Situação: RECUPERAÇÃO.");
        } else {
            System.out.println("Situação: REPROVADO.");
        }
    }
}