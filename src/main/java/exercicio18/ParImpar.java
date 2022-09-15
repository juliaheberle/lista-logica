package exercicio18;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[]args){
        parImpar();
    }

    public static void parImpar(){
        System.out.println("Digite um numero");
        Double numero = getInputUsuario();

        if ((numero % 2) == 0){
                    System.out.println("O numero: " + numero+ " é par");
        }else {
            System.out.println("O numero: " + numero+ " é ímpar");
        }

    }

    private static Double getInputUsuario() {
        String entrada1 = new Scanner(System.in).nextLine();
        return Double.parseDouble(entrada1);
    }
}
