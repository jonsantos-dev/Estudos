import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int quantidade, soma=0;
        double media;
        
        System.out.print("Informe quantos numeros deseja digitar: ");
        quantidade = sc.nextInt();
        sc.nextLine();
        int[] numeros = new int[quantidade];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o numero que ficará na %d° posicao: ", i+1);
            numeros[i] = sc.nextInt();
            sc.nextLine();
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%d ",numeros[i]);
            soma += numeros[i];
        }

        media = (double) soma / numeros.length;
        System.out.printf("%nSoma: %d%n", soma);
        System.out.printf("Media: %.2f", media);








        sc.close();
    }
}
