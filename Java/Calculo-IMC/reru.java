import java.text.DecimalFormat;
import java.util.Scanner;


// IMC detector

    public class reru {

        public static void main(String[] args) {
            DecimalFormat numberFormat = new DecimalFormat("#.00");
            Scanner scanner = new Scanner(System.in);

                System.out.print("Digite seu peso (kg): ");
                    float peso = scanner.nextFloat();

                    System.out.print("Digite sua altura (metro): ");
                    float altura = scanner.nextFloat();

                        float IMC = peso / (altura * altura);

                            float baixopeso = 18.5f / altura * altura;
                            float bompeso = 24.9f / altura * altura;
                            float sobrepeso = 29.9f / altura * altura;
                            float obeso1 = 34.9f / altura * altura;
                            float obeso2 = 39.9f / altura * altura;
                            float obesoEX = 40f / altura * altura;

                            if (IMC < baixopeso) {
                                System.out.println("Seu IMC é: " + numberFormat.format(IMC) + " e a sua classificação é de baixo peso.");
                            }
                            else if (IMC <= bompeso) {
                                System.out.println("Seu IMC é: " + numberFormat.format(IMC) + " e a sua classificação é de eutrofia (peso adequado).");
                            }
                            else if (IMC <= sobrepeso) {
                                System.out.println("Seu IMC é: " + numberFormat.format(IMC) + " e a sua classificação é de sobrepeso.");
                            }
                            else if (IMC <= obeso1){
                                System.out.println("Seu IMC é: " + numberFormat.format(IMC) + " e a sua classificação é de obesidade grau 1.");
                            }
                            else if (IMC <= obeso2){
                                System.out.println("Seu IMC é: " + numberFormat.format(IMC) + " e a sua classificação é de obesidade grau 2.");
                            }
                            else if (IMC >= obesoEX){
                                System.out.println("Seu IMC é: " + numberFormat.format(IMC) + " e a sua classificação é de obesidade extrema.");
                            };
            scanner.close();
    }}


// Salários






    // public class reru {
    //     public static void main(String[] args) {
    //         Scanner scanner = new Scanner(System.in);
    //             System.out.print("Digite à quantia de dólares desejada: ");
    //                 int dolar = scanner.nextInt();
    //             System.out.print("Digite a atual taxa de câmbio: ");
    //                 float taxa = scanner.nextFloat();
    //                     double real = dolar / taxa;
    //                     System.out.println("O total devido em reais é: " + real);
    //         scanner.close();
    // }}

    // public class reru{
    //     public static void main(String[] args) {
    //         double resultado = 10.0 % 3;
    //         System.out.print(resultado);
    //         int rEsultado = 10 % 3;
    //         System.out.print(rEsultado);
    //         double resUltado = 10 / 3;
    //         System.out.print(resUltado);
    //         int resuLtado = 10 / 3;
    //         System.out.print(resuLtado);
    //     }
    // }
