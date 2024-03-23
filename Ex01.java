import java.util.Scanner;

// LISTA  DE EXERCÍCIOS 1

public class Ex01 {
    public static void main(String[] args){
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o número: ");
        
        int num1 = leitor.nextInt();
        
        if (num1 > 10){
            System.out.println("Número "+ num1 + " é maior do que 10!"); 
        }  
            
        else if (num1 <= 10) {
            System.out.println("Número "+ num1 + " é menor ou igual a 10!");
        }
    }
}

