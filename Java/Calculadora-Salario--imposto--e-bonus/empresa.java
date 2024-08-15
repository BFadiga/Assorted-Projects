import java.text.DecimalFormat;
import java.util.Scanner;

public class empresa {
    

public static void main(String[] args) {
    DecimalFormat numberFormat = new DecimalFormat("#.00");
    Scanner scanner = new Scanner(System.in);

        System.out.print("Digite suas horas trabalhas no mês: ");
            float hora = scanner.nextFloat();

            System.out.print("Digite o valor da sua hora de trabalho: ");
            float valor = scanner.nextFloat();

// O aluno (eu) tomou a liberdade de fazer a interpretação de que assim como na legislatura brasileira, o imposto também incide sobre a gratificação.

            float salario = hora * valor;
            double bonus = salario * 0.05;
            double salariobruto = salario + bonus;
            double imposto = salariobruto * 0.15;
            double salarioliquido = salariobruto - imposto;


            System.out.print("E&A agradece por seu serviço. Seu salário será de: " + numberFormat.format(salarioliquido) + " R$");

    scanner.close();
            }}