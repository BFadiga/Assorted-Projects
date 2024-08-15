import java.text.DecimalFormat;
import java.util.Scanner;

public class calculanotas {
        public static void main(String[] args) {
    
    DecimalFormat numberFormat = new DecimalFormat("#.00");
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite sua nota de matemática ");
    double math = scanner.nextDouble();

    System.out.println("Digite sua nota de Português ");
    double PT = scanner.nextDouble();
    
    System.out.println("Digite sua nota de Inglês ");
    double ENG = scanner.nextDouble();

    System.out.println("Digite sua nota de Ed. Física ");
    double EDF = scanner.nextDouble();

    System.out.println("Digite sua nota de Filosofia ");
    double Filo = scanner.nextDouble();

    double[] notasAluno = {math, PT, ENG, EDF, Filo};

    double soma = 0;
    for (int i = 0; i < notasAluno.length; i++){
        soma += notasAluno[i];
    }

    double media = soma / notasAluno.length;

    if (media > 7.5) {
        System.out.println("Parabéns, você passou de ano com: " + numberFormat.format(media));
    }
    else{
        System.out.println("Sua média foi " + numberFormat.format(media) + ". Você não passou de ano.");
    }


}}