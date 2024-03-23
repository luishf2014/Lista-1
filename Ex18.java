import java.text.DecimalFormat;
import java.util.Scanner;

// LISTA  DE EXERCÍCIOS 1

public class Ex18 {
    public  static void executar() {
      Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe a nota 1: ");
        Double nota1 = leitor.nextDouble();
        
        System.out.println("Informe a nota 2: ");
        Double nota2 = leitor.nextDouble();
        
        System.out.println("Informe a nota 3: ");
        Double nota3 = leitor.nextDouble();

        Double media = 3 / ( ( 1 / nota1 ) + ( 1 / nota2 ) + ( 1 / nota3 ));
        
        DecimalFormat df = new DecimalFormat("#.##"); // 2 casas decimais
        System.out.println("A média harmônica das notas são: " + df.format(media));

        leitor.close();
    }
}