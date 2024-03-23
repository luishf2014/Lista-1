import java.util.Scanner;

// LISTA  DE EXERCÍCIOS 1

public class Ex05 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite os valores");
        
        int a = leitor.nextInt();
        int b = leitor.nextInt();

        System.out.println("Valores antes a troca");
        System.out.println("A ---> " + a);
        System.out.println("B ---> " + b);
        
        int aux =  a;
        a = b;
        b = aux;
        
        
        System.out.println("Valores apos a troca");
        System.out.println("A ---> " + a);
        System.out.println("B ---> " + b);

        leitor.close();
    }
    
}


//Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valor 
//da variável A passe a ser o valor da variável B e o valor da variável B passe a ser o 
//valor da variável A. Apresentar uma mensagem com o valor original de cada variável 
//e outra com os valores trocados.