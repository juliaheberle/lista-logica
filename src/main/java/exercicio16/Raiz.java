package exercicio16;

import java.util.Scanner;

public class Raiz {
    public static void main(String[]args){
        triangulo();
    }

    public static void triangulo(){
        System.out.println("Digite um valor");
        Double a = getInputUsuario();

        if (a == 0){
            System.out.println("Não é uma equação do segundo grau");
            System.exit(1);
        }

        Double b = getInputUsuario();
        Double c = getInputUsuario();

        Double delta = (b * b) - (4 * a * c);

        if (delta < 0){
            System.out.println("A equação nao possui raiz real");
            System.exit(1);
        }

        if (delta == 0){
            System.out.println("A equação possui uma raiz real");
            System.out.println("O valor de delta é: " +delta);
        }

        if (delta > 0){
            System.out.println("A equação possui duas raizes reais");
            System.out.println("O valor de delta é: " +delta);
        }

    }

    private static Double getInputUsuario() {
        String entrada1 = new Scanner(System.in).nextLine();
        return Double.parseDouble(entrada1);
    }
}
