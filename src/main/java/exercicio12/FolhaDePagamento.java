package exercicio12;

import java.util.Scanner;

public class FolhaDePagamento {
    public static void main(String[] args) {
        pagamento();
    }

    public static void pagamento() {
        System.out.println("Digite o valor da sua hora");
        Double valorHora = getInputDouble();
        Double horasTrabalhadas = getInputDouble();

        Double salarioBruto = valorHora * horasTrabalhadas;
        double ir = 0;


        if (salarioBruto <= 900){
            ir = 0;
            System.out.println("(-) IR (5%): R$ " +ir);
        }

        if (salarioBruto > 900 && salarioBruto <= 1500){
            ir = salarioBruto * 0.05;
            System.out.println("(-) IR (5%): R$ " +ir);
        }

        if (salarioBruto > 1500 && salarioBruto <= 2500){
            ir = salarioBruto * 0.1;
            System.out.println("(-) IR (10%): R$ " +ir);
        }

        if (salarioBruto > 2500){
            ir = salarioBruto * 0.2;
            System.out.println("(-) IR (20%): R$ " +ir);
        }

        double inss = salarioBruto * 0.1;
        double fgts = salarioBruto * 0.11;
        double totalDeDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDeDescontos;
        System.out.println("Salario Bruto (" +horasTrabalhadas+ valorHora+ "): R$ " + salarioBruto);
        System.out.println("(-) INSS (10%): R$ " +inss);
        System.out.println("(-) FGTS (11%): R$ " +fgts);
        System.out.println("Total de descontos: R$ " +totalDeDescontos);
        System.out.println("Salario liquido: R$ " +salarioLiquido);
    }
    private static Double getInputDouble() {
        String entrada = new Scanner(System.in).nextLine();
        return Double.parseDouble(entrada);
    }
}
