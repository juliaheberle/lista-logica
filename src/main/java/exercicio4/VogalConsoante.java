package exercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VogalConsoante {
    public static void main(String[] args) {
        letraArray();
        letra();
    }

    public static void letra(){
        System.out.println("Digite uma letra");
        String letra = getInputString();

        if (letra == "A" || letra == "E" || letra == "I" || letra == "O" || letra == "U"){
            System.out.println("A letra "+letra+ " é vogal");
        }else {
            System.out.println("A letra "+letra+ " é consoante");
        }
    }

    private static String getInputString() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }

    public static void letraArray(){
        System.out.println("Digite uma letra");
        String letra = getInputString();

        String[] vogais = {"A", "E", "I", "O", "U"};
        for (int i= 0; i<vogais.length; i++)
            if (letra.equals(vogais[i])){
                System.out.println("É vogal");
            }else {
                System.out.println("É consoante");
            }
    }
}
