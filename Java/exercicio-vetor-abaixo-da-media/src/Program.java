import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantidade;
		double media, soma = 0;
		
		System.out.print("Digite a quantidade de elementos que o vetor mais receber: ");
		quantidade = sc.nextInt();
		sc.nextLine();
		
		double[] numeros = new double[quantidade];
		
		for(int i = 0; i < numeros.length; i++) {
			
			System.out.printf("Digite o %d° numero: %n", i+1);
			numeros[i] = sc.nextDouble();
			sc.nextLine();
			
			soma += numeros[i];
			
		}
		
		media = soma / quantidade;
		System.out.printf("Média do Vetor: %.3f%n", media);
		
		System.out.println("Elementos abaixo da média: ");
		
		for (int j = 0; j < numeros.length; j++) {
			
			if (numeros[j] < media) {
				System.out.println(numeros[j]);
			}
		}
		
		
		sc.close();
	}
}
