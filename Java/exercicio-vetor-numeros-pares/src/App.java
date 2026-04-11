import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int quantidade, qtdPares = 0;

        System.out.println("Digite quantos numeros deseja digitar: ");
        quantidade = sc.nextInt();
        sc.nextLine();
        int[] numeros = new int[quantidade];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %d° numero: %n", i+1);
            numeros[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Numeros pares: ");

        for (int j = 0; j < numeros.length; j++) {
            if (numeros[j] % 2 == 0) {
                System.out.print(" " + numeros[j]);
                qtdPares += 1;
            }
        }

        System.out.printf("%nQuantidade de pares: %d", qtdPares);


        sc.close();
    }
}
