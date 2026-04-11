package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int quantidade;
		
		do {
			System.out.print("Quantos numeros deseja inserir? (1 a 10): ");
			quantidade = sc.nextInt();
			sc.nextLine();
			
			if(!(quantidade > 0 && quantidade <= 10)) {
				System.out.println("Valor informado fora do intervalo (1 a 10), vamos tentar novamente.");
				
			}
			
		} while(!(quantidade > 0 && quantidade <= 10));
		
		int[] numeros = new int[quantidade];
		
		 for (int i = 0; i < numeros.length; i ++) {
			 
			 System.out.printf("Digite o %d numero: ", i+1);
			 numeros[i] = sc.nextInt();
			 sc.nextLine();
		 }
		 
		 for (int i = 0; i < numeros.length; i ++) {
			 if (numeros[i] < 0) {
				 System.out.println(numeros[i]);
			 }

		 }
		
		sc.close();
	}

}
