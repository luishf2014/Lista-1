import java.util.Scanner;

// LISTA  DE EXERCÍCIOS 1

public class Ex08 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");

        int num = leitor.nextInt();

        if(num >= 50){
            System.out.println("Este número é maior que ou igual a 50!!!");
        }else if(num <= 49){
            System.out.println("Este número é menor que 50!!!");
        }
        
        leitor.close();
    }
}


//Escreva um algoritmo que leia um número e mostre uma mensagem caso este 
//número seja maior ou igual a 50, outra se ele for menor que 50.