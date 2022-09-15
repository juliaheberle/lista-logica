package exercicio1;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[]args){ maiorNumero(); }

    public static void maiorNumero(){
        Integer numero1 = getInputInt();
        Integer numero2 = getInputInt();

        if (numero1 > numero2)
                System.out.println("O numero " +numero1+ " é maior");
            else
                System.out.println("O numero " +numero2+ " é maior");
    }

    private static Integer getInputInt() {
        String entrada1 = new Scanner(System.in).nextLine();
        return Integer.parseInt(entrada1);
    }
}
