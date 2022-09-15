package exercicio14;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        notas();
    }

    public static void notas(){
        System.out.println("Digite suas notas");
        Double nota1 = getInputDouble();
        Double nota2 = getInputDouble();

        Double media = (nota1 + nota2) / 2;

        System.out.println("Suas notas são: " +nota1 + " e " +nota2);
        System.out.println("Sua media é: " +media);

        if (media >= 9 && media>=10){
            System.out.println("A");
            System.out.println("Aprovado");
        }
        if (media >= 7.5 && media < 9){
            System.out.println("B");
            System.out.println("Aprovado");
        }
        if (media >= 6 && media < 7.5){
            System.out.println("C");
            System.out.println("Aprovado");
        }

        if (media >= 4 && media < 6){
            System.out.println("D");
            System.out.println("Reprovado");
        }

        if (media < 4){
            System.out.println("E");
            System.out.println("Reprovado");
        }
    }
    private static Double getInputDouble() {
        String entrada = new Scanner(System.in).nextLine();
        return Double.parseDouble(entrada);
    }
}
