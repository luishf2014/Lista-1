import java.util.Scanner;

// LISTA  DE EXERCÍCIOS 1

public class Ex10 { 
    public static void executar(){
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite de 1 a 5: ");

        int num = leitor.nextInt();

        switch(num){
            case 1:
                System.out.println("Um");
                break;
            
            case 2:
                System.out.println("Dois");
                break;
            
            case 3:
                System.out.println("Três");
                break;
            
            case 4:
                System.out.println("Quatro");
                break;
            
            case 5:
                System.out.println("Cinco");
                break;
            
            default: 
                System.out.println("Número inválido!!!");
        }
        leitor.close();  
    }
}

//Escreva um algoritmo que leia um número de 1 a 5 e escreva-o por extenso. Caso 
//o usuário digite um valor que não esteja neste intervalo, exibir a mensagem: “Número 
//inválido!”.