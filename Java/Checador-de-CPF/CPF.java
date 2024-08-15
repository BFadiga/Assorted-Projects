import java.text.DecimalFormat;
import java.util.Scanner;

public class CPF {
            public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Qual o seu CPF? Digite número por número (número, enter, número, enter, etc) ");
    int CPF1 = scanner.nextInt();
    int CPF2 = scanner.nextInt();
    int CPF3 = scanner.nextInt();
    int CPF4 = scanner.nextInt();
    int CPF5 = scanner.nextInt();
    int CPF6 = scanner.nextInt();
    int CPF7 = scanner.nextInt();
    int CPF8 = scanner.nextInt();
    int CPF9 = scanner.nextInt();
    int CPF10 = scanner.nextInt();
    int CPF11 = scanner.nextInt();




    int CPF[] = {CPF1, CPF2, CPF3, CPF4, CPF5, CPF6, CPF7, CPF8, CPF9, CPF10, CPF11};
    int multi1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int multi2[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    int omegaresult1 = 0;
    for (int i = 0; i < multi1.length; i++){
        int result1 = CPF[i] * multi1[i];
        omegaresult1 += result1;
        }
    
    int supremeresult1 = omegaresult1 % 11;

    if (supremeresult1 == 10){
        supremeresult1 = 0;
    }


    var valid1 = false;

    if (CPF10 == supremeresult1){
        valid1 = true;
    }

    int omegaresult2 = 0;
    for (int n = 0; n < multi2.length; n++) {
            int result2 = CPF[n] * multi2[n];
            omegaresult2 += result2;
    }

    int supremeresult2 = omegaresult2 % 11;

    if (supremeresult2 == 10) {
        supremeresult2 = 0;
    }

    var valid2 = false;

    if (CPF11 == supremeresult2){
        valid2 = true;
    }

    String estado = "";
    switch(CPF9){
        case 1:
            estado = "Distrito Federal, Goiás, Mato Grosso do Sul e Tocantins";
            break;
        case 2:
            estado = "Pará, Amazonas, Acre, Amapá, Rondônia e Roraima";
            break;
        case 3:
            estado = "Ceará, Maranhão e Piauí";
            break;
        case 4:
            estado = "Pernambuco, Rio Grande do Norte, Paraíba e Alagoas";
            break;
        case 5:
            estado = "Bahia e Sergipe";
            break;
        case 6:
            estado = "Minas Gerais";
            break;
        case 7:
            estado = "Rio de Janeiro e Espírito Santo";
            break;
        case 8:
            estado = "São Paulo";
            break;
        case 9:
            estado = "Paraná e Santa Catarina";
            break;
        case 0:
            estado = "Rio Grande do Sul";
            break;
    }

    if(CPF1 == CPF2 && CPF2 == CPF3 && CPF4 == CPF5 && CPF5 == CPF6 && CPF7 == CPF8 && CPF8 == CPF9 && CPF9 == CPF10 && CPF10 == CPF11){
        valid1 = false;
        valid2 = false;
    }

    if (valid1 && valid2 == true){
        System.out.println("O seu CPF é válido, e você provem da(s) região(ões): " + estado);
    }
    else{
        System.out.println("O seu CPF não é válido.");
    }
}}
