import java.util.Scanner;

// LISTA  DE EXERCÍCIOS 1

public class Ex01 {
    public static void executar(){
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o número: ");
        
        int num1 = leitor.nextInt();
        
        if (num1 > 10){
            System.out.println("Número "+ num1 + " é maior do que 10!"); 
        }  
            
        else if (num1 <= 10) {
            System.out.println("Número "+ num1 + " é menor ou igual a 10!");
        }

        leitor.close();

    }
}

// Escreva  um  algoritmo  que  leia  um  número  digitado  pelo  usuário  e  mostre  a 
// mensagem “Número maior do que 10!”, caso este número seja maior, ou “Número 
// menor ou igual a 10!”, caso este número seja menor ou igual. 