package exercicio21;

import java.util.Scanner;

public class Combustivel {
    public static void main(String[]args){
        combustivel();
    }

    public static void combustivel() {
        System.out.println("Digite a quantidade de litros");
        Double litros = getInputDouble();
        System.out.println("Digite o tipo de combustivel");
        String combustivel = getInputString();

        Double valorFinal = 0.;
        Double precoPorLitro = 2.;

        if (combustivel.equals("A")){
            if (litros <= 20){
                valorFinal = (precoPorLitro * litros) - (litros * 0.03);
            } else {
                valorFinal = (precoPorLitro * litros) - (litros * 0.05);
            }
            System.out.println("O valor total a ser pago é: " + valorFinal);
        }

        if (combustivel.equals("G")){
            if (litros <= 20){
                valorFinal = (precoPorLitro * litros) - (litros * 0.04);
            } else {
                valorFinal = (precoPorLitro * litros) - (litros * 0.06);
            }
            System.out.println("O valor total a ser pago é: " + valorFinal);
        }
    }

    private static Double getInputDouble() {
        String entrada1 = getInput();
        return Double.parseDouble(entrada1);
    }

    private static String  getInputString() {
        return getInput();
    }

    private static String getInput() {
        return new Scanner(System.in).nextLine();
    }
}
