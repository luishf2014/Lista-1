import java.text.DecimalFormat;
import java.util.Scanner;

// LISTA  DE EXERCÍCIOS 1

public class Ex19 { 
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o tamanho do RAIO: ");
        Double raio = leitor.nextDouble();

        System.out.println("Digite  a altura do cilindro: ");
        Double  altura = leitor.nextDouble();

        Double volume = 3.14 * (raio * raio ) * altura;

        DecimalFormat formato = new DecimalFormat("#.##");

        System.out.println("O volume do Cilindro é: " + formato.format(volume));

        leitor.close();

    }
}

// Faça um algoritmo que receba o raio e a altura de um cilindro e retorne o seu 
// volume calculado de acordo com a seguinte fórmula: volume = 3.14 * raio2 * altura; 
// Exemplo: raio = 10, altura = 15. Volume = 4710