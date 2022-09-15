package exercicio5;

import java.util.Scanner;

public class NotaParcial {
    public static void main(String[] args) {
        notas();
    }

    public static void notas(){
        System.out.println("Digite suas notas");
        Integer numero1 = getInputInteger();
        Integer numero2 = getInputInteger();

        double media = (numero1 + numero2)/2;

        if (media == 10){
            System.out.println("Aprovado com louvor");
        }else if (media >= 7){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado, média menor que 7");
        }
    }

    private static Integer getInputInteger() {
        String entrada = new Scanner(System.in).nextLine();
        return Integer.parseInt(entrada);
    }
}
