package IsabellySilva;

public class ISD13 {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("* Aluno: Isabelly Silva Dias - RA ? ");
        System.out.println("* Classe ISD13 - Soma dos 100 primeiros naturais (FOR)");
        System.out.println("******************************************");
        
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i; 
        }

        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}