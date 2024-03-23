import java.text.DecimalFormat;
import java.util.Scanner;

// LISTA  DE EXERCÍCIOS 1

public class Ex20 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o TEMPO da viagem: ");
        Double tempo = leitor.nextDouble();

        System.out.print("informe a velocidade média da viagem: ");
        Double velocidade =  leitor.nextDouble();
    
        Double distancia  = velocidade * tempo;
        
        System.out.print("A DISTÂNCIA é " +distancia+ " Km\n");

        System.out.print("Informe qual a eficiência do seu automóvel: ");
        Double eficiencia = leitor.nextDouble();

        Double consumo = distancia /  eficiencia;

        DecimalFormat dt = new DecimalFormat("#.##");
        System.out.print("O consumo de combustível para esse automóvel nessa viagem é de: " + dt.format(consumo) + "L");


        leitor.close();
    }
}


//Elabore um algoritmo que calcule a quantidade de litros de combustível gasta em 
//uma viagem, utilizando um automóvel que faz 12km por litro e considerando que são 
//fornecidos o tempo em hora e a velocidade média da viagem. 