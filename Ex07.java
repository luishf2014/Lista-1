import java.util.Scanner;

// LISTA  DE EXERCÍCIOS 1

public class Ex07 {
    public static void executar(){
        Scanner leitor = new  Scanner(System.in);
        
        System.out.println("Digite o número: ");

        int num = leitor.nextInt();

        if(num >= 100 && num <= 200){
            System.out.println("Seu número está dentro do intervalo!!!");
        }else{
            System.out.println("Seu número NÃO está no intervalo!!!");
        }

        leitor.close();
    }
}


//Escreva um algoritmo que leia um número e diga, através de uma mensagem, se 
//este número está no intervalo entre 100 e 200. Caso o número esteja fora do intervalo 
//o usuário também deverá ser informado. 