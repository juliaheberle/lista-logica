package exercicio19;

import java.util.Scanner;

public class Operacao {
    public static void main(String[]args){
        operacao();
    }

    public static void operacao(){
        System.out.println("Digite um numero");
        Double numero1 = getInputDouble();
        Double numero2 = getInputDouble();
        System.out.println("Digite um numero para definir a operação");
        Integer operacao = getInputInteger();

        Double resultado = 0.0;

        switch (operacao){
            case 1: resultado = numero1 + numero2; break;
            case 2: resultado = numero1 - numero2; break;
            case 3: resultado = numero1 * numero2; break;
            case 4: resultado = numero1 / numero2; break;
        }

        if (operacao == 1)
            resultado = numero1 + numero2;

        if (operacao == 2)
            resultado = numero1 - numero2;

        if (operacao == 3)
            resultado = numero1 * numero2;

        if (operacao == 4)
            resultado = numero1 / numero2;

        if ((resultado % 2) == 0)
            System.out.println("O resultado: " + resultado + " é par");
            else
                System.out.println("O resultado: " + resultado + " é ímpar");

        if (resultado > 0 )
            System.out.println("O resultado: " + resultado + " é positivo");
            else
                System.out.println("O resultado: " + resultado + " é negativo");

    }

    private static Double getInputDouble() {
        String entrada1 = getInput();
        return Double.parseDouble(entrada1);
    }

    private static Integer getInputInteger() {
        String entrada1 = getInput();
        return Integer.parseInt(entrada1);
    }

    private static String getInput() {
        return new Scanner(System.in).nextLine();
    }
}
