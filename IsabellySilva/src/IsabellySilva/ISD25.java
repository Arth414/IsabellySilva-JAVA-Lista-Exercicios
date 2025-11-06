package IsabellySilva;
import java.util.Scanner;

public class ISD25 {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("* Aluno: Isabelly Silva Dias - RA ? ");
        System.out.println("* Classe ISD25 - Tabuada com while (WHILE)");
        System.out.println("******************************************");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número para a tabuada: ");
        int num = scanner.nextInt();
        
        int i = 1;
        System.out.println("\nTabuada de " + num + " (usando while):");
        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }
    }
}