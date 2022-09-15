package exercicio3;

import java.util.Scanner;

public class FeminoEMasculino {
    public static void main(String[] args) {
        feminoMasculino();
    }

    public static void feminoMasculino() {
        System.out.println("Digite uma letra");
        String letra = getInputString();

        if (letra.equals("M")) {
            System.out.println("O sexo é masculino");
        } else if (letra.equals("F")){
            System.out.println("O sexo é feminino");
        }else{
            System.out.println("Sexo é inválido");
        }
    }

    private static String getInputString() {
        return new Scanner(System.in).nextLine();
    }
}
