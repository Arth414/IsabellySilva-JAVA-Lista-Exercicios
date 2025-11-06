package IsabellySilva;
import java.util.Scanner;

public class ISD15 {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("* Aluno: Isabelly Silva Dias - RA ? ");
        System.out.println("* Classe ISD15 - Fatorial de um número (FOR)");
        System.out.println("******************************************");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número não negativo para o fatorial: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("O fatorial não é definido para números negativos.");
        } else {
            long fatorial = 1; 
            
            for (int i = 1; i <= num; i++) {
                fatorial *= i; 
            }

            System.out.println(num + "! = " + fatorial);
        }
    }
}