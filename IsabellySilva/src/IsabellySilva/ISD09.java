package IsabellySilva;
import java.util.Scanner;
import java.util.Arrays; 

public class ISD09 {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("* Aluno: Isabelly Silva Dias - RA ? ");
        System.out.println("* Classe ISD09 - Ordem crescente (três números)");
        System.out.println("******************************************");
        
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[3];

        System.out.print("Digite o primeiro número: ");
        numeros[0] = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        numeros[1] = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        numeros[2] = scanner.nextInt();

        // Ordena os números
        Arrays.sort(numeros);

        System.out.println("\nNúmeros em ordem crescente:");
        System.out.println(numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
    }
}