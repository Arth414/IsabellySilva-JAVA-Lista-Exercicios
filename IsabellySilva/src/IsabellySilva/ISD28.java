package IsabellySilva;
import java.util.Scanner;

public class ISD28 {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("* Aluno: Isabelly Silva Dias - RA ? ");
        System.out.println("* Classe ISD27 - Quantidade de ímpares digitados (WHILE)");
        System.out.println("******************************************");
        
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        int impares = 0;
        
        System.out.println("Digite 10 números:");

        while (contador <= 10) {
            System.out.print("Número " + contador + "/10: ");
            int num = scanner.nextInt();
            
            if (num % 2 != 0) {
                impares++;
            }
            contador++;
        }

        System.out.println("\nTotal de números ímpares digitados: " + impares);
    }
}