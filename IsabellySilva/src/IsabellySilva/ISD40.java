package IsabellySilva;
import java.util.Scanner;

public class ISD40 {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("* Aluno: Isabelly Silva Dias - RA ? ");
        System.out.println("* Classe ISD40 - Ler números e mostrar o maior (DO-WHILE)");
        System.out.println("******************************************");
        
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE; 
        int numero;
        boolean primeiroNumero = true;

        System.out.println("Digite números positivos (digite um número negativo para encerrar).");

        do {
            System.out.print("Número: ");
            numero = scanner.nextInt();
            
            if (numero >= 0) {
                if (primeiroNumero || numero > maior) {
                    maior = numero;
                    primeiroNumero = false;
                }
            } else {
                if (primeiroNumero) { 
                    System.out.println("Nenhum número positivo foi digitado.");
                    return;
                }
            }
            
        } while (numero >= 0);

        System.out.println("\nMaior número positivo digitado: " + maior);
    }
}