package exercises;

import java.util.Scanner;

public class ClassOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informe o numero: ");
        double num1 = sc.nextDouble();

        System.out.println("informe o numero: ");
        double num2 = sc.nextDouble();

        System.out.println("informe a operação: ");
        String op = sc.next();

        // Lógica
        double resultado = "+".equals(op) ? num1 + num2 : 0; //se a operação for num1 + num2, retorne o resultado
        // se não retorne zero
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
        resultado = "%".equals(op) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);

        sc.close();
    }


}
