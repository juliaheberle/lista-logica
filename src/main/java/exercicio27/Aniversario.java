package exercicio27;

import java.util.Scanner;

public class Aniversario {
    public static void main(String[]args){
        doacao();
    }

    public static void doacao() {
        System.out.println("Digite o dia do seu aniversario");
        Double dia = getInputDouble();
        System.out.println("Digite o mes do seu aniversario");
        Double mes = getInputDouble();
        System.out.println("Digite o ano do seu aniversario");
        Double ano = getInputDouble();

        if (dia > 31) {
            System.out.println("Dia invalido");
        }else if (mes > 12){
            System.out.println("Mes invalido");
        }else if (ano > 2013){
            System.out.println("Ano invalido");
        }
    }


    private static Double getInputDouble() {
        String entrada1 = new Scanner(System.in).nextLine();
        return Double.parseDouble(entrada1);
    }
}

