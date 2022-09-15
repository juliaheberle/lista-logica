package exercicio28;

import java.util.Scanner;

public class XeY {
    public static void main(String[]args){
        doacao();
    }

    public static void doacao() {
        System.out.println("Digite o valor de x");
        Double x = getInputDouble();
        System.out.println("Digite o valor de y");
        Double y = getInputDouble();

        System.out.println("O valor de x é: " +x);
        System.out.println("O valor de y é: " +y);

        Double novoValorDeX = y;
        Double novoValorDeY = x;

        System.out.println("O novo valor de x é: " +novoValorDeX);
        System.out.println("O novo valor de y é: " +novoValorDeY);
    }


    private static Double getInputDouble() {
        String entrada1 = new Scanner(System.in).nextLine();
        return Double.parseDouble(entrada1);
    }
}

