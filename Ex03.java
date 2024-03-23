import java.util.Scanner;

// LISTA  DE EXERCÍCIOS 1

public class Ex03 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("informe os valores: ");
        int a = leitor.nextInt();
        int b = leitor.nextInt();

        if(a > b){
            System.out.println("o primeiro valor é maior");
            
        }if(b > a){
            System.out.println("o segundo valor é maior");
        }else if(a == b) {
            System.out.println("A sequência de números informados é inválida");
        }
        leitor.close();
    }
}

// Escreva um algoritmo que leia os valores de dois números inteiros distintos nas 
// variáveis A e B e informe qual deles é o maior. Caso os números sejam iguais informar 
// ao usuário que a sequência de números informados é inválida.