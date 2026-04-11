import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int quantidade, posicao = 0;
        double maiorValor = 0;

        System.out.print("Digite a quantidade de numeros que deseja digitar: ");
        quantidade = sc.nextInt();
        sc.nextLine();
        double numeros[] = new double[quantidade];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %d° numero: ", i+1);
            numeros[i] = sc.nextDouble();
            sc.nextLine();

            if (i == 0) {
                maiorValor = numeros[0];
                posicao = i;
            } else if (numeros[i] > maiorValor) {
                maiorValor = numeros[i];
                posicao = i;
            }

        }

        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Posição do vetor: " + posicao);

        sc.close();

    }
}
