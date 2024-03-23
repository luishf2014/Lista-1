import java.util.Scanner;

// LISTA  DE EXERCÍCIOS 1

public class Ex17 {
    public  static void executar() {
      Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe a nota 1: ");
        Double nota1 = leitor.nextDouble();
        
        System.out.println("Informe a nota 2: ");
        Double nota2 = leitor.nextDouble();
        
        System.out.println("Informe a nota 3: ");
        Double nota3 = leitor.nextDouble();
     
        System.out.println("Informe o peso da nota 1: ");
        Double peso1 = leitor.nextDouble();
        
        System.out.println("Informe  o peso da nota 2: ");
        Double peso2 = leitor.nextDouble();
        
        System.out.println("Informe o peso da nota 3: ");
        Double peso3 = leitor.nextDouble();

        Double media = ( (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3) ) / (peso1 + peso2 + peso3);
        
       System.out.println("A média ponderada das notas são: " + media);

        leitor.close();
    }
}