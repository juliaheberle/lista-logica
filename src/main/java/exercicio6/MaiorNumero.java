package exercicio6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[]args){
        maiorNumeroArray();
    }

    public static void maiorNumero(){
        Integer numero1 = getInputInteger();
        Integer numero2 = getInputInteger();
        Integer numero3 = getInputInteger();

        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("O numero " +numero1+ " é maior");

        }else if (numero2 > numero1 && numero2 > numero3){
            System.out.println("O numero " +numero2+ " é maior");
        }else{
            System.out.println("O numero " +numero3+ " é maior");
        }
    }

    public static void maiorNumeroArray(){
        Integer numero1 = getInputInteger();
        Integer numero2 = getInputInteger();
        Integer numero3 = getInputInteger();

        List<Integer> numeros = Arrays.asList(numero1, numero2, numero3);
        Integer maiorNumero = 0;

        for (int i=0; i < numeros.size(); i++){
            if (numeros.get(i) > maiorNumero){
                maiorNumero = numeros.get(i);
            }
        }
        System.out.println("O maior numero é " + maiorNumero);
    }
    private static Integer getInputInteger() {
        String entrada = new Scanner(System.in).nextLine();
        return Integer.parseInt(entrada);
    }
}
