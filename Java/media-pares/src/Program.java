import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		 int quantidade;
		 double mediaPares, somaPares = 0, contadorPar = 0;
		
		 System.out.print("Quantos elementos o vetor vai ter? ");
		 quantidade = sc.nextInt();
		 sc.nextLine();
		 
		 int[] numeros = new int[quantidade];
		 		 
		 for (int i = 0; i < numeros.length; i++) {
			 
			 System.out.printf("Digite o %d° numero: ", i+1);
			 numeros[i] = sc.nextInt();
			 sc.nextLine();
			 
			 if (numeros[i] % 2 == 0) {
				 somaPares += numeros [i];
				 contadorPar += 1;
			 }
		 }
		 
		 if (somaPares == 0) {
			 System.out.println("Nenhum numero par encontrado");
		 } else {
			 mediaPares = somaPares / contadorPar;
			 System.out.printf("media dos pares: %.1f", mediaPares);
		 }
		 
		 
		sc.close();		
	}
}
