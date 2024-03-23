import java.util.Scanner;

// LISTA  DE EXERCÍCIOS 1

public class Ex04 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("informe os valores: ");
        int num1 = leitor.nextInt();
        int num2 = leitor.nextInt();

        int soma = num1 + num2;
        int subtração = num1 - num2;
        int multiplicação  = num1 * num2;
        float divisão = num1 / num2;

        System.out.println("A soma ---> " + soma);
        System.out.println("A subtração ---> " + subtração);
        System.out.println("A multiplicação ---> " + multiplicação);
        System.out.println("A divisão ---> " + divisão);

        leitor.close();

    }
}

//Escreva um algoritmo que leia dois números e ao final mostre a soma, subtração, 
//multiplicação e a divisão dos números lidos. 
