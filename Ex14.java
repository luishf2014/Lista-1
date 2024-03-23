import java.util.Scanner;

// LISTA  DE EXERCÍCIOS 1

public class Ex14 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Formúla para operação");
        System.out.println("An  =  a1  +  (n  -  1)  *  r  ");
        
        System.out.println("informe o valor de  A1: ");
        int a1 = leitor.nextInt();

        System.out.println("informe o valor de  N: ");
        int n = leitor.nextInt();


        System.out.println("Informe o valor de R:");
        int r = leitor.nextInt();


        int An = a1 + ((n - 1) * r);

        System.out.println("Resultado é: " + An);

        leitor.close();

    }
}
