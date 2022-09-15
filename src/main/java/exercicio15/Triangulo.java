package exercicio15;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[]args){
        triangulo();
    }

    public static void triangulo(){
        System.out.println("Digite um lado");
        Integer lado1 = getInputUsuario();
        Integer lado2 = getInputUsuario();
        Integer lado3 = getInputUsuario();


        if ((lado1 + lado2) > lado3 || (lado1 + lado3) > lado2 || (lado3 + lado2) > lado1){
            System.out.println("É um triangulo");
        }

        if (lado1 == lado2 && lado3 ==lado1){
            System.out.println("Equilatero");
        }

        if (lado1 == lado2 || lado3 ==lado1 || lado2 == lado2){
            if (lado1 != lado3 || lado2 != lado3)
                System.out.println("Isosceles");
        }

        if (lado1 != lado2 && lado3 !=lado1 && lado2 != lado3){
            System.out.println("Escaleno");
        }

    }

    private static Integer getInputUsuario() {
        String entrada1 = new Scanner(System.in).nextLine();
        return Integer.parseInt(entrada1);
    }
}
