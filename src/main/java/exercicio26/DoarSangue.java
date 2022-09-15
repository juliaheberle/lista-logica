package exercicio26;

import java.util.Scanner;

public class DoarSangue {
    public static void main(String[]args){
        doacao();
    }

    public static void doacao() {
        System.out.println("Digite a sua idade");
        Double idade = getInputDouble();

        if (idade >= 18 && idade <= 67)
            System.out.println("Você pode doar sangue");
            else
            System.out.println("Você nao pode doar sangue");
    }


    private static Double getInputDouble() {
        String entrada1 = getInput();
        return Double.parseDouble(entrada1);
    }



    private static String getInput() {
        return new Scanner(System.in).nextLine();
    }
}

