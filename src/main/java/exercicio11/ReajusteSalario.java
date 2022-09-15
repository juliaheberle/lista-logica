package exercicio11;

import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {
        reajuste();
    }

    public static void reajuste() {
        System.out.println("Digite seu salario");
        Double salario = getInputDouble();

        System.out.println("O salario atual é: " +salario);

        Double percentualDeAumento = 0.;
        Double salarioReajustado = 0.;
        String percetualDeAumento = "";

        if (salario > 0 && salario <= 280){
            percentualDeAumento = 0.2;
            percetualDeAumento = "20%";
        } else if (salario > 280 && salario <= 700){
            percentualDeAumento =  0.15;
            percetualDeAumento = "15%";
        } else if (salario > 700 && salario <= 1500){
            percentualDeAumento = 0.10;
            percetualDeAumento = "10%";
        } else  if (salario > 1000) {
            percentualDeAumento = 0.05;
            percetualDeAumento = "5%";
        }

        Double aumentoTotal = salario * percentualDeAumento;
        salarioReajustado = aumentoTotal + salario;
        System.out.println("O percentual de reajuste foi de: " + percetualDeAumento);


        System.out.println("O valor do aumento foi de: " +aumentoTotal);
        System.out.println("O salario reajustado é: " +salarioReajustado);
    }
    private static Double getInputDouble() {
        String entrada = new Scanner(System.in).nextLine();
        return Double.parseDouble(entrada);
    }
}
