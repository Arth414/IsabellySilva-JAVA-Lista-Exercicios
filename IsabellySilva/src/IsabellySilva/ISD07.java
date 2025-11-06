package IsabellySilva;
import java.util.Scanner;

public class ISD07 {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("* Aluno: Isabelly Silva Dias - RA ? ");
        System.out.println("* Classe ISD07 - Triângulo válido");
        System.out.println("******************************************");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o lado A: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o lado B: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o lado C: ");
        double c = scanner.nextDouble();

        if (a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Os lados formam um triângulo.");
            if (a == b && b == c) {
                System.out.println("Tipo: Equilátero.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Tipo: Isósceles.");
            } else {
                System.out.println("Tipo: Escaleno.");
            }
        } else {
            System.out.println("Os lados NÃO formam um triângulo válido.");
        }
    }
}