package exercicio10;

import java.util.Scanner;

public class Turno {
    public static void main(String[] args) {
        turno();
    }

    public static void turno() {
        System.out.println("Digite uma letra");
        String letra = new Scanner(System.in).nextLine();

        switch (letra){
            case "M": System.out.println("Bom dia"); break;
            case "V": System.out.println("Boa tarde"); break;
            case "N": System.out.println("Boa noite"); break;
            default: System.out.println("Turno invalido"); break;
        }
    }
}
