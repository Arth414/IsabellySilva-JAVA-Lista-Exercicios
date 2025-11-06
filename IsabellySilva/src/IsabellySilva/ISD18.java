package IsabellySilva;

public class ISD18 {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("* Aluno: Isabelly Silva Dias - RA ? ");
        System.out.println("* Classe ISD18 - Múltiplos de 3 entre 1 e 30 (FOR)");
        System.out.println("******************************************");
        
        System.out.print("Múltiplos de 3 entre 1 e 30: ");
        
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.print(i + (i < 30 ? ", " : ""));
            }
        }
        System.out.println();
    }
}