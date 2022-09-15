package exercicio20;

import java.util.Scanner;

public class Crime {
    public static void main(String[]args){
        crime();
    }

    public static void crime(){
        System.out.println("Telefonou para a vítima? ");
        String telefone = getInputUsuario();
        System.out.println("Esteve no local do crime? ");
        String local = getInputUsuario();
        System.out.println("Mora perto da vítima?  ");
        String residencia = getInputUsuario();
        System.out.println("Devia para a vítima? ");
        String dinheiro = getInputUsuario();
        System.out.println("Já trabalhou com a vítima?");
        String trabalho = getInputUsuario();

        Integer suspeito = 0;

        if (telefone.equals("S"))
            suspeito += 1;

        if (local.equals("S"))
            suspeito += 1;

        if (residencia.equals("S"))
            suspeito += 1;

        if (dinheiro.equals("S"))
            suspeito += 1;

        if (trabalho.equals("S"))
            suspeito += 1;

        System.out.println(suspeito);

        switch (suspeito){
            case 2: System.out.println("Suspeita"); break;
            case 3: System.out.println("Cumplice"); break;
            case 4: System.out.println("Cumplice"); break;
            case 5: System.out.println("Assassino"); break;
            default:
                System.out.println("Inocente"); break;
        }

    }

    private static String getInputUsuario() {
        return new Scanner(System.in).nextLine();
    }

}
