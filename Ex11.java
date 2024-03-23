import java.util.Scanner;

// LISTA  DE EXERCÍCIOS 1

public class Ex11 {
    public  static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("informe o primeiro número: ");
        int n1 =  leitor.nextInt();
        
        System.out.println("informe o segundo número: ");
        int nu2 = leitor.nextInt();

        System.out.println("informe o terceiro número: ");
        int num3 = leitor.nextInt();

        int menor = 0;
        int maior = 0;
        int meio = 0;

        if(n1 < nu2 && n1 < num3){
            menor  = n1;
            if (nu2 < num3){
                meio = nu2;
                maior = num3;
            }else{
                meio = num3;
                maior = nu2;
            }
        }
        if(nu2 < n1 && nu2 < num3){
            menor  = nu2;
            if (n1 < num3){
                meio = n1;
                maior = num3;
            }else{
                meio = num3;
                maior = n1;
            }
        }
        if(num3 < n1 && num3 < nu2){
            menor = num3;
            if(n1 < nu2){
                meio = n1;
                maior = nu2;
            }else{
                meio = nu2;
                maior = n1;
            }
        }

        System.out.println("Os números em ordem CRESCENTES: ");
        System.out.println(menor + ", " + meio + ", " + maior);
        
        leitor.close();
    }
}
//Escreva um algoritmo que leia três valores inteiros distintos e escreva-os em 
//ordem crescente. 