import java.util.Scanner;

// LISTA  DE EXERCÍCIOS 1

public class Ex06 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em graus: ");
        
        int graus = leitor.nextInt();
        int F = (9 * graus + 160) / 5;
        
        
        System.out.println(graus + " Graus são " + F + " Fahrenheit");
        
        leitor.close();
    }   
}

//Ler uma temperatura em graus Celsius e apresentá-la convertida em graus 
//Fahrenheit. A fórmula de conversão é: 
//F = (9 * C + 160) / 5