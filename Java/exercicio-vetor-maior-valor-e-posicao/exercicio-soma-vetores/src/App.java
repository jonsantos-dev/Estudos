import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidade, valorDigitado;
        System.out.print("Quantos valores cada vetor vai ter? ");
        quantidade = sc.nextInt();
        sc.nextLine();

        int[] vetA = new int[quantidade];
        int[] vetB = new int[quantidade];
        int[] vetC = new int[quantidade];

       for (int i = 0; i < quantidade * 2; i++) {
            if (i == 0) {
                System.out.println("Digite os valores de A:");
            }

            if(i < quantidade) {
                
                valorDigitado = sc.nextInt();
                sc.nextLine();
                vetA[i] = valorDigitado;
                vetC[i] = valorDigitado;
            }

            if (i == quantidade-1) {
                System.out.println("Digite os valores de B");

            } else if (i >= quantidade) {
                valorDigitado = sc.nextInt();
                sc.nextLine();
                vetB[i-quantidade] = valorDigitado;
                vetC[i-quantidade] += valorDigitado;
            }
       }

        System.out.println("Valores somados");
        for (int j = 0; j < vetC.length; j++) {
            System.out.println(vetC[j]);
        }

        sc.close();
    }
}
