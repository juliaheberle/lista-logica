package exercicio7;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MaiorMenorNumero {
    public static void main(String[]args){

        maiorNumeroArray();


    }

    public static void maiorNumero(){
        System.out.println("Digite um numero");
        Scanner entrada1 = new Scanner(System.in);
        String numero1 = entrada1.nextLine();
        Scanner entrada2 = new Scanner(System.in);
        String numero2 = entrada2.nextLine();
        Scanner entrada3 = new Scanner(System.in);
        String numero3 = entrada3.nextLine();
        Integer numero1Int = Integer.parseInt(numero1);
        Integer numero2Int = Integer.parseInt(numero2);
        Integer numero3Int = Integer.parseInt(numero3);


        if (numero1Int > numero2Int && numero1Int > numero3Int){
            System.out.println("O numero " +numero1Int+ " é maior");
        }else if (numero2Int > numero1Int && numero2Int > numero3Int){
            System.out.println("O numero " +numero2Int+ " é maior");
        }else{
            System.out.println("O numero " +numero3Int+ " é maior");
        }

        if (numero1Int < numero2Int && numero1Int < numero3Int){
            System.out.println("O numero " +numero1Int+ " é maior");

        }else if (numero2Int < numero1Int && numero2Int < numero3Int){
            System.out.println("O numero " +numero2Int+ " é maior");
        }else{
            System.out.println("O numero " +numero3Int+ " é maior");
        }

    }

    public static void maiorNumeroArray(){
        System.out.println("Digite um numero");
        Integer numero1 = getInputInteger();
        Integer numero2 = getInputInteger();
        Integer numero3 = getInputInteger();

        List<Integer> numeros = Arrays.asList(numero1, numero2, numero3);

        int maiorNumero = Integer.MIN_VALUE;
        int menorNumero = Integer.MAX_VALUE;

        for (int i=0; i < numeros.size(); i++){
            Integer numero = numeros.get(i);
            if (numero > maiorNumero){
                maiorNumero = numero;
            }

            if (numero < menorNumero){
                menorNumero = numero;
            }
        }

        System.out.println("O maior numero é " + maiorNumero);
        System.out.println("O menor numero é " + menorNumero);
    }

    private static Integer getInputInteger() {
        String entrada = new Scanner(System.in).nextLine();
        return Integer.parseInt(entrada);
    }
}
