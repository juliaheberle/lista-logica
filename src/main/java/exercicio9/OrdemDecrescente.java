package exercicio9;

import java.util.*;

public class OrdemDecrescente {
    public static void main(String[] args) {
        produtos();
    }

    public static void produtos(){
        System.out.println("Digite um numero");
        Integer numero1 = getInputInteger();
        Integer numero2 = getInputInteger();
        Integer numero3 = getInputInteger();

        List<Integer> numerosDescrescente = new ArrayList<>(Arrays.asList(numero1, numero2, numero3));
        Collections.sort(numerosDescrescente, Collections.reverseOrder());
        System.out.println(numerosDescrescente);

    }

    private static Integer getInputInteger() {
        String entrada = new Scanner(System.in).nextLine();
        return Integer.parseInt(entrada);
    }
}
