import java.util.Scanner;

public class calculadora {
        public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o número de uma das opções: ");
    System.out.println("1 - Soma");
    System.out.println("2 - Subtração");
    System.out.println("3 - Divisão");
    System.out.println("4 - Multiplicação");
    int escolha = scanner.nextInt();

    System.out.println("Escolha dois números: ");
    System.out.println("Número A: ");
    float numA = scanner.nextFloat();
    System.out.println("Número B: ");
    float numB = scanner.nextFloat();

    float resultado = 0;

    switch (escolha) {
        case 1:
            resultado = numA + numB;
            System.out.println("O resultado será: " + resultado);
            break;
        case 2:
            resultado = numA - numB;
            System.out.println("O resultado será: " + resultado);
            break;
        case 3:
            resultado = numA / numB;
            System.out.println("O resultado será: " + resultado);
            break;
        case 4:
            resultado = numA * numB;
            System.out.println("O resultado será: " + resultado);
            break;

        default:
        System.out.println("Operação inválida!");
            break;
    }


}
}
