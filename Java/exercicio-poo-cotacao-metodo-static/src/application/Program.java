package application;

import java.util.Locale;
import java.util.Scanner;
import utilities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double dollarPrice, qtdDollar;
		
		System.out.print("Qual preço do dolar: ");
		dollarPrice = sc.nextDouble();
		System.out.print("Quantos dolares você quer converter? ");
		qtdDollar = sc.nextDouble();
			
		System.out.printf("Total com imposto: %.2f",CurrencyConverter.iof(CurrencyConverter.converter(dollarPrice, qtdDollar)));

		sc.close();
	}

}
