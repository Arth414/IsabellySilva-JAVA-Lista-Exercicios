package IsabellySilva;

public class ISD14 {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("* Aluno: Isabelly Silva Dias - RA ? ");
        System.out.println("* Classe ISD14 - Números pares de 0 a 50 (FOR)");
        System.out.println("******************************************");
        
        System.out.print("Números pares de 0 a 50: ");
        
        for (int i = 0; i <= 50; i += 2) {
            System.out.print(i + (i < 50 ? ", " : ""));
        }
        System.out.println();
    }
}