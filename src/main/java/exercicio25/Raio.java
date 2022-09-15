package exercicio25;

import java.util.Scanner;

public class Raio {
    public static void main(String[]args){
        circunferencia();
    }

    public static void circunferencia() {
        System.out.println("Digite o raio da circunferencia");
        Double raio = getInputDouble();

        Double diametro = raio * 2;
        System.out.println("O diametro é: " + diametro);

        Double comprimento = 2 * 3.14 * raio;
        System.out.println("O comprimento é: " +comprimento);

        Double area = 3.14 * (raio * raio);
        System.out.println("A area é: " +area);
    }

    private static Double getInputDouble() {
        String entrada1 = getInput();
        return Double.parseDouble(entrada1);
    }



    private static String getInput() {
        return new Scanner(System.in).nextLine();
    }
}

