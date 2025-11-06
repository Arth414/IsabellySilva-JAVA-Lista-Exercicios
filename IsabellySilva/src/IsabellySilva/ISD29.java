package IsabellySilva;
import java.util.Scanner;

public class ISD29 {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("* Aluno: Isabelly Silva Dias - RA ? ");
        System.out.println("* Classe ISD29 - Contar dígitos de um número (WHILE)");
        System.out.println("******************************************");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numOriginal = scanner.nextInt();
        
        if (numOriginal < 0) {
            System.out.println("Por favor, digite um número positivo.");
            return;
        }
        
        int numero = numOriginal;
        int contador = 0;
        
        if (numero == 0) {
            contador = 1; 
        } else {
            while (numero > 0) {
                numero /= 10; 
                contador++;
            }
        }

        System.out.println("O número " + numOriginal + " tem " + contador + " dígitos.");
    }
}