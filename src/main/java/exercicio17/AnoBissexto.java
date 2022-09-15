package exercicio17;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[]args){
        triangulo();
    }

    public static void triangulo(){
        System.out.println("Digite um ano");
        Double ano = getInputUsuario();

        if ((ano % 4) == 0){
            if ((ano % 100) != 0){
                    System.out.println("O ano: " + ano+ " é bissexto");
            }
        }else {
            System.out.println("O ano: " + ano+ " não é bissexto");
        }

    }

    private static Double getInputUsuario() {
        String entrada1 = new Scanner(System.in).nextLine();
        return Double.parseDouble(entrada1);
    }
}
