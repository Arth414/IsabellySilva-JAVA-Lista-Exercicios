package IsabellySilva;
import java.util.Scanner;

public class ISD32 {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("* Aluno: Isabelly Silva Dias - RA ? ");
        System.out.println("* Classe ISD32 - Tabuada de um número (DO-WHILE)");
        System.out.println("******************************************");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número para a tabuada: ");
        int num = scanner.nextInt();
        
        int i = 1;
        System.out.println("\nTabuada de " + num + " (usando do-while):");
        do {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        } while (i <= 10);
    }
}