package exercicio2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        maiorNumero();
    }

    public static void maiorNumero(){
        System.out.println("Digite um numero");
        Integer numero = getInputInt();

        if (numero > 0 )
                System.out.println("O numero " +numero+ " é positivo");
            else
                System.out.println("O numero é negativo");
    }

    private static Integer getInputInt() {
        String entrada1 = new Scanner(System.in).nextLine();
        return Integer.parseInt(entrada1);
    }
}
