package IsabellySilva;

public class ISD17 {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("* Aluno: Isabelly Silva Dias - RA ? ");
        System.out.println("* Classe ISD17 - Quadrado dos números de 1 a 10 (FOR)");
        System.out.println("******************************************");
        
        System.out.println("Número | Quadrado");
        System.out.println("-----------------");
        
        for (int i = 1; i <= 10; i++) {
            int quadrado = i * i;
            System.out.println(String.format("%-6d | %d", i, quadrado));
        }
    }
}