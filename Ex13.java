import java.util.Scanner;

// LISTA  DE EXERCÍCIOS 1

public class Ex13 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("informe o valor de A:");
        int a = leitor.nextInt();

        System.out.println("informe o valor de B:");
        int b = leitor.nextInt();

        System.out.println("informe o operdor: ");
        System.out.println("+, -, *, /");
        String operador = leitor.next();

        switch (operador) {
            case "+" :
                int soma = a + b;
                System.out.println("A + B = " + soma);
                break;

            case "-":
                int subtrair = a - b;
                System.out.println("A - B = " + subtrair);
                break;

            case "*":
                int multiplicar = a * b;
                System.out.println("A * B = " + multiplicar);
                break;

            case "/":
                int dividir = a / b;
                System.out.println("A / B = " + dividir);
                break;
        
            default:
                System.out.println("informe uma operação matemática");
                break;
        }

        leitor.close();
    }
}