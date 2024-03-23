import java.util.Scanner;

// LISTA  DE EXERCÍCIOS 1

public class Ex09 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o valor de A: ");
        int a = leitor.nextInt();
        System.out.println("Informe o valor B: ");
        int b = leitor.nextInt();

        if(a == b){
            System.out.println("Os valor são iguias!!!");
        }else if(a != b){
            System.out.println("Os valor são diferentes");
        }
        leitor.close();
    }
}


//Leia dois números nas variáveis A e B e identifique se os valores são iguais ou 
//diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que são iguais. 
//Caso sejam diferentes, informe que são diferentes e qual número é o maior