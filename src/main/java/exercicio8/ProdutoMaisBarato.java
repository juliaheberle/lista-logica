package exercicio8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProdutoMaisBarato {
    public static void main(String[] args) {
        produtos();
    }

    public static void produtos(){
        System.out.println("Digite 3 numeros");
        Integer numero1 = getInputInteger();
        Integer numero2 = getInputInteger();
        Integer numero3 = getInputInteger();

        List<Integer> numeros = Arrays.asList(numero1, numero2, numero3);
        Integer produtoMaisBarato = Integer.MAX_VALUE;

        for (int i=0; i < numeros.size(); i++){
            Integer produto = numeros.get(i);
            if (produto < produtoMaisBarato){
                produtoMaisBarato = produto;
            }
        }
    }
    private static Integer getInputInteger() {
        String entrada = new Scanner(System.in).nextLine();
        return Integer.parseInt(entrada);
    }
}
