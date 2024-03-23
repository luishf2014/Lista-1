import java.util.Scanner;

// LISTA  DE EXERCÍCIOS 1

public class Ex02 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("informe os números: ");

        Double num1 = leitor.nextDouble();
        Double num2 = leitor.nextDouble();

        Double soma = num1 + num2;

        System.out.println("A soma dos números são: " + soma);

    }
}

//Escreva um algoritmo que leia dois números digitados pelo usuário e exiba o 
//resultado da sua soma
