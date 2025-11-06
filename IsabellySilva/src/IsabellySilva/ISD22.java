package IsabellySilva;
import java.util.Scanner;

public class ISD22 {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("* Aluno: Isabelly Silva Dias - RA ? ");
        System.out.println("* Classe ISD22 - Soma de números até digitar zero (WHILE)");
        System.out.println("******************************************");
        
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;

        System.out.println("Digite números para somar (digite 0 para encerrar):");

        while (true) {
            System.out.print("Número: ");
            numero = scanner.nextInt();
            
            if (numero == 0) {
                break; 
            }
            soma += numero;
        }

        System.out.println("\nSoma total dos números digitados: " + soma);
    }
}