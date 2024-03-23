import java.text.DecimalFormat;
import java.util.Scanner;

// LISTA  DE EXERCÍCIOS 1

public class Ex16 {
    public  static void executar() {
      Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe a nota 1: ");
        Double nota1 = leitor.nextDouble();
        
        System.out.println("Informe a nota 2: ");
        Double nota2 = leitor.nextDouble();
        
        System.out.println("Informe a nota 3: ");
        Double nota3 = leitor.nextDouble();
        
        Double soma = nota1 + nota2 + nota3;
        
        System.out.println("A soma das notas são: " + soma);

        Double media = soma / 3;
        
        DecimalFormat formato = new DecimalFormat("#.##");
        System.out.println("A média das notas são: " + formato.format(media));

        leitor.close();
    }
}