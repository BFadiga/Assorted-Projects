import java.util.Scanner;

public class cafinho {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    System.out.println("Qual tamanho de café você deseja dentre: ");
    System.out.println("P - Pequeno");
    System.out.println("M - Médio");
    System.out.println("Q - Grande");
    String tipo = scanner.next();

    System.out.println("Escolha agora o tipo: ");
    System.out.println("E - Expresso");
    System.out.println("C - Cappuccino ");
    System.out.println("L - Latte");
    String cafe = scanner.next();

    double preço = 0;



        switch(tipo){
            case "P":
                preço += 2.50;
                break;
            case "M":
                preço += 3.00;
                break;
            case "G":
                preço += 3.50;
                break;
                default:
                System.out.println("Erro!");
                return;
            }

        switch(cafe){
                case "E":
            preço += 1.50;
            break;
                case "C":
            preço += 2.00;
            break;
                case "L":
            preço += 2.50;
            break;
        default:
        System.out.println("Erro!");
    return;
}

System.out.println("Obrigado por selecionar um" + cafe + tipo + ", o seu total devido será: " + preço);
}}
