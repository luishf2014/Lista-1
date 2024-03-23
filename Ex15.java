import java.text.DecimalFormat;
import java.util.Scanner;

// LISTA  DE EXERCÍCIOS 1

public class Ex15 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("infome as coordenadas de P1:");
        int x1 = leitor.nextInt(); 
        int y1 = leitor.nextInt();

        System.out.println("infome as coordenadas de P2:");
        int x2 = leitor.nextInt(); 
        int y2 = leitor.nextInt();

        System.out.println("As coordenadas de P1 e P2 são: ");
        System.out.println("P1 --> (" + x1 + "," + y1 + ")");
        System.out.println("P2 --> (" + x2 + "," + y2 + ")");

        double d = ((((x2 - x1) * (x2 - x1) ) + ((y2 - y1) * (y2 - y1))));

        Double raiz = Math. sqrt(d);

        // Definindo o formato para limitar as casas decimais
        DecimalFormat formato = new DecimalFormat("#.##");
        
        // Aplicando o formato à raiz quadrada
        String raizFormatada = formato.format(raiz);

        System.out.println("A distancia entre as coordenadas é de: " + raizFormatada);

        leitor.close();
    }
}


// 15. Tendo como dados de entrada dois pontos quaisquer no plano, 
// P1(x1, y1) e P2(x2,y2), calcule e retorne a distância entre eles. 
// A fórmula que efetua tal cálculo é: 
// d = raiz(((x2 - x1)2) + ((y2 - y1)2)). 
// Exemplo: p1(0, 5), p2(10, 20). Distancia: 18,03